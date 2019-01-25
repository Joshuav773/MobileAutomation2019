package UICatalogTests;

import options.Toolbar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolBarTests extends Toolbar {

    Toolbar toolbar;

    @BeforeMethod
    public void initElements(){
        toolbar = PageFactory.initElements(ad, Toolbar.class);
    }
    @Test
    public void imageTest(){
        setImage();
    }
    @Test
    public void doneTest(){
        setDone();
    }
    @Test
    public void tintedTest(){
        setTinted();
    }
    @Test
    public void styleDefaultTest(){
        setStyleDefault();
    }
    @Test
    public void styleBlackTest(){
        setStyleBlack();
    }
    @Test
    public void styleTranslucent(){
        setStyleTranslucent();
    }
    @Test
    public void item1Test(){
        setItem1();
    }
    @Test
    public void item2Test(){
        setItme2();
    }
    @Test
    public void toolsTest(){

    }
}
