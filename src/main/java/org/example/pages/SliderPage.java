package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage {

    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='range']")
    private WebElement slider;

    @FindBy(xpath = "//span[@id='range']")
    private WebElement sliderValue;

    public WebElement getSlider()
    {
        return slider;
    }

    public String getSliderValue()
    {
        return sliderValue.getText();
    }

    public void moveSliderToMax() {
        actions.dragAndDropBy(getSlider(), 100, 0).perform();
    }
}
