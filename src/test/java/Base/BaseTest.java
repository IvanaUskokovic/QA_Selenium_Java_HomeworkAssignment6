package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

   public WebDriver driver;
   public HomePage homePage;
   public WebDriverWait wait;
   public AddRemoveElementsPage addRemoveElementsPage;
   public ContextMenuPage contextMenuPage;
   public DropdownPage dropdownPage;
   public EntryAdPage entryAdPage;
   public FormAuthenticationPage formAuthenticationPage;
  public  FormAuthenticationSecurePage formAuthenticationSecurePage;
  public JavaScriptAlertsPage javaScriptAlertsPage;
  public KeyPressesPage keyPressesPage;
  public MultipleWindowPage multipleWindowPage;

   @BeforeClass
    public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       homePage = new HomePage(driver);
       wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       addRemoveElementsPage = new AddRemoveElementsPage(driver);
       contextMenuPage = new ContextMenuPage(driver);
       dropdownPage = new DropdownPage(driver);
       entryAdPage = new EntryAdPage(driver);
       formAuthenticationPage = new FormAuthenticationPage(driver);
       formAuthenticationSecurePage = new FormAuthenticationSecurePage(driver);
       javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
       keyPressesPage = new KeyPressesPage(driver);
       multipleWindowPage = new MultipleWindowPage(driver);

   }
   @AfterClass
   public void tearDown(){
      driver.manage().deleteAllCookies();
      driver.quit();
   }






}
