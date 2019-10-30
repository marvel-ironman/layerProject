package domainLayer;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Iterator;
import java.util.Set;

public class WindowClass extends WebElementClass{

    @Step(value ="Open new window with url: {url}")
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

    @Step(value ="Close window")
    public void closeWindow(String parentHandler){
        getWebDriver().close();
        getWebDriver().switchTo().window(parentHandler);
    }

    @Step(value ="Get title")
    public String getTitle(){
        return getWebDriver().getTitle();
    }

    @Step(value ="Switch window")
    public void switchWindow(String switchTo){
        getWebDriver().switchTo().window(switchTo);
    }

    public String getWindowHand(){
        return getWebDriver().getWindowHandle();
    }

    @Step(value ="Quit window")
    public void quitWindow(){
        getWebDriver().quit();
    }

    public Set<String> getWindowHands(){
        return getWebDriver().getWindowHandles();
    }



}
