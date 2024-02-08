package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("Context Menu");
    }

    @Test(priority = 10)
    public void byClickingOnTheBoxContextMenuAppears(){
        Assert.assertEquals(driver.getCurrentUrl(),contextMenuPage.getUrl());
        contextMenuPage.rightClickOnHotSpot();

        Assert.assertEquals(contextMenuPage.getTextFromContextMenu(),"You selected a context menu");

        contextMenuPage.clickOkOnContextMenu();

    }

}
