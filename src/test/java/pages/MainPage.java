package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(how = How.CSS,using = "#header img")
    public WebElement logo;

    @FindBy(how = How.CSS,using = "#user_menu span")
    public WebElement exitButton;

    @FindBy(how = How.CSS,using = "#inputEmail")
    public WebElement loginEdit;

    @FindBy(how = How.CSS,using = "#inputPassword")
    public WebElement passwordEdit;

    @FindBy(how = How.CSS,using = ".btn")
    public WebElement submitButton;

    @FindBy(how = How.CSS,using = ".errorSummary")
    public WebElement errorPopUp;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void openLogInMenu(){
        exitButton.click();
    }

    public void logIn(String login ,String password){
        loginEdit.sendKeys(login);
        passwordEdit.sendKeys(password);
        submitButton.click();
    }
}
