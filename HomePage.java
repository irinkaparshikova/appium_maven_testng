package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){

        super(driver);
    }

    By searchBar = By.id(app_package_name + "search_bar_text");
    By navButton = By.id(app_package_name + "home_nav_tab_icon");
    By convSearch = By.id(app_package_name + "conversation_search_container");
    By writeIcon = By.id(app_package_name + "fab");

    public ResultListPage searchFor(String keyword){

        waitForVisibilityOf(searchBar);

        driver.findElement(searchBar).sendKeys(keyword);

        return new ResultListPage(driver);

    }

    public MessagePage openMessagePage(){

        waitForVisibilityOf(navButton);

        driver.findElement(By.xpath("//*[content-desc='Messaging']")).click();

        waitForVisibilityOf(convSearch);

        driver.findElement(writeIcon).click();

        return new MessagePage(driver);

    }

}
