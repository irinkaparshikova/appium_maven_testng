package pages;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    By searchBar = By.id(app_package_name + "search_bar_text");


    public SearchPage searchFor(String keyword){

        waitForVisibilityOf(searchField);

        driver.findElement(searchField).sendKeys(keyword);

        if(driver.findElement(searchResult).getText().contains(keyword){

            List<WebElement> results = driver.findElements(searchResult);
            results.get(0).click();
            return new ResultPage(driver);
        }

        return new SearchPage(driver);
    }

}
