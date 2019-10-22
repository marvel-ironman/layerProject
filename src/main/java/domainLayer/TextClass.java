package domainLayer;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TextClass extends WebElementClass{

    @Step("Type text: {text} in element with locator: {locator}")
    public void typeText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public void deleteText(By locator){
        getElement(locator).clear();
    }

    @Step("Go to {url}")
    public void goToUrl(String url){
        goTo(url);
    }




}
