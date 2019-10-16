import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MainTest {
    private WebDriver driver;
    private String parentWindowHandler=null;
    private String subWindowHandle=null;


    @BeforeMethod
    public void startMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        parentWindowHandler = driver.getWindowHandle();
    }

    @Test
    public void cheakWindowWork(){
        WindowClass window = new WindowClass(driver);
        subWindowHandle = window.openNewWindow("https://www.google.com.ua");
        WebElement search = driver.findElement(By.name("q"));
        TextClass text = new TextClass(driver);
        text.typeText(search,"selenium");
        String textCheak = search.getAttribute("value");
        Assert.assertEquals(textCheak, "selenium");
        search.submit();
        String title =window.getTitle();
        Assert.assertEquals("selenium - Поиск в Google", title);
    }

    @Test
    public void cheakCloseWindow(){
        WindowClass window = new WindowClass(driver);
        subWindowHandle = window.openNewWindow("https://www.google.com.ua");
        String handler = driver.getWindowHandle();
        Assert.assertEquals(handler, subWindowHandle);
        window.closeWindow(parentWindowHandler);
        handler = driver.getWindowHandle();
        Assert.assertEquals(handler, parentWindowHandler);

    }

    @Test
    public void cheakmouse(){
        WebElement dropList = driver.findElement(By.cssSelector("div.dropdown-menu.flex-auto.rounded-1.bg-white.px-0.mt-0.pb-4.p-lg-4.position-relative.position-lg-absolute.left-0.left-lg-n4"));
        Assert.assertTrue(dropList.isEnabled());
        MouseClass mouse = new MouseClass(driver);
        WebElement menu = driver.findElement(By.xpath("//nav//li"));
        mouse.mouseOver(menu);
        dropList = driver.findElement(By.cssSelector("div.dropdown-menu.flex-auto.rounded-1.bg-white.px-0.mt-0.pb-4.p-lg-4.position-relative.position-lg-absolute.left-0.left-lg-n4"));
        Assert.assertTrue(dropList.isEnabled());
    }

    @AfterMethod
    public void clearDown(){
        driver.quit();
    }

}
