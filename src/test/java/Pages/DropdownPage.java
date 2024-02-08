package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownPage {
    WebDriver driver;
    String URL;
    WebElement text;
    WebElement optionsField;
    WebElement optionsFields;
    WebElement option1;
    WebElement options2;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return "https://the-internet.herokuapp.com/dropdown";
    }
    public WebElement getText() {
        return driver.findElement(By.cssSelector("option[disabled = 'disabled']"));
    }

    public WebElement getOptionsField() {
        return driver.findElement(By.id("dropdown"));
    }
    public WebElement getOption1() {
        return driver.findElement(By.cssSelector("option[value = '1']"));
    }
    public WebElement getOption2() {
        return driver.findElement(By.cssSelector("option[value = '2']"));
    }
    public List<WebElement> getOptionsFields() {
        return driver.findElements(By.tagName("option"));
    }


//--------------------------------------------------------------------------------------

    public void clickOnOptionsField(){
        getOptionsField().click();
    }

    public void clickOnOption1(){
        getOption1().click();
    }
    public String getTextFromField1(){
        return getOption1().getText();
    }
    public String getTextFromField2(){
        return getOption2().getText();
    }

   public void selectOptions(String name){
        for(WebElement element : getOptionsFields()){
            if(element.getText().equals(name)){
                element.click();
                break;
            }
        }
   }



}
