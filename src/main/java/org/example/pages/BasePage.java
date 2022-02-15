package org.example.pages;

import org.openqa.selenium.WebDriver;

public class BasePage extends Page{

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }
}
