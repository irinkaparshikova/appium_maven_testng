package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){

        super(driver);
    }

    By searchBar = By.id(app_package_name + "search_bar_text");

    public ResultPage searchFor(String keyword){

        driver.findElement(searchBar).sendKeys(keyword);

        if(driver.findElement(searchBar))

    }

}
