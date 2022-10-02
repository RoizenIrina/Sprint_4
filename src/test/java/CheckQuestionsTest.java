import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import practicum.MainPageScooter;
import java.time.Duration;
import static org.junit.Assert.assertEquals;


public class CheckQuestionsTest {
    //WebDriver driver = new FirefoxDriver();
    WebDriver driver = new ChromeDriver();

    @Test
    public void checkAnserFor0Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick0Question = new MainPageScooter(driver);
        String expectAnswer0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";  //назначила переменную с ожидаемым ответом для сравнения
        objClick0Question.checkAnswerForQuestion0();
        assertEquals("AnserFor0QuestionFaild", expectAnswer0, objClick0Question.findTextAnswer0());
    }

    @Test
    public void checkAnserFor1Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick1Question = new MainPageScooter(driver);
        String expectAnswer1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        objClick1Question.checkAnswerForQuestion1();
        assertEquals("AnserFor1QuestionFaild", expectAnswer1, objClick1Question.findTextAnswer1());
    }

    @Test
    public void checkAnserFor2Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick2Question = new MainPageScooter(driver);
        String expectAnswer2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        objClick2Question.checkAnswerForQuestion2();
        assertEquals("AnserFor2QuestionFaild", expectAnswer2, objClick2Question.findTextAnswer2());
    }

    @Test
    public void checkAnserFor3Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick3Question = new MainPageScooter(driver);
        String expectAnswer3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        objClick3Question.checkAnswerForQuestion3();
        assertEquals("AnserFor3QuestionFaild", expectAnswer3, objClick3Question.findTextAnswer3());
    }
    @Test
    public void checkAnserFor4Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick4Question = new MainPageScooter(driver);
        String expectAnswer4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        objClick4Question.checkAnswerForQuestion4();
        assertEquals("AnserFor4QuestionFaild", expectAnswer4, objClick4Question.findTextAnswer4());
    }

    @Test
    public void checkAnserFor5Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick5Question = new MainPageScooter(driver);
        String expectAnswer5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        objClick5Question.checkAnswerForQuestion5();
        assertEquals("AnserFor5QuestionFaild", expectAnswer5, objClick5Question.findTextAnswer5());
    }

    @Test
    public void checkAnserFor6Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick6Question = new MainPageScooter(driver);
        String expectAnswer6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        objClick6Question.checkAnswerForQuestion6();
        assertEquals("AnserFor6QuestionFaild", expectAnswer6, objClick6Question.findTextAnswer6());
    }

    @Test
    public void checkAnserFor7Question (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objClick7Question = new MainPageScooter(driver);
        String expectAnswer7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        objClick7Question.checkAnswerForQuestion7();
        assertEquals("AnserFor7QuestionFaild", expectAnswer7, objClick7Question.findTextAnswer7());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
