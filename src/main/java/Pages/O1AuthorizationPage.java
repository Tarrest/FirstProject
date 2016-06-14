package Pages;

import com.sun.javafx.image.BytePixelGetter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Utils.ConstantUnits.*;

public class O1AuthorizationPage extends O0AbstractPage {

    @FindBy(xpath = "//form/div[1]/input") WebElement emailField;
    @FindBy(xpath = "//form/div[2]/input") WebElement passField;
    //@FindBy(xpath = "//div/form/div[3]/button") WebElement submitButton;
    @FindBy(xpath = "//login/div[1]/div/p") WebElement authHeader;
    @FindBy(xpath = "//div/div[2]/button") WebElement regButton;
    @FindBy(xpath = "//div/div[3]/button") WebElement remindButton;


    public O1AuthorizationPage(WebDriver drv) {
        super(drv);
    }

    public O1AuthorizationPage sendCorrectForm() {
        drv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        emailField.sendKeys(emailFieldEnter);
        passField.sendKeys(passwFieldEnter);
        return new O1AuthorizationPage(drv);
    }

    public O1AuthorizationPage sendEmptyForm() {
        drv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        emailField.sendKeys("");
        passField.sendKeys("");
        return new O1AuthorizationPage(drv);
    }

    public void checkEmptyForm(String text) {
        String answer = authHeader.getText();
        Assert.assertTrue(text.equalsIgnoreCase(answer));
    }

    public void sendFormWrongPass() {
        drv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        emailField.sendKeys(emailFieldEnter);
        passField.sendKeys("qwerty1");
    }

    public void clickOnLogin() {
        drv.findElement(By.xpath("//div/form/div[3]/button")).click();
    }

    public O2RegistrationPage clickOnReg() {
        regButton.click();
        return new O2RegistrationPage(drv);
    }

    public O3RemindPassPage clickOnRemind() {
        remindButton.click();
        return new O3RemindPassPage(drv);
    }
}