package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("JavaScript Alerts");
    }
    @Test(priority = 10)
    public void userCanInputTextInJsPrompt() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),javaScriptAlertsPage.getActualURL());

        javaScriptAlertsPage.clickOnJsPromptBtn();

        Assert.assertEquals(javaScriptAlertsPage.getTextFromPrompt(),"I am a JS prompt");

        javaScriptAlertsPage.inputTextInPromptField("Ovo je JS prompt");

        Assert.assertEquals(javaScriptAlertsPage.resultText(), "You entered: Ovo je JS prompt");

    }


}
