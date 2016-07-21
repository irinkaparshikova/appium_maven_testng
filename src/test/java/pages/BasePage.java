package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import scenarios.AndroidSetup;

public class BasePage extends AndroidSetup {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //This is the peace of every locator on the page
    String app_package_name = "com.linkedin.android:id/";

    //Method that waits for visiability of UI element
    protected void waitForVisibilityOf(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
