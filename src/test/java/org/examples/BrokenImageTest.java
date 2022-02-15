package org.examples;

import org.example.pages.BrokenImagePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseInit;

import java.io.IOException;

public class BrokenImageTest extends BaseInit {

    public BrokenImageTest() throws IOException {
        super();
    }

    @Test
    public void verifyBrokenImages() {
        driver.get(URL+"broken_images");
        BrokenImagePage brokenImagePage =  page.getInstance(BrokenImagePage.class);

        Assert.assertTrue(brokenImagePage.isImageNotBroken() , "images are broken");
    }
}
