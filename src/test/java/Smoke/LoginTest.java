package Smoke;

import Pages.Account.LoginPage;
import Pages.Global.DashboardIndex;
import TestCaseImplements.TestCase;
import Util.DataProvideLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestCase {

    @Test(dataProvider = "dataLogin", dataProviderClass = DataProvideLogin.class)
    public void loginTest(String username, String password, DataProvideLogin.LoginStatus expectedStatus){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.executeLogin(username, password);

        if (expectedStatus == DataProvideLogin.LoginStatus.SUCCESS){ //LOGIN EXITOSO
            DashboardIndex dashboardIndex = new DashboardIndex(driver);
            Assert.assertTrue(dashboardIndex.getBtnHelp().isDisplayed(), "El dashboard no se cargo correctamente");
        } else if (expectedStatus == DataProvideLogin.LoginStatus.FAILURE) { //LOGIN FALLIDO
            Assert.assertEquals(loginPage.getErrorMsgUserIncorrect(), "Invalid credentials", "El mensaje de error no es el esperado");
        }
    }
}
