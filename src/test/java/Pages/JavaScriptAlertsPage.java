package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertsPage {

    WebDriver driver;
    WebElement JsAlertPrompt, result ;
    String actualURL;

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement getResult() {
        return  driver.findElement(By.id("result"));
    }

    public String getActualURL() {
        return "https://the-internet.herokuapp.com/javascript_alerts";
    }
    public WebElement getJsAlertPrompt() {
        return driver.findElement(By.cssSelector("button[onclick = 'jsPrompt()']"));
    }

    //------------------------------------------------
    public void clickOnJsPromptBtn(){
        getJsAlertPrompt().click();
    }

    public String getTextFromPrompt(){
        Alert prompt = driver.switchTo().alert();
        return prompt.getText();

    }

    public void inputTextInPromptField(String text){
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys(text);
        prompt.accept();
    }

    public String resultText(){
        return getResult().getText();
    }




}

