package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchPage;

public class AppiumTest extends AndroidSetup {
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void loginTest() {

        new LoginPage(driver).showTest();
    }

    @Test

    public void searchTest(){

        new SearchPage(driver).searchFor("Jack Sparrow");
    }

}

