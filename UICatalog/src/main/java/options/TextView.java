package options;

import base.CommonAPI;

public class TextView  extends CommonAPI {

    public void clickTextViewButton(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"TextView\"]");
    }

}
