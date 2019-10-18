import businessLogicLayer.WorkMouse;
import businessLogicLayer.WorkText;
import businessLogicLayer.WorkWindow;
import domainLayer.MouseClass;
import domainLayer.TextClass;
import domainLayer.WindowClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MainTest {
    private WorkText text=null;
    private WorkMouse mouse=null;
    private WorkWindow window=null;


    @BeforeClass
    public void startMethod() {
        text = new WorkText();
        mouse = new WorkMouse();
        window = new WorkWindow();
    }

    @Test
    public void textTest(){
        Assert.assertEquals(text.typeRemoveTextInGoogleSearch(),"selenium - Поиск в Google");
    }

    @Test(priority = 1)
    public void newWindowOpenTest(){
        Assert.assertEquals(window.openNewWindowCheak(),2);
    }

    @Test
    public void mouseOverTest(){
        Assert.assertTrue(mouse.mouseOverCheak());
    }



    @AfterClass
    public void clearDown(){
        window.closeTheBrowser();
    }

}
