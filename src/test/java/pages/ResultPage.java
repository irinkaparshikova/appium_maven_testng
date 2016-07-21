package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage extends BasePage{

    public ResultPage(WebDriver driver){

        super(driver);
    }

    By searchResult = By.id(app_package_name + "typeahead_item_view");

}
