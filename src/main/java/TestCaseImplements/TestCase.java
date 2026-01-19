package TestCaseImplements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestCase {

    protected static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void afterMethod(){
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void afterClass(){
       // driver.quit();
    }
}
