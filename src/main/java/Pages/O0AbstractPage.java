package Pages;

import org.openqa.selenium.WebDriver;
import static Utils.ConstantUnits.*;

public class O0AbstractPage {

    protected WebDriver drv;

    public O0AbstractPage (WebDriver drv) {
        this.drv = drv;
    }

    public WebDriver getDrv() {
        return drv;
    }

    public O1AuthorizationPage navigateToWebApp() {
        drv.navigate().to(StartPage);
        return new O1AuthorizationPage(drv);
    }
}
