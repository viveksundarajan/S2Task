package utilities;

import org.example.pages.BasePage;
import org.example.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseInit {

    public WebDriver driver;
    public Page page;
    public String URL;
    public String expectedMessage;
    public String userName;
    public String SLIDER_MIN_VALUE;
    public String SLIDER_MAX_VALUE;

    public BaseInit() throws IOException {

        Properties prop=new Properties();
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//src//config.properties");
        prop.load(file);
        URL = prop.getProperty("url");
        expectedMessage = prop.getProperty("expectedMessage");
        userName = prop.getProperty("userName");
        SLIDER_MIN_VALUE = prop.getProperty("SLIDER_MIN_VALUE");
        SLIDER_MAX_VALUE = prop.getProperty("SLIDER_MAX_VALUE");
    }


    @BeforeMethod
    @Parameters(value ="browserName")
    public WebDriver invokeBrowser(String browserName)
    {
        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
            driver= new ChromeDriver();
        }
        else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//geckodriver");
            driver= new FirefoxDriver();
        }
        page = new BasePage(driver);
        return driver;
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
