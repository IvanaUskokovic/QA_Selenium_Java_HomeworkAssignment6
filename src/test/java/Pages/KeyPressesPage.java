package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.SPACE;

public class KeyPressesPage {
    WebDriver driver;

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement keyPressesBtn, inputField, text;
    String actualURL;


    public WebElement getKeyPressesBtn() {
        return driver.findElement(By.linkText("Key Presses"));
    }

    public WebElement getInputField() {
        return driver.findElement(By.id("target"));
    }

    public WebElement getText() {
        return driver.findElement(By.id("result"));
    }

    public String getActualURL() {
        return "https://the-internet.herokuapp.com/key_presses";
    }
    //----------------------------------------------

    public void inputIntoField(){
        getInputField().clear();
        getInputField().sendKeys(SPACE);
    }

    public String resultText(){
        return getText().getText();

    }
}
