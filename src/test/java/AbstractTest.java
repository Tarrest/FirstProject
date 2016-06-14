import Pages.O1AuthorizationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static org.openqa.selenium.support.PageFactory.*;

/**
 * Created by Roma on 10.06.2016.
 */
public class AbstractTest {

    protected WebDriver drv;
    protected O1AuthorizationPage onAuthPage;

    @BeforeClass
    public void testSetUp() {
        drv = new FirefoxDriver();
        onAuthPage = new O1AuthorizationPage(drv);
        onAuthPage = initElements(drv, O1AuthorizationPage.class);
    }

    @AfterClass
    public void testShutDown() {
        drv.close();
    }


}
