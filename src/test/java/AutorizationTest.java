import Pages.O1AutorizationPage;
import Pages.O2RegistrationPage;
import Pages.O4MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Roma on 10.06.2016.
 */
public class AutorizationTest extends AbstractTest {

    @Test
    public void checkCorrectStandartLogin() {
        O1AutorizationPage onAuthPage = new O1AutorizationPage(drv);
        onAuthPage.navigateToWebApp();
        onAuthPage.fillCorrectForm().clickOnLogin();
        O4MainPage onMainPage = new O4MainPage(drv);
        Assert.assertTrue(onMainPage.checkUserName().equalsIgnoreCase("qwerast sadast"));
    }
}
