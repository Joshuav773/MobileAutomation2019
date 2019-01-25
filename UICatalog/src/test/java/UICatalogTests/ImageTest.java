package UICatalogTests;

import options.Images;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImageTest extends Images {

    Images images;

    @BeforeMethod
    public void initElements(){
        images = PageFactory.initElements(ad, Images.class);
    }
    @Test
    public void imageSliderTest(){
        slideImageDurationFunction();
    }
}
