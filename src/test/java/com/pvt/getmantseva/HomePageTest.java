package com.pvt.getmantseva;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import java.util.List;

import com.pvt.getmantseva.pageobject.CatalogPage;
import com.pvt.getmantseva.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    private final OnlinerHomePage onlinerHomePage = new OnlinerHomePage();
    private final CatalogPage catalogPage = new CatalogPage();

    @Test
    @Tag("test1")
    public void testUserIsAbleToSawSectionsOfCatalog() {
        List<String> catalogMenuSections = onlinerHomePage
                .clickOnCatalogNavigationLink()
                .getCatalogMenuSectionsTitle();
        assertThat(catalogMenuSections)
                .as("Sections of menu Catalog is not displayed")
                .allMatch(element -> element != null);
        System.out.println(catalogMenuSections);
    }
}