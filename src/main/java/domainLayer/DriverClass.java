package domainLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
    private static WebDriver driver;
    private static ChromeOpt chromeOpt = new ChromeOpt();

    public static synchronized WebDriver getWebDriver(){
        if (driver == null){
            driver = new ChromeDriver(chromeOpt.setBrowser());
        }  return driver;
        }



    }