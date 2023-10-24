package org.example.pageObject.cooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cooking {
    public static WebDriver webDriver;

    public Cooking(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    //CREATE

    @FindBy(xpath = "//textarea[@class='input w-full input-primary h-20 py-2 font-light']")
    private WebElement inputTextPost;

    @FindBy(xpath = "//label[@class='btn btn-secondary  w-full sm:w-20 sm:btn-sm flex gap-2']/input[1]")
    private WebElement inputFileImg;

    @FindBy(xpath = "//button[@class='btn btn-primary sm:w-20 w-full sm:btn-sm']")
    private WebElement buttonSubmit;

    public void setInputTextPost(String text) {
        inputTextPost.sendKeys(text);
    }

    public void setInputFileImg(String pathFile) {
        inputFileImg.sendKeys(pathFile);
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }

    // READ

    @FindBy(xpath = "//div[@class='flex justify-self-center']/button[.='0']")
    private WebElement buttonLike;

    public void clickButtonLike() {
        buttonLike.click();
    }
}
