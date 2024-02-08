package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EntryAdTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("Entry Ad");

    }

    @Test(priority = 10)
    public void modalWinDowIsShown() {
        Assert.assertEquals(driver.getCurrentUrl(),entryAdPage.getURL());

        wait.until(ExpectedConditions.visibilityOf(entryAdPage.getModalWindowCloseBtn()));
        Assert.assertTrue(entryAdPage.getModalWindowCloseBtn().isDisplayed());

        entryAdPage.clickOnCloseButton();

        Assert.assertFalse(entryAdPage.elementIsDisplayed());

    }
    @Test(priority=20)
    public void userCanReEnableWindow(){
        entryAdPage.clickOnCloseButton();
        entryAdPage.clickOnReEnableButton();
        wait.until(ExpectedConditions.visibilityOf(entryAdPage.getModalWindowCloseBtn1()));

        Assert.assertTrue(entryAdPage.getModalWindowCloseBtn1().isDisplayed());



    }
}
