package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {

    @DataProvider
    public static Object[] test_data(){
        return new Object[][]{{"Rajesh",1234},{"kumar",567},{"salim",456}};
    }

    @Test(dataProvider = "test_data")
    public static void login_test(String username,int password){
        System.out.println(username+" = "+ password);
    }
/*

 */

}
