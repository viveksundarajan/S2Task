package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HoverPage extends BasePage{

    public HoverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='figure']")
    private WebElement image;

    @FindBy(xpath = "//div[@class='figcaption']/h5")
    private WebElement userName;

    public void mouseHoverImage()
    {
        Actions action = new Actions(driver);
        action.moveToElement(image).build().perform();
    }

    public String getUserName() {
        return userName.getText();
    }
}
