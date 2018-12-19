package pagesLanding;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Actions.waitForVisibilityOfElement;

public class LoginPage extends BasePage {
    String expectedBadPassResponse = "ERROR: Invalid email address. Lost your password?";
    String expectedBadMailResponse = "ERROR: Invalid username. Lost your password?";
    String expectedEmptyLoginResponse = "ERROR: The username field is empty.";
    String expectedEmptyPassResponse = "ERROR: The password field is empty.";
    String expectedResponseMessage;

    public LoginPage(){
        super();
    }
@FindBy(id = "log")
    private WebElement loginInput;

@FindBy(id = "pwd")
    private WebElement passwordInput;
@FindBy(id = "login")
    private WebElement loginButton;
@FindBy(className = "response")
    private WebElement response;


@Step
    public void checkResponseMessage(String expectedResponseMessage){
   String getResponseText;
    waitForVisibilityOfElement(response);
    getResponseText = response.getText();
   Assert.assertEquals(expectedResponseMessage, getResponseText);

}
    public void loginWithBadPass(){
    this.expectedResponseMessage = expectedBadPassResponse;
    loginInput.sendKeys("jakismail@jmail.ovh");
    passwordInput.sendKeys("asd");
    loginButton.click();
    checkResponseMessage(expectedResponseMessage);
}

    public void loginWithBadMail(){
        this.expectedResponseMessage = expectedBadMailResponse;
        loginInput.sendKeys("asd@edr");
        passwordInput.sendKeys("asd");
        loginButton.click();
        checkResponseMessage(expectedResponseMessage);
    }

    public void loginWithEmptyLogin(){
        this.expectedResponseMessage = expectedEmptyLoginResponse;

        passwordInput.sendKeys("asdhttnrt");
        loginButton.click();
        checkResponseMessage(expectedResponseMessage);
    }

    public void loginWithEmptyPass(){
        this.expectedResponseMessage = expectedEmptyPassResponse;
        loginInput.sendKeys("jakismail@jmail.ovh");
        loginButton.click();
        checkResponseMessage(expectedResponseMessage);
    }
}
