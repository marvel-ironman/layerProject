
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseClass {
    private WebDriver driver;

    public MouseClass(WebDriver driver) {
        this.driver = driver;
    }

    public void mouseOver(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public void doubleclick(WebElement element){
        Actions action = new Actions(driver);
        action.doubleClick(element).build().perform();
    }

    public void rightClick(WebElement element){
        Actions action = new Actions(driver);
        action.contextClick(element).build().perform();
    }


}
