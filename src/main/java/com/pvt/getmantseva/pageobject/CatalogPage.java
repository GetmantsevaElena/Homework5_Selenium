package com.pvt.getmantseva.pageobject;

import java.util.List;

import com.pvt.getmantseva.framework.BasePage;
import org.openqa.selenium.By;

public class CatalogPage extends BasePage {

    private static final String CATALOG_TITLE_MENU_SECTIONS =
            "//*[@class='catalog-navigation-classifier__item-title-wrapper']";
    private static final String CATALOG_CLASSIFIER_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'catalog-navigation-classifier__item ')]//*[contains(text(), '%s')]";
    private static final String CATEGORY_MENU_SECTIONS_TITLE =
            "//*[@class='catalog-navigation-list__category' and @data-id='2']//*[@class='catalog-navigation-list__aside-item']";
    private static final String CATEGORY_CLASSIFIER_LINK_XPATH_PATTERN =
            "//*[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
    private static final String PRODUCT_TITLE_LINK_XPATH_PATTERN =
            "//div[@class='catalog-navigation-list__aside-title' and contains(text(), 'Комплектующие') and not (contains(text(), 'Комплектующие для'))]//following-sibling::div[@class='catalog-navigation-list__dropdown']//a//*[contains(@class, 'title')]";
    private static final String PRODUCT_DESCRIPTION_LINK_XPATH_PATTERN =
            "//div[@class='catalog-navigation-list__aside-title' and contains(text(), 'Комплектующие') and not (contains(text(), 'Комплектующие для'))]//following-sibling::div[@class='catalog-navigation-list__dropdown']//a//*[contains(@class, 'description')and contains(text(),'товар')]";

    public CatalogPage clickOnCatalogClassifierLink(String link) {
        waitForElementVisible(By.xpath(String.format(CATALOG_CLASSIFIER_LINK_XPATH_PATTERN, link)))
                .click();
        return this;
    }

    public List<String> getCatalogMenuSectionsTitle() {
        return getTextsFromWebElements(waitForElementsVisible(By.xpath(CATALOG_TITLE_MENU_SECTIONS)));
    }

    public List<String> getCategoryMenuSectionsTitle() {
        return getTextsFromWebElements(waitForElementsVisible(By.xpath(CATEGORY_MENU_SECTIONS_TITLE)));
    }

    public CatalogPage clickOnComputerAndNetworkClassifierLink(String link) {
        waitForElementVisible(By.xpath(String.format(CATEGORY_CLASSIFIER_LINK_XPATH_PATTERN, link)))
                .click();
        return this;
    }

    public List<String> getProductListSectioinsAccessoriesTitle() {
        return getTextsFromWebElements(waitForElementsVisible(By.xpath(PRODUCT_TITLE_LINK_XPATH_PATTERN)));
    }

    public List<String> getProductListSectioinsAccessoriesDescriptions() {
        return getTextsFromWebElements(waitForElementsVisible(By.xpath(PRODUCT_DESCRIPTION_LINK_XPATH_PATTERN)));
    }
}
