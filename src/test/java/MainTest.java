import businessLogicLayer.WorkMouse;
import businessLogicLayer.WorkText;
import businessLogicLayer.WorkWindow;
import domainLayer.MouseClass;
import domainLayer.TextClass;
import domainLayer.WindowClass;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MainTest {
    private WorkText text=null;
    private WorkMouse mouse=null;
    private WorkWindow window=null;
    private String selenText = "selenium - Поиск в Google";


    @BeforeClass
    public void startMethod() {
        text = new WorkText();
        mouse = new WorkMouse();
        window = new WorkWindow();
    }

    @Feature(value = "Работа с текстом")
    @Test
    @Severity(value = SeverityLevel.MINOR)
    public void textTest(){
        Assert.assertEquals(text.typeRemoveTextInGoogleSearch(),selenText);
    }

    @Feature(value = "Работа с окнами")
    @Test(priority = 1)
    @Severity(value = SeverityLevel.BLOCKER)
    public void newWindowOpenTest(){
        Assert.assertEquals(window.openNewWindowCheak(),2);
    }

    @Feature(value = "Работа с мышкой")
    @Test
    @Severity(value = SeverityLevel.TRIVIAL)
    public void mouseOverTest(){
        Assert.assertTrue(mouse.mouseOverCheak());
    }



    @AfterClass
    public void clearDown(){
        window.closeTheBrowser();
    }

}
