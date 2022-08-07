package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement userNameField(){
        return driver.findElement(By.id("username"));
    }
    private WebElement passwordField(){
        return driver.findElement(By.id("password"));
    }
    private WebElement loginButton(){
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void insertUsername(String username){
        userNameField().sendKeys(username);
    }
    public void insertPassword(String password){

        passwordField().sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){

        loginButton().click();
        return new SecureAreaPage(driver);
    }

}
