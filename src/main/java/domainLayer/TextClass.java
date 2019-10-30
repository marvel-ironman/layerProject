package domainLayer;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TextClass extends WebElementClass{

    @Step(value = "Type text: {text} in element with locator: {locator}")
    public void typeText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    @Step(value = "Delete text with locator: {locator}")
    public void deleteText(By locator){
        getElement(locator).clear();
    }

}
