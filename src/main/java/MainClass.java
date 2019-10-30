import domainLayer.TextClass;
import domainLayer.WindowClass;
import org.openqa.selenium.*;

//class MyThread implements Runnable{
//
//    public void run() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://github.com/");
//        System.out.println("Work");
////        WebElement dropList = driver.findElement(By.xpath("//nav//li"));
////        WebElement signUpBut = driver.findElement(By.xpath("//form/button[text()='Sign up for GitHub']"));
////        WebElement loginField = driver.findElement(By.id("user[login]"));
////
////        domainLayer.MouseClass mouse = new domainLayer.MouseClass(driver);
////        domainLayer.TextClass text = new domainLayer.TextClass(driver);
//        //mouse.mouseOver(dropList);
////        text.typeText(loginField, "username");
////        mouse.click(signUpBut);
//
//        String parentWindowHandler = driver.getWindowHandle();
//        domainLayer.WindowClass window = new domainLayer.WindowClass(driver);
//        String subWindowHandle = window.openNewWindow("https://www.google.com.ua");
//        WebElement search = driver.findElement(By.name("q"));
//        domainLayer.TextClass text = new domainLayer.TextClass(driver);
//        text.typeText(search,"seleno");
//        text.deleteText(search);
//        text.typeText(search,"selenium");
//        search.submit();
//        System.out.println(window.getTitle());
//        WebElement linkCheak = driver.findElement(By.partialLinkText("Selenium - Web Browser Automation"));
//        linkCheak.click();
//        window.switchWindow(parentWindowHandler);
//        WebElement dropList = driver.findElement(By.xpath("//nav//li"));
//        domainLayer.MouseClass mouse = new domainLayer.MouseClass(driver);
//        mouse.mouseOver(dropList);
//        window.switchWindow(subWindowHandle);
//        window.closeWindow(parentWindowHandler);
//        System.out.println(subWindowHandle);
//
//    }
//}



public class MainClass {

    public static void main(String[] args) {

//        Thread myThread = new Thread((new MyThread()));
//        myThread.start();
//        Thread myThread1 = new Thread((new MyThread()));
//        myThread1.start();
//        domainLayer.MouseClass mouse = new domainLayer.MouseClass();
//        mouse.max();
//        mouse.driver.get("https://github.com/");
//        mouse.mouseOver(By.xpath("//nav//li"));


        TextClass text = new TextClass();
        text.goTo("https://www.google.com.ua");
        text.typeText(By.name("q"),"selenium");

        WindowClass window = new WindowClass();
        String parentWindowHandler = window.getWindowHand();
        String subWindowHandle = window.openNewWindow("https://www.google.com.ua");

    }
}
