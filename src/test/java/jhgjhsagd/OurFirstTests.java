package jhgjhsagd;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OurFirstTests {

    private MainPage mainPage;
    private CatalogPage catalogPage;
    private ProductPage productPage;
    private WebDriver driver;

    @Before
    public void before() {
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        catalogPage = new CatalogPage(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void ourFirstTest() {
        mainPage.open();
        mainPage.openHeaderMenu("Спецодежда");
        mainPage.clickSubMenuItem("Головные уборы");
        catalogPage.openCatalogMenuItem("Пилотка ");

        int actualQuantity = productPage.getLittleImagesQuantity();
        Assert.assertEquals(actualQuantity, 3);
    }

    @After
    public void after() {
        driver.close();
    }

}
