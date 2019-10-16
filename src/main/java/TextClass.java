import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextClass {
    private WebDriver driver;

    public TextClass(WebDriver driver) {
        this.driver = driver;
    }

    public void typeText(WebElement element, String text){
        element.sendKeys(text);
    }

    public void deleteText(WebElement element){
        element.clear();
    }


}
