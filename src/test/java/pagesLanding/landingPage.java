package pagesLanding;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class landingPage extends BasePage {

    public  landingPage () {

        super();
    }

    @FindBy(className = "account_icon")
    private WebElement accountButton;

@Step
    public LoginPage openLogInPage(){
    accountButton.click();
    return new LoginPage();
}

}
