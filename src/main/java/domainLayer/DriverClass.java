package domainLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DriverClass {
    private static WebDriver driver;
    private static ChromeOpt chromeOpt = new ChromeOpt();
    private static EventFiringWebDriver eventDriver;
    private static EventHandler handler = new EventHandler();

    public static synchronized WebDriver getWebDriver(){
        if (driver == null){
            driver = new ChromeDriver(chromeOpt.setBrowser());
            eventDriver = new EventFiringWebDriver(driver);
            eventDriver.register(handler);
        }  return eventDriver;
        }



    }