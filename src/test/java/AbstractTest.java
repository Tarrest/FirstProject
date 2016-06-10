import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Roma on 10.06.2016.
 */
public class AbstractTest {

    WebDriver drv;

    @BeforeTest
    public void testSetUp() {
        drv = new FirefoxDriver();
    }

    @AfterTest
    public void testShutDown() {
        drv.close();
    }


}
