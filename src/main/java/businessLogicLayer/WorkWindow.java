package businessLogicLayer;

import domainLayer.MouseClass;
import domainLayer.TextClass;
import domainLayer.WindowClass;

public class WorkWindow {
    private TextClass textClass;
    private MouseClass mouseClass;
    private WindowClass windowClass;

    public WorkWindow() {
        this.textClass = new TextClass();
        this.mouseClass = new MouseClass();
        this.windowClass = new WindowClass();
    }

    public int openNewWindowCheak(){
        windowClass.openNewWindow("https://github.com/");
        return windowClass.getWindowHands().size();
    }

    public void closeTheBrowser(){
        windowClass.quitWindow();
    }
}
