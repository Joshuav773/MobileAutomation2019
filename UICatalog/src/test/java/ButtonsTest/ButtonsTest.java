package ButtonsTest;

import Buttons.ButtonsOption;
import ButtonsPage.Buttons;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends ButtonsOption {

    ButtonsOption buttonsOption;

    @BeforeMethod
    public void navigate()throws InterruptedException {
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        buttonsOption = PageFactory.initElements(ad, ButtonsOption.class);
    }
    @Test
    public void buttonsTest(){
        selectButtons();
    }
    @Test
    public void grayButtonTest(){
        changeImageTogray();
    }
}
