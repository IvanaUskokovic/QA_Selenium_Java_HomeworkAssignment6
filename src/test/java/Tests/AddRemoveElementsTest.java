package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("Add/Remove Elements");
    }
    @Test(priority = 10)
    public void userCanAddElement(){
        Assert.assertTrue(addRemoveElementsPage.getAddElement().isDisplayed());
        addRemoveElementsPage.clickOnAddElement();
        Assert.assertEquals(driver.getCurrentUrl(), addRemoveElementsPage.getUrl());
        Assert.assertTrue(addRemoveElementsPage.getDeleteElement().isDisplayed());
    }

    @Test(priority = 20)
    public void userCanRemoveElement() {
        addRemoveElementsPage.clickOnAddElement();
        Assert.assertTrue(addRemoveElementsPage.getDeleteElement().isDisplayed());

        addRemoveElementsPage.clickOnDeleteButton();
        Assert.assertFalse(addRemoveElementsPage.elementIsDisplayed());


    }


}
