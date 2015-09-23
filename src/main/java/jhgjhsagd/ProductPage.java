package jhgjhsagd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ivan on 9/23/15.
 */
public class ProductPage {
    private final By littlePic = By.cssSelector("li > a.stick_zoom_up");
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public int getLittleImagesQuantity(){
        return driver.findElements(littlePic).size();
    }
}
