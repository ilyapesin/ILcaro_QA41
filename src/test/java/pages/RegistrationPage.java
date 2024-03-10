package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static java.sql.DriverManager.getDriver;

public class RegistrationPage extends BasePage{
    @FindBy(xpath = "//*[@id='name']")
    WebElement nameField;
    @FindBy(xpath = "//*[@id='lastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//*[@id='email']")
    WebElement emailField;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordField;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement btnRegister;

    @FindBy(xpath = "//*[@type='button']")
    WebElement btnAlert;
    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public RegistrationPage fillNameField(String name){
        nameField.sendKeys(name);
        return this;
    }

    public RegistrationPage fillLastNameField(String lastname){
        lastNameField.sendKeys(lastname);
        return this;
    }

    public RegistrationPage fillEmailField(String email){
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage fillPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }
    public RegistrationPage clickCheckbox(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#terms-of-use').click();");
        return this;
    }
    public RegistrationPage clickBtnRegistrations(){
        btnRegister.click();
        return this;
    }

    public SearchPage clickBtnAlert(){
        btnAlert.click();
        return new SearchPage(driver);
    }
}
