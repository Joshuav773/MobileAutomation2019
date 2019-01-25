package UICatalogTests;

import options.Segments;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SegmentsTests extends Segments {

    Segments segments;

    @BeforeMethod
    public void initElements(){
        segments = PageFactory.initElements(ad, Segments.class);
    }
    @Test
    public void uISegmentControlTest(){
        setUiSegmentControl();
    }
    @Test
    public void uISegmentControlStyleBordered(){
        setUiSegmentControlStyleBordered();
    }
    @Test
    public void uISegmentControlStyleBar(){
        setUiSegmentControlStyleBar();
    }
    @Test
    public void uISegmentControlStyleBarTint(){
        setUiSegmentControlStyleBarTint();
    }
    @Test
    public void uISegmentControlStyleBarImage(){
        setUiSegmentcontrolStyleBarImage();
    }
}
