package org.examples;

import org.example.pages.SliderPage;
import org.junit.Assert;
import org.testng.annotations.Test;
import utilities.BaseInit;

import java.io.IOException;

public class SliderTest extends BaseInit {

    public SliderTest() throws IOException {
        super();
    }

    @Test
    public void verifySliderValues() {
        driver.get(URL+"horizontal_slider");
        SliderPage sliderPage = page.getInstance(SliderPage.class);

        Assert.assertTrue(sliderPage.getSliderValue().equals(SLIDER_MIN_VALUE));
        sliderPage.moveSliderToMax();
        Assert.assertTrue(sliderPage.getSliderValue().equals(SLIDER_MAX_VALUE));
    }

}
