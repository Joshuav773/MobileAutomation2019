package buttons;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsOption extends CommonAPI {

    @FindBy(xpath ="(//XCUIElementTypeButton[@name=\"More Info\"])[1]") public static WebElement buttonsArrow;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")public static WebElement grayButton;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]\n")public static WebElement roundedButton;

    public void selectButtons(){
        buttonsArrow.click();
    }
    public void changeImageTogray(){
        buttonsArrow.click();
        grayButton.click();
    }
    public void roundedButtonOption(){
        buttonsArrow.click();
        roundedButton.click();
    }
}
