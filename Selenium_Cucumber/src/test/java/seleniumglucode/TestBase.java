package seleniumglucode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.SecondPage;
import pom.HomePage;


public class TestBase {
   protected WebDriver  driver=Hooks.getDriver() ;
    protected  HomePage homePage = new HomePage(driver);
    protected SecondPage secondPage = new SecondPage(driver);

}
