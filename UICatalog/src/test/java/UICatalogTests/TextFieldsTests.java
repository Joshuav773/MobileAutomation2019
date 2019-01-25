package UICatalogTests;

import options.TextFields;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextFieldsTests extends TextFields {

    TextFields textFields;

    @BeforeMethod
    public void initElements(){
        textFields = PageFactory.initElements(ad, TextFields.class);
    }
    @Test
    public void TypingText(){
        writeTextToFields();
    }
}
