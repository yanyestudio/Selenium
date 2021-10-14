package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends BasePage {
    @FindBy(className="page-title")
    final By titlelocatorSecond= By.name("My Conference Talks – imalittletester");
    final By LinkAutomation =By.linkText("https://imalittletester.com/category/automation/");
    final By ContributionText= By.id("post-1674");

    public By getContributionText() {
        return ContributionText;
    }





    public By getLinkAutomation() {
        return LinkAutomation;
    }

     public boolean isTitleSecondDisplayed() throws Exception {

        return this.isDisplayed(titlelocatorSecond);
    }


    public SecondPage(WebDriver driver){
        super(driver);
    }

    public void clickOnlinkAutomation() throws Exception {
        this.click(getLinkAutomation());
    }
}
