package step_defs.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import app.netlify.cookit.pageObject.signin.SignInPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_defs.Hooks;


public class SignIn {

    private final WebDriver driver = Hooks.driver;

    SignInPage signInPage = new SignInPage(driver);

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Given("User already on Cookit landing page")
    public void userAlreadyOnCookitLandingPage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(signInPage.verifyLandingPageTitle());
    }

    @When("user click sign in button")
    public void userClickSignInButton() {
        signInPage.clickButtonLanding();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        signInPage.setInputUsername(username);
    }

    @And("input password {string}")
    public void inputPassword(String password) {
        signInPage.setInputPassword(password);
    }

    @And("click Log in button")
    public void clickLogInButton() {
        signInPage.clickButtonLogin();
    }

    @Then("pop-up should return message with {string}")
    public void popUpShouldReturnMessageWith(String message) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='swal2-title']")));
        Assert.assertEquals(signInPage.getSweetAlert(), message);
    }
  
    @Then("warning pop-up should shown")
    public void warningPopUpShouldShown() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(signInPage.alertDisplayed());
    }
}
