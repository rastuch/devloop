package tests;

import config.TestConfig;
import org.junit.Test;
import pagesLanding.BasePage;
import pagesLanding.landingPage;
import pagesLanding.LoginPage;
public class LoginTest extends TestConfig {

    @Test
    public void TC01_LoginWithBadPassword(){
        new landingPage()
                .openLogInPage()
                .loginWithBadPass();
    }

    @Test
    public void TC02_LoginWithBadMail(){
        new landingPage()
                .openLogInPage()
                .loginWithBadMail();
    }

    @Test
    public void TC03_LoginWithEmptyPassword(){
        new landingPage()
                .openLogInPage()
                .loginWithEmptyPass();
    }

    @Test
    public void TC04_LoginWithEmptyLogin(){
        new landingPage()
                .openLogInPage()
                .loginWithEmptyLogin();
    }
}
