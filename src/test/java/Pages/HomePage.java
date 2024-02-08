package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement sideBarButtons;


    public List<WebElement> getSideBarButtons() {
        return driver.findElements(By.tagName("a"));
    }
    //------------------------------------------------------
    public void clickOnSideBar(String sideBarName){
        for(WebElement element : getSideBarButtons()){
            if (element.getText().equals(sideBarName)) {
                element.click();
                break;

            }
        }
    }





}
