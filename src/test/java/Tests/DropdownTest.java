package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("Dropdown");
    }

    @Test(priority = 10)
    public void userCanSelectBetweenOptions(){
        Assert.assertEquals(driver.getCurrentUrl(),dropdownPage.getURL());
        Assert.assertTrue(dropdownPage.getText().isDisplayed());

        dropdownPage.clickOnOptionsField();
        dropdownPage.selectOptions("Option 2");

        Assert.assertEquals(dropdownPage.getTextFromField2(),"Option 2");

        dropdownPage.selectOptions("Option 1");

        Assert.assertEquals(dropdownPage.getTextFromField1(),"Option 1");

    }


}
