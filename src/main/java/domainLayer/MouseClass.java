package domainLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseClass extends WebElementClass{

    public void doubleclick(By locator){
        Actions action = new Actions(getWebDriver());
        action.doubleClick(getElement(locator)).build().perform();
    }

    public void rightClick(By locator){
        Actions action = new Actions(getWebDriver());
        action.contextClick(getElement(locator)).build().perform();
    }

    public void mouseOver(By locator){
        Actions action = new Actions(getWebDriver());
        action.moveToElement(getElement(locator)).build().perform();
    }

    public void mouseClick(By locator){
        getElement(locator).click();
    }

    public void submitClick(By locator){
        getElement(locator).submit();
    }


}
