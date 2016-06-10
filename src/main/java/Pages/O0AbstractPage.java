package Pages;

import org.openqa.selenium.WebDriver;

public class O0AbstractPage {

    protected WebDriver drv;

    public O0AbstractPage (WebDriver drv) {
        this.drv = drv;
    }

    public WebDriver getDrv() {
        return drv;
    }

    public O1AutorizationPage navigateToWebApp() {
        drv.navigate().to("http://js-nobius.myapp.com.ua/#/login");
        return new O1AutorizationPage(drv);
    }
}
