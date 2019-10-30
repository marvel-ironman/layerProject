package domainLayer;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseClass extends WebElementClass{

    @Step(value ="Double click on element by locator: {locator}")
    public void doubleclick(By locator){
        Actions action = new Actions(getWebDriver());
        action.doubleClick(getElement(locator)).build().perform();
    }

    @Step(value ="Right click on element by locator: {locator}")
    public void rightClick(By locator){
        Actions action = new Actions(getWebDriver());
        action.contextClick(getElement(locator)).build().perform();
    }

    @Step(value ="Mouse over on element by locator: {locator}")
    public void mouseOver(By locator){
        Actions action = new Actions(getWebDriver());
        action.moveToElement(getElement(locator)).build().perform();
    }

    public void mouseClick(By locator){
        getElement(locator).click();
    }

    @Step(value ="Submit click on element by locator: {locator}")
    public void submitClick(By locator){
        getElement(locator).submit();
    }


}
