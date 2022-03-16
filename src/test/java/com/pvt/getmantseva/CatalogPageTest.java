package com.pvt.getmantseva;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import java.util.List;

import com.pvt.getmantseva.pageobject.CatalogPage;
import com.pvt.getmantseva.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CatalogPageTest extends BaseTest {

    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();
    private CatalogPage catalogPage = new CatalogPage();

    @Test
    @Tag("test2")
    public void testUserIsAbleToSawNameCountAndPriceINEachITemAccessories() {
        List<String> productsTitlesOfSectioinsAccessories = onlinerHomePage
                .clickOnCatalogNavigationLink()
                .clickOnCatalogClassifierLink("Компьютеры и\u00a0сети")
                .clickOnComputerAndNetworkClassifierLink("Комплектующие")
                .getProductListSectioinsAccessoriesTitle();
        assertThat(productsTitlesOfSectioinsAccessories)
                .as("Title Of Product Sections Accessories is not displayed")
                .allMatch(element -> element != null);
        System.out.println(productsTitlesOfSectioinsAccessories);
        List<String> productDescriptionsOfSectioinsAccessories = catalogPage
                .getProductListSectioinsAccessoriesDescriptions();
        assertThat(productDescriptionsOfSectioinsAccessories)
                .as("Descriptions Of Product Sections Accessories is not displayed")
                .allMatch(element -> element != null);
        System.out.println(productDescriptionsOfSectioinsAccessories);
    }


    @Test
    @Tag("test2")
    public void testUserIsAbleToOpenTheDirectorySectionComputersAndNetworks() {
        List<String> computerAndNetworksMenuSectioins = onlinerHomePage
                .clickOnCatalogNavigationLink()
                .clickOnCatalogClassifierLink("Компьютеры и\u00a0сети")
                .getCategoryMenuSectionsTitle();
        assertThat(computerAndNetworksMenuSectioins)
                .as("Sections of menu Computer and Networks is not displayed")
                .isNotEmpty()
                .contains("Ноутбуки, компьютеры, мониторы", "Комплектующие", "Хранение данных", "Сетевое оборудование");
        System.out.println(computerAndNetworksMenuSectioins);
    }
}