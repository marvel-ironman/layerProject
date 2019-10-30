package domainLayer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class EventHandler extends AbstractWebDriverEventListener {

    private static final Logger LOG = LogManager.getLogger(EventHandler.class);


    public void beforeNavigateTo(String s, WebDriver webDriver) {
        LOG.info("Just beforeNavigateTo " + s);
    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        LOG.info("Just afterNavigateTo " + s);
    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        LOG.info("Find element " + by);
    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        LOG.info("Element found");
    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        LOG.info("BeforeClickOn " + webElement);
    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        LOG.info("AfterClickOn " + webElement);
    }

    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        LOG.info("BeforeSwitchToWindow " + webDriver.getTitle());
    }

    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        LOG.info("AfterSwitchToWindow " + webDriver.getTitle());
    }

    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        LOG.info("BeforeGetText " + webElement);
    }

    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        LOG.info("AfterGetText " + webElement);
    }
}
