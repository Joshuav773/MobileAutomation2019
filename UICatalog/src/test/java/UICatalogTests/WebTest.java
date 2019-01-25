package UICatalogTests;

import options.Web;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTest extends Web {

    Web web;

    @BeforeMethod
    public void initElements(){
        web = PageFactory.initElements(ad, Web.class);
    }
    @Test
    public void webTest(){
        webHome();
    }
    @Test
    public void webSiteTest(){
        appleWebsite();
    }
}
