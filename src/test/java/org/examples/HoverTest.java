package org.examples;

import org.example.pages.HoverPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseInit;

import java.io.IOException;

public class HoverTest extends BaseInit {

    public HoverTest() throws IOException {
        super();
    }

    @Test
    public void verifyHoverOnUser() {
        driver.get(URL + "hovers");

        HoverPage hoverPage = page.getInstance(HoverPage.class);
        hoverPage.mouseHoverImage();
        System.out.println(hoverPage.getUserName());
        Assert.assertTrue(hoverPage.getUserName().contains(userName));
    }
}
