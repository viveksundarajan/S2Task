package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends BasePage {

    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "p")
    private WebElement pageMessage;

    public String getPageMessage()
    {
        return pageMessage.getText();
    }
}
