package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationSecurePage {

    WebDriver driver;

    public FormAuthenticationSecurePage(WebDriver driver) {
        this.driver = driver;
    }
    String secureURL;
    WebElement loginMessage,  logOutBtn;

    public String getSecureURL() {
        return "https://the-internet.herokuapp.com/secure";
    }

    public WebElement getLoginMessage() {
        return driver.findElement(By.id("flash-messages"));
    }

    public WebElement getLogOutBtn() {
        return driver.findElement(By.linkText("Logout"));
    }
    //---------------------------------------------------
     public void clickOnLogOutButton(){
        getLogOutBtn().click();
}

}
