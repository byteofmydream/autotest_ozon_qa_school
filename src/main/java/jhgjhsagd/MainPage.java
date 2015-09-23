package jhgjhsagd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {

    private final String homePageUrl = "http://www.ozon.com.ua/";
    private final By specOdejdaMenu = By.xpath("//a[text()='Спецодежда' and @class='root-item']");
    private  WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(homePageUrl);
    }

    public void openHeaderMenu(String menuName){
        WebElement menuItem = driver.findElement(By.xpath("//a[text()=' " + menuName + " ' and @class='root-item']"));

        Actions action = new Actions(driver);
        action.moveToElement(menuItem).build().perform();
    }

    public void clickSubMenuItem(String itemName){
        driver.findElement(By.xpath("//li[@class='top_level_box']//a[text()='" + itemName +  "']")).click();
    }

}
