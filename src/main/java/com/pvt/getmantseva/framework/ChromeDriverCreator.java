package com.pvt.getmantseva.framework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverCreator implements WebDriverCreator<RemoteWebDriver> {
    @Override
    public ChromeDriver create() {
        return new ChromeDriver();
    }
}
