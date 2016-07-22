package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ResultPage extends BasePage{

    public ResultPage(WebDriver driver){

        super(driver);
    }

    By profileName = By.id(app_package_name + "profile_view_top_card_full_name");

    public HomePage resultCheck(){

        waitForVisibilityOf(profileName);

        String typedPass = driver.findElement(profileName).getText();
        Assert.assertEquals(typedPass, "jacksparrowqa123");

        return new HomePage(driver);
    }

}
