package UICatalogTests;

import options.TextView;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextViewButtonTest extends TextView {

    TextView textView;

    @BeforeMethod
    public void initElements(){
        textView = PageFactory.initElements(ad, TextView.class);
    }
    @Test
    public void TextViewTest(){
        clickTextViewButton();
    }
}
