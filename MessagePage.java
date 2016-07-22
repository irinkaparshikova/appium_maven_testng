package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessagePage extends HomePage {

    public MessagePage(WebDriver driver) {

        super(driver);

    }

    By msglibInput = By.id(app_package_name + "msglib_recipient_input");
    By checkField = By.id(app_package_name + "people_result_selected_check");
    By msgInput = By.id(app_package_name + "message_input");
    By msgSend = By.id(app_package_name + "message_input");

    public void createMessage(){

        waitForVisibilityOf(msglibInput);

        driver.findElement(msglibInput).sendKeys("Arthur Piluyk");

        driver.findElement(checkField).click();

        waitForVisibilityOf(msgInput);

        driver.findElement(msgInput).sendKeys("Hello from test.");

        waitForVisibilityOf(msgSend);

        driver.findElement(msgSend).click();

    }
}
