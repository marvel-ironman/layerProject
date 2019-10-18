package businessLogicLayer;
import domainLayer.MouseClass;
import domainLayer.TextClass;
import domainLayer.WindowClass;
import org.openqa.selenium.By;

public class WorkText {
    private TextClass textClass;
    private MouseClass mouseClass;
    private WindowClass windowClass;
    private String urlGoogle = "https://www.google.com.ua";
    private By searchLocator = By.name("q");
    private String wrongText = "seleno";
    private String validText = "selenium";

    public WorkText() {
        this.textClass = new TextClass();
        this.mouseClass = new MouseClass();
        this.windowClass = new WindowClass();
    }

    public String typeRemoveTextInGoogleSearch(){
        textClass.goToUrl(urlGoogle);
        textClass.typeText(searchLocator,wrongText);
        textClass.deleteText(searchLocator);
        textClass.typeText(searchLocator,validText);
        mouseClass.submitClick(searchLocator);
        return windowClass.getTitle();
    }

}
