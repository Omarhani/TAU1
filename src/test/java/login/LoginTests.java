package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    private String username= "tomsmith";
    private String password= "SuperSecretPassword!";

    @Test
    public void testLoginSuccessfully(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.insertUsername(username);
        loginPage.insertPassword(password);
        var secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getMessage().contains("You logged into a secure area!"));
    }
}
