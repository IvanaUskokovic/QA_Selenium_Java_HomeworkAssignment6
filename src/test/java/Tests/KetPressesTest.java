package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KetPressesTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("Key Presses");
    }
    @Test(priority = 10)
    public void userCanInputTextIntoField(){
        Assert.assertEquals(driver.getCurrentUrl(), keyPressesPage.getActualURL());
        keyPressesPage.inputIntoField();
       Assert.assertEquals(keyPressesPage.resultText(),"You entered: SPACE");

    }


}
