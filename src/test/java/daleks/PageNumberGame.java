package daleks;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageNumberGame {

    private WebDriver driver;

    public PageNumberGame(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openNumberGame() {
        driver.get("https://testsheepnz.github.io/random-number.html");
    }

    @FindBy(xpath = "//ul[@class='list-inline social-buttons']")
    private WebElement downPage;

    @FindBy(xpath = "//select[@id='buildNumber']")
    private WebElement selectBuild;

    @FindBy(xpath = "//input[@id='rollDiceButton']")
    private WebElement rollDiceButton;

    @FindBy(xpath = "//input[@id='numberGuess']")
    private WebElement numberGuess;

    @FindBy(xpath = "//input[@id='submitButton']")
    private  WebElement submitButton;

    @FindBy(xpath = "(//i)[3]")
    private WebElement messageNotNumber;

    public void moveDown() {
        new Actions(driver).moveToElement(downPage).build();
    }

    public void chooseSelectBuildDemo() {
        new Select(selectBuild).selectByVisibleText("Demo");
    }

    public void clickRollDiceButton() {
        rollDiceButton.click();
    }

    public void sendString() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(numberGuess));
        numberGuess.sendKeys("string");
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String messageNotNumber() {
        String message = messageNotNumber.getText();
        return message;
    }
}
