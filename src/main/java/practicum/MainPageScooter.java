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
    private final static String page = "https://qa-scooter.praktikum-services.ru/";

    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public String checkAnswerForQuestion(By question, By answer) {
        driver.get(page);
        WebElement element = driver.findElement(question);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element); //скрол до вопроса
        driver.findElement(question).click(); // клик по вопросу
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(answer));
        return driver.findElement(answer).getText();
    }

}