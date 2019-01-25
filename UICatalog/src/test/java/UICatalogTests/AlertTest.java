package UICatalogTests;

import options.Alerts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends Alerts {

    Alerts alerts;

    @BeforeMethod
    public void initElements(){
        alerts = PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void uIActionSheetSimpleTest(){
        showUIActionSheetSimple();
    }
    @Test
    public void uIActionSheetOkCancelTest(){
        showUIActionSheetOkCancel();
    }
    @Test
    public void uIActionSheetCustomizedTest(){
        showUIActionSheetCustomized();
    }
    @Test
    public void uIAlertSimpleTest(){
        showUIAlertSimple();
    }
    @Test
    public void uIAlertOkCancelTest(){
        showUIAlertOkCancel();
    }
    @Test
    public void uIAlertCustomTest(){
        showUIAlertCustomized();
    }
    @Test
    public void uISecureTextInputTest(){
        showUISecureTextInput();
    }
}
