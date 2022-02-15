package org.example.pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagePage extends BasePage{

    Response response;

    public BrokenImagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='example']/img")
    private List<WebElement> images;

    public List<WebElement> getImages()
    {
        return images;
    }

    public boolean isImageNotBroken() {

        boolean flag = true;

        for (int i =0 ; i < getImages().size() ; i++ ) {

            response = RestAssured.given().contentType("application/json").get(getImages().get(i).getAttribute("src"));

            if(response.getStatusCode() > 400) {
                System.out.println(response.getStatusCode());
                flag = false;
                break;
            }
        }
        return flag;
        }
}
