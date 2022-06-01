package daleks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageCalculator {

    private WebDriver driver;

    public PageCalculator(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openCalculator() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }

    @FindBy(xpath = "//select[@id='selectBuild']")
    private WebElement selectBuild;

    @FindBy(xpath = "//select[name='selectBuild']/option[value='2']")
    private WebElement selectBuildPrototype;

    @FindBy(xpath = "//input[@name='number1']")
    private WebElement number1;

    @FindBy(xpath = "//input[@name='number2']")
    private WebElement number2;

    @FindBy(xpath = "//select[@name='selectOperation']")
    private WebElement operation;

    @FindBy(xpath = "//option[normalize-space()='Subtract'])[1]")
    private WebElement operationSubtract;

    @FindBy(xpath = "//input[@id='calculateButton']")
    private WebElement calculateButton;

    @FindBy(xpath = "//input[@id='numberAnswerField']")
    private WebElement numberAnswer;

    public void moveDown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(selectBuild).build();
    }

    public void chooseSelectBuildPrototype() {
        new Select(selectBuild).selectByVisibleText("Prototype");
    }

    public void sendFirstNumber2() {
        number1.sendKeys("2");
    }

    public void sendSecondNumber3() {
        number2.sendKeys("3");
    }

    public void chooseOperationSubtract() {
        new Select(operation).selectByVisibleText("Subtract");
    }

    public void clickCalculateButton() {
        calculateButton.click();
    }

    public String getNumberAnswer() {
        String answer = numberAnswer.getAttribute("value");
        return answer;
    }

    public void sendFirstNumber_gs() {
        number1.sendKeys("gs");
    }

    public void sendSecondNumber_bu() {
        number2.sendKeys("bu");
    }

    public void chooseOperationConcatenate() {
        new Select(operation).selectByVisibleText("Concatenate");
    }

}
