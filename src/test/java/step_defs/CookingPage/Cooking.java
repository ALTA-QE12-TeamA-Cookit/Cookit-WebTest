package step_defs.CookingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import app.netlify.cookit.pageObject.cooking.CookingPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_defs.Hooks;

public class Cooking {

    private final WebDriver driver = Hooks.driver;

    CookingPage cookingPage = new CookingPage(driver);

    @When("User click new cooking button")
    public void userClickNewCookingButton() throws InterruptedException {
        cookingPage.clickButtonNewPost();
    }

    @And("User input text field with {string}")
    public void userInputTextFieldWith(String text) throws InterruptedException {
        cookingPage.setInputTextPost(text);
    }

    @And("User input image with {string}")
    public void userInputImageWith(String path) throws InterruptedException {
        cookingPage.setInputFileImg(path);
    }

    @And("User click submit button")
    public void userClickSubmitButton() throws InterruptedException {
        cookingPage.clickButtonCreateSubmit();
        Thread.sleep(2000);
    }

    // READ

    @And("User click timeline tab")
    public void userClickTimelineTab() throws InterruptedException {
        Thread.sleep(3000);
        cookingPage.clickTabTimeline();
    }

    @And("User click first button comment cooking post")
    public void userClickFirstButtonCommentCookingPost() throws InterruptedException {
        Thread.sleep(3000);
        cookingPage.clickButtonComment();
    }

    @When("User input comment on cooking post with {string}")
    public void userInputCommentOnCookingPostWith(String text) throws InterruptedException {
        Thread.sleep(3000);
        cookingPage.setInputComment(text);
    }

    @Then("Verify first comment username is same with {string}")
    public void verifyFirstCommentUsernameIsSameWith(String username) {
        Assert.assertEquals(cookingPage.getResultUsername(), username);
    }

    @And("Like on someone cooking post")
    public void likeOnSomeoneCookingPost() throws InterruptedException {
        Thread.sleep(3000);
        cookingPage.clickButtonLike();
        Thread.sleep(3000);
    }
}
