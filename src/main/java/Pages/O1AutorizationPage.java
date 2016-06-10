package Pages;

import com.sun.javafx.image.BytePixelGetter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class O1AutorizationPage extends O0AbstractPage {

    public O1AutorizationPage(WebDriver drv) {
        super(drv);
    }

    public O1AutorizationPage fillCorrectForm() {
        drv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        drv.findElement(By.xpath("//form/div[1]/input")).sendKeys("aaaq@yopmail.com");
        drv.findElement(By.xpath("//form/div[2]/input")).sendKeys("qwerty");
        return new O1AutorizationPage(drv);
    }

    public O1AutorizationPage clickOnLogin() {
        drv.findElement(By.xpath("//div/form/div[3]/button")).click();
        return new O1AutorizationPage(drv);
    }

    public O2RegistrationPage clickOnReg() {
        drv.findElement(By.xpath("//div/div[2]/button")).click();
        return  new O2RegistrationPage(drv);
    }

    public O3RemindPassPage clickOnRemind() {
        drv.findElement(By.xpath("//div/div[3]/button")).click();
        return new O3RemindPassPage(drv);
    }
}
