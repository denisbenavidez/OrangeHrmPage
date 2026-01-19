package Pages.Account;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "username")
    private WebElement usernameInput;

    @FindBy (name = "password")
    private WebElement passwordInput;

    @FindBy (xpath = "//button[text()=' Login ']")
    private WebElement loginBtn;

    @FindBy (xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement errorMsgUser;

    public void executeLogin(String username, String password){
        this.findElement(usernameInput).sendKeys(username);
        this.findElement(passwordInput).sendKeys(password);
        this.findElement(loginBtn).click();
    }

    public String getErrorMsgUserIncorrect(){
        return this.findElement(errorMsgUser).getText();
    }
}
