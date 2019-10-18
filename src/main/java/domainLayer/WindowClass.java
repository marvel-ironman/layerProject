package domainLayer;

import org.openqa.selenium.JavascriptExecutor;
import java.util.Iterator;
import java.util.Set;

public class WindowClass extends WebElementClass{

    public String openNewWindow(String url){

        String subWindowHandler = null;

        ((JavascriptExecutor)getWebDriver()).executeScript("window.open('');");

        Set<String> handles = getWebDriver().getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();

            getWebDriver().switchTo().window(subWindowHandler);
            System.out.println(subWindowHandler);
        }
        getWebDriver().get(url);
        return subWindowHandler;
    }

    public void closeWindow(String parentHandler){
        getWebDriver().close();
        getWebDriver().switchTo().window(parentHandler);
    }

    public String getTitle(){
        return getWebDriver().getTitle();
    }

    public void switchWindow(String switchTo){
        getWebDriver().switchTo().window(switchTo);
    }

    public String getWindowHand(){
        return getWebDriver().getWindowHandle();
    }

    public void quitWindow(){
        getWebDriver().quit();
    }

    public Set<String> getWindowHands(){
        return getWebDriver().getWindowHandles();
    }



}
