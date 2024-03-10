package tests;

import config.BaseTest;
import helpers.TopMenuItem;
import org.testng.annotations.Test;
import pages.*;

public class IlcarroTest extends BaseTest {
    @Test
    public void Test_001() throws InterruptedException {

        SearchPage searchPage = new SearchPage(getDriver());
//        LoginPage loginPage =searchPage.openTopMenu(TopMenuItem.LOGIN);
//        loginPage.openTopMenu(TopMenuItem.SEARCH);
        LetTheCarWorkPage lcwp = searchPage.openTopMenu(TopMenuItem.LET_THE_CAR_WORK);
        lcwp.setManufacturer("BMW").addLocation("Tel-Aviv")
                .setFuelType().photoAttachment("/Users/ilyapesin/IdeaProjects/MyWebProject_QA41/src/test/screenshots/screen_1710018127887.png");
        Thread.sleep(3000);
    }

    @Test
    public void testRegistrationPositives() throws Exception {
        int i=(int)(System.currentTimeMillis()/1000)%3600;
        SearchPage searchPage = new SearchPage(getDriver());
        RegistrationPage registrationPage = new RegistrationPage(getDriver());
        registrationPage.openTopMenu(TopMenuItem.SIGN_UP);
        registrationPage
                .fillNameField("Vasya")
                .fillLastNameField("Pupkin")
                .fillEmailField("vasya_pupkin"+i+"@gmail.com")
                .fillPasswordField("Vp12345$")
                .clickCheckbox()
                .clickBtnRegistrations()
                .clickBtnAlert()
                ;
    }
}
