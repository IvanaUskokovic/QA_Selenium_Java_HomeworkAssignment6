package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElementsPage {
    WebDriver driver;

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement addElement;
    WebElement deleteElement;
    String Url;

    public WebElement getAddElement() {
        return driver.findElement(By.cssSelector("button[onclick='addElement()']"));
    }
    public WebElement getDeleteElement() {
        return  driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
    }

    public String getUrl() {
        return "https://the-internet.herokuapp.com/add_remove_elements/";
    }


   //------------------------------------------------------------------------------------

   public void clickOnAddElement(){
        getAddElement().click();
   }



    public void clickOnDeleteButton(){
        getDeleteElement().click();
    }


    public boolean elementIsDisplayed (){
        boolean isDisplayed = false;
        try{
            isDisplayed = getDeleteElement().isDisplayed();
        }catch(Exception e){
            System.out.println(e);
        }
        return isDisplayed;
    }

}
