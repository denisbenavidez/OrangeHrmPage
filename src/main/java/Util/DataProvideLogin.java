package Util;

import org.testng.annotations.DataProvider;

public class DataProvideLogin {

    public enum LoginStatus{ //tipo enum
        SUCCESS,
        FAILURE
    }

    @DataProvider (name = "dataLogin")
    public Object[][] getDataLogin(){
        return new Object[][]{
                {"Admin", "admin123", LoginStatus.SUCCESS},
                {"Admin", "admin", LoginStatus.FAILURE},
                {"Admin123", "admin123", LoginStatus.FAILURE},
                {"", "", LoginStatus.FAILURE},
                {"Admin", "", LoginStatus.FAILURE},
                {"", "admin123", LoginStatus.FAILURE}
        };
    }
}
