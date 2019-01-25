package UICatalogTests;

import options.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UITest extends NavigateUi {

    NavigateUi navigateUi;

    @BeforeMethod
    public void initElements(){
        navigateUi = PageFactory.initElements(ad, NavigateUi.class);
    }
    @Test
    public void clickOnElementsTest() throws InterruptedException{
        clicks();
    }
}
