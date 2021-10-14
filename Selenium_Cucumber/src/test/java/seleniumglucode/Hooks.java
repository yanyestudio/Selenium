package seleniumglucode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static ChromeDriver  driver;
    private static int nCase=0;
    @Before
    private void  setUp()  {
        nCase ++;
       System.out.println (" OJO!   Number  " + nCase +" is running right now");
      // System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
      // System.setProperty("webdriver.chrome.driver", "C://Projects//Selenium//Selenium_Cucumber//src//test//resources//chromedriver//chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", "C:\\Projects//Selenium\\Selenium_Cucumber\\src\\test\\resources\\chromedriver\\chromedriver.exe");

       // driver = new ChromeDriver();


       //driver.manage().deleteAllCookies();
       // driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(50000,TimeUnit.SECONDS);
      //  driver.get("https://imalittletester.com/");
       // driver.manage().window().maximize();
    }
    @After
    public void tearDown () {

        System.out.println (" OJO! Number  " + nCase +" finished");
//       driver.quit();
    }
    public static ChromeDriver getDriver(){

    //   return driver;
        return null;

    }


}
