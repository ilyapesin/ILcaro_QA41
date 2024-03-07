package tests;

import config.BaseTest;
import helpers.TopMenuItem;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;

public class IlcarroTest extends BaseTest {
    @Test
    public void Test_001() throws InterruptedException {

        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = homePage.openTopMenu(TopMenuItem.LOGIN);
        loginPage.openTopMenu(TopMenuItem.SEARCH);
        Thread.sleep(3000);
    }
}
