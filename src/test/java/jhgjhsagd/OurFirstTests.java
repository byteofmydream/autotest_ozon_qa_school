package jhgjhsagd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OurFirstTests {

    private MainPage mainPage;
    private WebDriver driver;

    @Before
    public void before(){
       driver = new FirefoxDriver();
       mainPage = new MainPage(driver);
    }

    @Test
    public void ourFirstTest(){
       mainPage.open();
        mainPage
    }

    @After
    public void after(){
       driver.close();
    }

}
