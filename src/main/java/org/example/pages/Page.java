package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver,15);
        actions = new Actions(this.driver);
        PageFactory.initElements(driver, this);
    }

    public abstract String getPageTitle();

    public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass)
    {
        try {
            return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
