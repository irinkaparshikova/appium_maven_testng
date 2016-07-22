package PageObjects;

import SetUp.AndroidSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends AndroidSetup {

    protected WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
    }

    //This is the peace of every locator on the app page
    String app_package_name = "com.linkedin.android:id/";

    //Method that waits for visiability of UI element
    protected void waitForVisibilityOf(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void swipeFromRightToPullMenu(){

        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.press(550, 600).moveTo(-200, 0).release().perform();

    }

    public void scrollPage() {

        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.press(350, 1000).moveTo(0, -500).release().perform();
    }

    public void tap() {
        ((AppiumDriver) driver).tap(1, driver.findElement(By.id(app_package_name + "")), 1000);
    }
}


