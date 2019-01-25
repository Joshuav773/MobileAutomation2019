package options;

import base.CommonAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Images extends CommonAPI {

   @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Duration\"]")public static WebElement imageDuration;

    public void slideImageDurationFunction(){
        imageDuration.click();
    }
}
