package domainLayer;

import org.openqa.selenium.By;

public class TextClass extends WebElementClass{


    public void typeText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public void deleteText(By locator){
        getElement(locator).clear();
    }

    public void goToUrl(String url){
        goTo(url);
    }




}
