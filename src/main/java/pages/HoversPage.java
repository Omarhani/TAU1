package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private Actions actions ;

    private WebElement figure (int index){
        return driver.findElements(By.className("figure")).get(index-1);
    }
//    private WebElement boxCaption (){
//        return driver.findElement(By.className("figcaption"));
//    }
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public FigureCaption hoverOverFigure(int index){
        By boxCaption= By.className("figcaption");
        actions = new Actions(driver);
        actions.moveToElement(figure(index)).perform();
        return new FigureCaption(figure(index).findElement(boxCaption));
    }

    public class FigureCaption{

        private WebElement caption;
        private WebElement header(){
            return caption.findElement(By.tagName("h5"));
        }
        private WebElement link(){
            return caption.findElement(By.tagName("a"));
        }
        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplay(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return header().getText();
        }
        public String getLink(){
            return link().getAttribute("href");
        }
        public String getLinkText(){
            return link().getText();
        }
    }
}
