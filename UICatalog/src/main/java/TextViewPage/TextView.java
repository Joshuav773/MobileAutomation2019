package TextViewPage;

import base.CommonAPI;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextView  extends CommonAPI {

    public void textViewButton(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"TextView\"]");
    }

}
