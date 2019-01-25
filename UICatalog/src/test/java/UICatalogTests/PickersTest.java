package UICatalogTests;

import options.Picker;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PickersTest extends Picker {

    Picker picker;

    @BeforeMethod
    public void initElememts(){
        picker = PageFactory.initElements(ad, Picker.class);
    }
    @Test
    public void ToolBarUIPicker(){
        getUIPicker();
    }
    @Test
    public void toolBarUIDatePicker(){
        getUIDatePicker();
    }
    @Test
    public void toolBarUICustom(){
        getCustom();
    }
}
