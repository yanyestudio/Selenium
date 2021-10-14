package Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="C://Projects//Selenium//Selenium_Cucumber//src//test//java//features//test.feature"
        ,glue={"seleniumglucode"}
        ,strict = true
        ,plugin = {"pretty", "html:target/cucumber"}

)
public class Testrunner{
}