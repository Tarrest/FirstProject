import Pages.O1AuthorizationPage;
import Pages.O2RegistrationPage;
import Pages.O4MainPage;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.ConstantUnits.*;

/**
 * Created by Roma on 10.06.2016.
 */
public class AuthorizationTest extends AbstractTest {

    @Test
    public void loadPage() {
        onAuthPage.navigateToWebApp();
    }

    @Test(dependsOnMethods = "loadPage")
    public void checkEmptyLogin() {
        onAuthPage.sendEmptyForm().clickOnLogin();
        onAuthPage.checkEmptyForm(AuthHeader);
    }

    @Test(dependsOnMethods = "checkEmptyLogin")
    public void checkCorrectStandardLogin() {
        onAuthPage.sendCorrectForm().clickOnLogin();
        O4MainPage onMainPage = new O4MainPage(drv);
        onMainPage.checkUserName(userName);
    }

}
