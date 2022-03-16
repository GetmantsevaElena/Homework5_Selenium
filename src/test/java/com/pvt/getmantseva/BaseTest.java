package com.pvt.getmantseva;

import org.assertj.core.api.SoftAssertions;
import com.pvt.getmantseva.navigation.OnlinerNavigation;
import com.pvt.getmantseva.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {

    private final OnlinerHomePage onlinerHomePage = new OnlinerHomePage();
    public final SoftAssertions softAssertions = new SoftAssertions();

    @BeforeEach
    public void navigateToOnliner() {
        OnlinerNavigation.navigateToOnlinerHomePage();
    }

    @AfterEach
    public void closeBrowser() {
        onlinerHomePage.closeBrowser();
    }
}
