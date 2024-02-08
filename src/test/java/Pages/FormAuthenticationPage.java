package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationPage {
    WebDriver driver;



    public FormAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }
    //String validUsername, validPassword, loggedInURL;
    WebElement usernameField, passwordField,logInBtn, errorMessage;



    public String getLoggedInURL() {
        return "https://the-internet.herokuapp.com/login";
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLogInBtn() {
        return driver.findElement(By.cssSelector("button[type = 'submit']"));
    }
    public WebElement getErrorMessage() {
        return driver.findElement(By.id("flash"));
    }

    //------------------------------------------------------

    public void inputUsername(String username){
        getUsernameField().clear();
        getUsernameField().sendKeys(username);
    }

    public void inputInvalidUsername(String invalidUsername){
        getUsernameField().clear();
        getUsernameField().sendKeys(invalidUsername);
    }

    public void inputPassword(String password){
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }

    public void clickOnLogInButton(){
        getLogInBtn().click();
    }


}
