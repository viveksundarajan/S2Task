package org.examples;

import org.example.pages.BasicAuthPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseInit;

import java.io.IOException;

public class BasicAuthTest extends BaseInit {

    public BasicAuthTest() throws IOException {
        super();
    }

    @Test
    public void verifyBasicAuth() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        BasicAuthPage basicAuthPage = page.getInstance(BasicAuthPage.class);
        Assert.assertTrue(basicAuthPage.getPageMessage().equals(expectedMessage));
    }

}
