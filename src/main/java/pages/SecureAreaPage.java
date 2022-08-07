package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage {

    private WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement flashMessage(){
        return driver.findElement(By.id("flash"));
    }

    public String getMessage(){
        return flashMessage().getText();
    }

}
