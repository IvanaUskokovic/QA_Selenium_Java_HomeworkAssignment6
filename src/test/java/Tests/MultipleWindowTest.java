package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("Multiple Windows");
    }
    @Test(priority = 10)

    public void userCanOpenNewWindow()  {
        Assert.assertEquals(driver.getCurrentUrl(), multipleWindowPage.getActualURL());

        multipleWindowPage.clickOnClickBtn();
        multipleWindowPage.switchToWindow();

        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/windows/new");

    }

}
