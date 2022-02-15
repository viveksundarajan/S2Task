package org.examples;

import org.example.pages.HoverPage;
import org.junit.Assert;
import org.junit.Test;
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
        Assert.assertTrue(hoverPage.getUserName().contains(userName));
    }
}
