package domainLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementClass extends DriverClass{
    private WebDriverWait wait;

    public WebElementClass() {
        this.wait = new WebDriverWait(getWebDriver(),5);
    }

    public WebElement getElement(By locator){
       // wait = new WebDriverWait(getWebDriver(),5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return getWebDriver().findElement(locator);
    }

    public WebElement getElement2(By locator){
       // wait = new WebDriverWait(getWebDriver(),5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return getWebDriver().findElement(locator);
    }

    public void goTo(String url){
        getWebDriver().get(url);
    }

}


