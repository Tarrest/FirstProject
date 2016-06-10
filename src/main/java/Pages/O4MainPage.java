package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Created by Roma on 10.06.2016.
 */
public class O4MainPage extends O0AbstractPage{

    public O4MainPage(WebDriver drv) {
        super(drv);
    }

    public String checkUserName() {
        return drv.findElement(By.xpath("//div[2]/div/div[2]")).getText();
    }


}
