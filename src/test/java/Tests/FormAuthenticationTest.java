package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormAuthenticationTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage.clickOnSideBar("Form Authentication");
    }

     @Test(priority = 10)
    public void userCanLogInWithValidCredentials(){
         Assert.assertEquals(driver.getCurrentUrl(), formAuthenticationPage.getLoggedInURL());
         Assert.assertTrue(formAuthenticationPage.getLogInBtn().isDisplayed());

         formAuthenticationPage.inputUsername("tomsmith");
         formAuthenticationPage.inputPassword("SuperSecretPassword!");
         formAuthenticationPage.clickOnLogInButton();

         Assert.assertEquals(driver.getCurrentUrl(),formAuthenticationSecurePage.getSecureURL());
         Assert.assertTrue(formAuthenticationSecurePage.getLogOutBtn().isDisplayed());
         Assert.assertTrue(formAuthenticationSecurePage.getLoginMessage().isDisplayed());

    }
       @Test (priority = 20)
       public void userCanLogOut(){
           formAuthenticationPage.inputUsername("tomsmith");
           formAuthenticationPage.inputPassword("SuperSecretPassword!");
           formAuthenticationPage.clickOnLogInButton();

           formAuthenticationSecurePage.clickOnLogOutButton();

           Assert.assertNotEquals(driver.getCurrentUrl(),formAuthenticationSecurePage.getSecureURL());
           Assert.assertTrue(formAuthenticationPage.getLogInBtn().isDisplayed());

}

       @Test(priority = 30)
    public void userCannotLogInWithInvalidUsername(){

           formAuthenticationPage.inputInvalidUsername("tom");
           formAuthenticationPage.inputPassword("SuperSecretPassword!");
           formAuthenticationPage.clickOnLogInButton();

           Assert.assertTrue(formAuthenticationPage.getLogInBtn().isDisplayed());
           Assert.assertTrue(formAuthenticationPage.getErrorMessage().isDisplayed());
       }


}
