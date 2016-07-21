package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

       public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Login Page locators

    By firstSignIn = By.id(app_package_name + "growth_prereg_fragment_sign_in_button");
    By userEmail = By.id(app_package_name + "growth_login_join_fragment_email_address");
    By userPassword = By.id(app_package_name + "growth_login_join_fragment_password");
    By loginButton = By.id(app_package_name + "growth_login_fragment_sign_in");
    By homeButton = By.id(app_package_name + "home_nav_tab_icon");

    public LoginPage showTest() {

        waitForVisibilityOf(firstSignIn);

        driver.findElement(firstSignIn).click();

        driver.findElement(userEmail).sendKeys("jacksparrowqa@gmail.com");
        driver.findElement(userPassword).sendKeys("jacksparrowqa123");

        driver.findElement(loginButton).click();

        waitForVisibilityOf(homeButton);

//        String typedPass = driver.findElement(userPassword).getText();
//        Assert.assertEquals(typedPass, "jacksparrowqa123");

        return new LoginPage(driver);
    }

}
