package UICatalogTests;

import options.Controls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTests extends Controls {

    Controls controls;

    @BeforeMethod
    public void initElements(){
        controls = PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void standardSwitchTest(){
        setStandardSwitch();
    }
    @Test
    public void standardSliderTest(){
        setStandarSlider();
    }
    @Test
    public void customizedSliderTest(){
        setCustomizedSlider();
    }
    @Test
    public void UIStepperTest(){
        setUIStepper();
    }
}
