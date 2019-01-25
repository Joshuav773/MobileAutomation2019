package options;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Controls extends CommonAPI {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")public static WebElement standardSwitch;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")public static WebElement standarSlider;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Custom\"]") public static WebElement customizedSlider;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Stepper 1 to 10\"]")public static WebElement UIStepper;

    public void setStandardSwitch(){
        standardSwitch.click();
    }
    public void setStandarSlider(){
        standarSlider.click();
    }
    public void setCustomizedSlider(){
        customizedSlider.click();
    }
    public void setUIStepper(){
        UIStepper.click();
    }
}
