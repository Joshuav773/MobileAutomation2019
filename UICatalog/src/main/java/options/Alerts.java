package options;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Alerts extends CommonAPI {

    public void showUIActionSheetSimple(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]");
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getText();
        String Expected ="UIActionSheet <title>";
        Assert.assertEquals(Expected, Actual);
    }
    public void showUIActionSheetOkCancel(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]");
    }
    public void showUIActionSheetCustomized(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]");
    }
    public void showUIAlertSimple(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]");
    }
    public void showUIAlertOkCancel(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[9]");
    }
    public void showUIAlertCustomized(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[11]");
    }
    public void showUISecureTextInput(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[13]");
    }
}
