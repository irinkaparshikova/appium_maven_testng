package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultListPage extends BasePage {

    public ResultListPage(WebDriver driver){

        super(driver);
    }

    By searchResult = By.id(app_package_name + "typeahead_item_view");

    public ResultPage selectResultListItem(String keyword){

        waitForVisibilityOf(searchResult);

        if(driver.findElement(searchResult).getText().contains(keyword)){

            List<WebElement> results = driver.findElements(searchResult);
            results.get(0).click();

            return new ResultPage(driver);
        }

        System.out.println("Couldn't find the result");
        return null;
    }

}
