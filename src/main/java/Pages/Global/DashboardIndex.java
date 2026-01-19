package Pages.Global;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardIndex extends Page {
    public DashboardIndex(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//button[@title='Help']")
    private WebElement btnHelp;

    public WebElement getBtnHelp(){
        return this.findElement(btnHelp);
    }
}
