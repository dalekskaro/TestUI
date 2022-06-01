package daleks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class AllTests {

    public static WebDriver driver;
    public static PageCalculator calculatorPage;
    public static PageNumberGame numberGamePage;

    @BeforeAll
    static void setupClass() {
        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver_101.0.4951.41\\chromedriver.exe");
    }

    @BeforeEach
    void setupTest() {
        if (driver != null) {
            return;
        }
        driver = new ChromeDriver();
        calculatorPage = new PageCalculator(driver);
        numberGamePage = new PageNumberGame(driver);

        Runtime.getRuntime().addShutdownHook(
                new Thread(()->{
                    driver.quit();
                    driver = null;
                }));
    }

    @Test
    void differenceTwoIntegers() {
        calculatorPage.openCalculator(); //Открыть сайт
        calculatorPage.moveDown(); //Проскроллить вниз до конца
        calculatorPage.chooseSelectBuildPrototype(); //Выбрать сборку (Build) «Prototype»
        calculatorPage.sendFirstNumber2(); //Ввести в поле First number значение «2»
        calculatorPage.sendSecondNumber3(); //Ввести в поле Second number значение «3»
        calculatorPage.chooseOperationSubtract(); //Выбрать операцию (Operation) «Subtract»
        calculatorPage.clickCalculateButton(); //Нажать на кнопку «Calculate»
        Assert.assertEquals("-1", calculatorPage.getNumberAnswer()); //Проверить, что Answer = «-1»
    }

    @Test
    void concatenationTwoStrings() {
        calculatorPage.openCalculator(); //Открыть сайт
        calculatorPage.moveDown(); //Проскроллить вниз до конца
        calculatorPage.chooseSelectBuildPrototype(); //Выбрать сборку (Build) «Prototype»
        calculatorPage.sendFirstNumber_gs(); //Ввести в поле First number значение «gs»
        calculatorPage.sendSecondNumber_bu(); //Ввести в поле Second number значение «bu»
        calculatorPage.chooseOperationConcatenate(); //Выбрать операцию (Operation) «Concatenate»
        calculatorPage.clickCalculateButton(); //Нажать на кнопку «Calculate»
        Assert.assertEquals("gsbu", calculatorPage.getNumberAnswer()); //Проверить, что Answer = «gsbu»
    }

    @Test
    void messageAppearance() {
        numberGamePage.openNumberGame(); //Открыть сайт
        numberGamePage.moveDown(); //Проскроллить вниз до конца
        numberGamePage.chooseSelectBuildDemo(); //Выбрать сборку (Select Build) «Demo»
        numberGamePage.clickRollDiceButton(); //Нажать на кнопку «Roll the dice»
        numberGamePage.sendString(); //Ввести в поле значение «string»
        numberGamePage.clickSubmitButton(); //Нажать на кнопку «Submit»
        Assert.assertEquals("string: Not a number!", numberGamePage.messageNotNumber());
        //Проверить, «string: Not a number!»
    }
}
