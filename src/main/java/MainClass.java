import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

class MyThread implements Runnable{

    public void run() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        System.out.println("Work");
//        WebElement dropList = driver.findElement(By.xpath("//nav//li"));
//        WebElement signUpBut = driver.findElement(By.xpath("//form/button[text()='Sign up for GitHub']"));
//        WebElement loginField = driver.findElement(By.id("user[login]"));
//
//        MouseClass mouse = new MouseClass(driver);
//        TextClass text = new TextClass(driver);
        //mouse.mouseOver(dropList);
//        text.typeText(loginField, "username");
//        mouse.click(signUpBut);
//-----------------------------
//        String a = "window.open('');";
//        ((JavascriptExecutor)driver).executeScript(a);
//--------------------------
        String parentWindowHandler = driver.getWindowHandle();
        WindowClass window = new WindowClass(driver);
        String subWindowHandle = window.openNewWindow("https://www.google.com.ua");
        WebElement search = driver.findElement(By.name("q"));
        TextClass text = new TextClass(driver);
        text.typeText(search,"seleno");
        text.deleteText(search);
        text.typeText(search,"selenium");
        search.submit();
        System.out.println(window.getTitle());
        WebElement linkCheak = driver.findElement(By.partialLinkText("Selenium - Web Browser Automation"));
        linkCheak.click();
        window.switchWindow(parentWindowHandler);
        WebElement dropList = driver.findElement(By.xpath("//nav//li"));
        MouseClass mouse = new MouseClass(driver);
        mouse.mouseOver(dropList);
        window.switchWindow(subWindowHandle);
        window.closeWindow(parentWindowHandler);
        System.out.println(subWindowHandle);

    }
}



public class MainClass {

    public static void main(String[] args) {

        Thread myThread = new Thread((new MyThread()));
        myThread.start();
        Thread myThread1 = new Thread((new MyThread()));
        myThread1.start();

    }
}
