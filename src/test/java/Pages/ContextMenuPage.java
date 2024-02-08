package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    WebDriver driver;
    String URL;


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement hotSpot;

    public String getUrl() {
        return "https://the-internet.herokuapp.com/context_menu";
    }

    public WebElement getHotSpot() {
        return driver.findElement(By.id("hot-spot"));
    }
    //-------------------------------------------------------

    public void rightClickOnHotSpot(){
        Actions actions = new Actions(driver);
        actions.contextClick(getHotSpot()).perform();
    }

    public String getTextFromContextMenu(){
        Alert alert = driver.switchTo().alert();
        return alert.getText() ;
    }
    public void clickOkOnContextMenu(){
        driver.switchTo().alert().accept();
    }



}
