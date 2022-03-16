package com.pvt.getmantseva.navigation;

import com.pvt.getmantseva.pageobject.OnlinerHomePage;

public class OnlinerNavigation {

    public static void navigateToOnlinerHomePage() {
        new OnlinerHomePage().navigate("https://www.onliner.by/");
    }
}

