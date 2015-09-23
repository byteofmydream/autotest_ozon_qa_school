package jhgjhsagd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CatalogPage {
    private WebDriver driver;

    public CatalogPage(WebDriver driver){
        this.driver = driver;
    }


    public void openCatalogMenuItem(String itemName){
        driver.findElement(By.xpath("//div[@class='bx_catalog_item_title']/a[text()='" + itemName + "']")).click();
    }
}
