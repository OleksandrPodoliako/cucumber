package steps;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import pages.MainPage;

import static org.testng.Assert.assertTrue;

public class MainPageStep {
    private By logo = By.cssSelector("#header img");
    private MainPage mainPage;

    private BaseUtil baseUtil;

    public MainPageStep(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("^Navigate to new post site$")
    public void goToNewPostSite() {
        baseUtil.driver.get("https://novaposhta.ua/");
        mainPage = new MainPage(baseUtil.driver);
    }

    @Then("^Check that logo is visible$")
    public void logoShouldBeVisible() {
        assertTrue(mainPage.logo.isDisplayed());
    }

    @Then("^Click to exit button$")
    public void clickToExitButton() {
        mainPage.openLogInMenu();
    }

    @And("^Log in ([^\"]*) ([^\"]*)$")
    public void logIn(String login, String password) {
        mainPage.logIn(login, password);
    }

    @Then("^Check that error message appears$")
    public void checkThatErrorMessageAppears() {
        assertTrue(mainPage.errorPopUp.isDisplayed());
    }
}
