package practicum;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class MainPageScooter {

    private final WebDriver driver;

    private final By question0InButton = By.id("accordion__heading-0");    // локатор вопроса 0
    private final By answerForQuestion0 = By.id("accordion__panel-0");  // локатор вопроса 0
    private final By question1InButton = By.id("accordion__heading-1");// локатор вопроса 1
    private final By answerForQuestion1 = By.id("accordion__panel-1"); // локатор ответа 1

    private final By question2InButton = By.id("accordion__heading-2"); // локатор вопроса 2

    private final By answerForQuestion2 = By.id("accordion__panel-2"); // локатор ответа 2

    private final By question3InButton = By.id("accordion__heading-3"); // локатор вопроса 3

    private final By answerForQuestion3 = By.id("accordion__panel-3"); // локатор ответа 3

    private final By question4InButton = By.id("accordion__heading-4"); // локатор вопроса 4

    private final By answerForQuestion4 = By.id("accordion__panel-4"); // локатор ответа 4

    private final By question5InButton = By.id("accordion__heading-5");  // локатор вопроса 5

    private final By answerForQuestion5 = By.id("accordion__panel-5");  // локатор ответа 5

    private final By question6InButton = By.id("accordion__heading-6");// локатор вопроса 6

    private final By answerForQuestion6 = By.id("accordion__panel-6");  // локатор ответа 6

    private final By question7InButton = By.id("accordion__heading-7"); // локатор вопроса 7

    private final By answerForQuestion7 = By.id("accordion__panel-7");   // локатор ответа 7


    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    // методы для 0 вопроса

    public void ckrollForQuestion0InButton() {
        WebElement element = driver.findElement(question0InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element); //скрол до вопроса
    }

    public void clickQuestion0InButton() {
        driver.findElement(question0InButton).click(); // клик по вопросу
    }

    public void waitAnswer0() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion0));
    }

    public String findTextAnswer0 () {
        return driver.findElement(answerForQuestion0).getText();// получаем текст ответа на вопрос
    }

    public void checkAnswerForQuestion0(){
        ckrollForQuestion0InButton();
        clickQuestion0InButton();
        waitAnswer0();
        findTextAnswer0();
    }

    // методы для 1 вопроса
    public void ckrollForQuestion1InButton() {
        WebElement element = driver.findElement(question1InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickQuestion1InButton() {
        driver.findElement(question1InButton).click();
    }
    public void waitAnswer1() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion1));
    }
    public String findTextAnswer1 () {
        return driver.findElement(answerForQuestion1).getText();
    }
    public void checkAnswerForQuestion1(){
        ckrollForQuestion1InButton();
        clickQuestion1InButton();
        waitAnswer1();
        findTextAnswer1();
    }

    //методы для 2 вопроса

    public void ckrollForQuestion2InButton() {
        WebElement element = driver.findElement(question2InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestion2InButton() {
        driver.findElement(question2InButton).click();
    }
    public void waitAnswer2() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion2));
    }
    public String findTextAnswer2 () {
        return driver.findElement(answerForQuestion2).getText();
    }
    public void checkAnswerForQuestion2(){
        ckrollForQuestion2InButton();
        clickQuestion2InButton();
        waitAnswer2();
        findTextAnswer2();
    }


    // методы для 3 вопроса
    public void ckrollForQuestion3InButton() {
        WebElement element = driver.findElement(question3InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestion3InButton() {
        driver.findElement(question3InButton).click();
    }
    public void waitAnswer3() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion3));
    }
    public String findTextAnswer3 () {
        return driver.findElement(answerForQuestion3).getText();
    }
    public void checkAnswerForQuestion3(){
        ckrollForQuestion3InButton();
        clickQuestion3InButton();
        waitAnswer3();
        findTextAnswer3();
    }

    // методы для 4 вопроса

    public void ckrollForQuestion4InButton() {
        WebElement element = driver.findElement(question4InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestion4InButton() {
        driver.findElement(question4InButton).click();
    }
    public void waitAnswer4() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion4));
    }
    public String findTextAnswer4 () {
        return driver.findElement(answerForQuestion4).getText();
    }
    public void checkAnswerForQuestion4(){
        ckrollForQuestion4InButton();
        clickQuestion4InButton();
        waitAnswer4();
        findTextAnswer4();
    }

    // методы для 5 вопроса

    public void ckrollForQuestion5InButton() {
        WebElement element = driver.findElement(question5InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestion5InButton() {
        driver.findElement(question5InButton).click();
    }
    public void waitAnswer5() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion5));
    }
    public String findTextAnswer5 () {
        return driver.findElement(answerForQuestion5).getText();
    }
    public void checkAnswerForQuestion5(){
        ckrollForQuestion5InButton();
        clickQuestion5InButton();
        waitAnswer5();
        findTextAnswer5();
    }

    // методы для 6 вопроса

    public void ckrollForQuestion6InButton() {
        WebElement element = driver.findElement(question6InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestion6InButton() {
        driver.findElement(question6InButton).click();
    }
    public void waitAnswer6() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion6));
    }
    public String findTextAnswer6 () {
        return driver.findElement(answerForQuestion6).getText();
    }
    public void checkAnswerForQuestion6(){
        ckrollForQuestion6InButton();
        clickQuestion6InButton();
        waitAnswer6();
        findTextAnswer6();
    }

    // методы для 7 вопроса

    public void ckrollForQuestion7InButton() {
        WebElement element = driver.findElement(question7InButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestion7InButton() {
        driver.findElement(question7InButton).click();
    }
    public void waitAnswer7() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answerForQuestion7));
    }
    public String findTextAnswer7 () {
        return driver.findElement(answerForQuestion7).getText();
    }
    public void checkAnswerForQuestion7(){
        ckrollForQuestion7InButton();
        clickQuestion7InButton();
        waitAnswer7();
        findTextAnswer7();
    }


}
