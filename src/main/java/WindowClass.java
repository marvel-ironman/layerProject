import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowClass {
    private WebDriver driver;

    public WindowClass(WebDriver driver) {
        this.driver = driver;
    }

    public String openNewWindow(String url){

        String subWindowHandler = null;

        ((JavascriptExecutor)driver).executeScript("window.open('');");

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();

            driver.switchTo().window(subWindowHandler);
            System.out.println(subWindowHandler);
        }
        driver.get(url);
        return subWindowHandler;
    }

    public void closeWindow(String parentHandler){
        driver.close();
        driver.switchTo().window(parentHandler);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void switchWindow(String switchTo){
        driver.switchTo().window(switchTo);
    }



}
