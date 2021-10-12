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
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
        driver.get("https://imalittletester.com/");
    }
    @After
    public void tearDown () {

        System.out.println (" OJO! Number  " + nCase +" finished successfully");
       //driver.quit();
    }
    public static ChromeDriver getDriver(){

        return driver;
    }


}
