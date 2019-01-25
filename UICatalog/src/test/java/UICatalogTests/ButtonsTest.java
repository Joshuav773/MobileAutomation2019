package UICatalogTests;

import buttons.ButtonsOption;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends ButtonsOption {

    ButtonsOption buttonsOption;

    @BeforeMethod
    public void initElements() throws InterruptedException {
        buttonsOption = PageFactory.initElements(ad, ButtonsOption.class);
    }
    @Test
    public void buttonsTest() {
        selectButtons();
    }
    @Test
    public void grayButtonTest() {
        changeImageTogray();
    }
    @Test
    public void clickRoundedButtonOption(){
        roundedButtonOption();
    }
}
