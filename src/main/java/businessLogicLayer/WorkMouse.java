package businessLogicLayer;

import domainLayer.MouseClass;
import domainLayer.TextClass;
import domainLayer.WindowClass;
import org.openqa.selenium.By;

public class WorkMouse {
    private TextClass textClass;
    private MouseClass mouseClass;
    private WindowClass windowClass;

    public WorkMouse() {
        this.textClass = new TextClass();
        this.mouseClass = new MouseClass();
        this.windowClass = new WindowClass();
    }

    public boolean mouseOverCheak(){
        mouseClass.goTo("https://github.com/");
        mouseClass.mouseOver(By.xpath("//nav//li"));
        return mouseClass.getElement(By.cssSelector("div.dropdown-menu.flex-auto.rounded-1.bg-white.px-0.mt-0.pb-4.p-lg-4.position-relative.position-lg-absolute.left-0.left-lg-n4")).isEnabled();


    }



}
