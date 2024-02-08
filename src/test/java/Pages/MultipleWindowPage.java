package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Set;

public class MultipleWindowPage {
    WebDriver driver;
    WebElement clickHereBtn;
    String actualURL;
    String tabs;


    public MultipleWindowPage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement getClickHereBtn() {
        return driver.findElement(By.linkText("Click Here"));
    }

    public String getActualURL() {
        return "https://the-internet.herokuapp.com/windows";
    }



    //-------------------------------

    public void clickOnClickBtn(){
        getClickHereBtn().click();
    }


    public ArrayList<String> getTabs() {
        return new ArrayList<>(driver.getWindowHandles());
    }

    public void switchToWindow(){
        driver.switchTo().window(getTabs().get(1));
    }



}
