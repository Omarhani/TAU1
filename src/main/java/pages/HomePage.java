package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement formAuthenticationLink(){
        return  driver.findElement(By.linkText("Form Authentication"));
    }

    private WebElement dropdownLink(){
        return  driver.findElement(By.linkText("Dropdown"));
    }

    private WebElement hoversLink(){
        return driver.findElement(By.linkText("Hovers"));
    }


    public LoginPage clickFromAuthentication(){
        clickLink(formAuthenticationLink());
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink(dropdownLink());
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
         clickLink(hoversLink());
         return new HoversPage(driver);
    }

    private void clickLink(WebElement webElement){
        webElement.click();
    }


}
