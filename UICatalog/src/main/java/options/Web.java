package options;

import base.CommonAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Web extends CommonAPI {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Use of UIWebView\"]")
    public static WebElement web;

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Global, navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]\n" +
            "\n")
    public static WebElement website;

    public void webHome () {
        web.click();
    }
    public void appleWebsite() {
        website.click();
    }
}
