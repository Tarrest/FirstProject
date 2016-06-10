package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class O2RegistrationPage extends O0AbstractPage{

    public O2RegistrationPage(WebDriver drv) {
        super(drv);
    }

    public O2RegistrationPage putName() {
        drv.findElement(By.xpath("//form/div[1]/input")).sendKeys("Test1");
        return new O2RegistrationPage(drv);
    }

    public  O4MainPage submitForm() {
        drv.findElement(By.xpath("//form/div[11]/label/span[1]")).click();
        drv.findElement(By.xpath("//form/div[13]/button")).click();
        return new O4MainPage(drv) ;
    }
 }
