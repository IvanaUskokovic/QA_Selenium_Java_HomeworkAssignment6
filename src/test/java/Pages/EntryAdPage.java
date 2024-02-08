package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAdPage {
    WebDriver driver;
    String URL;
    WebElement modalWindowCloseBtn;
    WebElement modalWindowCloseBtn1;
    WebElement reEnableAd;

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return "https://the-internet.herokuapp.com/entry_ad";
    }

    public WebElement getModalWindowCloseBtn() {
        return driver.findElement(By.className("modal-footer"));
    }
    public WebElement getReEnableAd() {
        return driver.findElement(By.linkText("click here"));
    }
    public WebElement getModalWindowCloseBtn1() {
        return driver.findElement(By.className("modal-footer"));
    }
    //------------------------------------------------------

    public void clickOnCloseButton(){
        getModalWindowCloseBtn().click();
    }

   public boolean elementIsDisplayed (){
        boolean isDisplayed = false;
        try{
            isDisplayed = getModalWindowCloseBtn().isDisplayed();
        }catch(Exception e){
            System.out.println(e);
        }
        return isDisplayed;
    }
      public void clickOnReEnableButton(){
        getReEnableAd().click();
}


}
