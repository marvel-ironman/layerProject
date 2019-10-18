package businessLogicLayer;
import domainLayer.MouseClass;
import domainLayer.TextClass;
import domainLayer.WindowClass;
import org.openqa.selenium.By;

public class WorkText {
    private TextClass textClass;
    private MouseClass mouseClass;
    private WindowClass windowClass;

    public WorkText() {
        this.textClass = new TextClass();
        this.mouseClass = new MouseClass();
        this.windowClass = new WindowClass();
    }

    public String typeRemoveTextInGoogleSearch(){
        textClass.goToUrl("https://www.google.com.ua");
        textClass.typeText(By.name("q"),"seleno");
        textClass.deleteText(By.name("q"));
        textClass.typeText(By.name("q"),"selenium");
        mouseClass.submitClick(By.name("q"));
        return windowClass.getTitle();
    }

}
