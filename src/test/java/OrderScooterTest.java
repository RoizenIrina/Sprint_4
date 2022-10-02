import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import practicum.OrderScooterMainPage;
import java.time.Duration;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderScooterTest {



    WebDriver driver = new ChromeDriver();
     //WebDriver driver = new FirefoxDriver();

    final String name;
    final String surname;
    final String address;
    final String phone;
    final String comment;

    public OrderScooterTest(String name, String surname, String address, String phone, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Ирина", "Кутина", "ул.Куликовская д.1", "+79639009090", "Подъезд №1"},
                {"Игорь", "Зайцев", "ул.Новоясеневская д.2", "+79638008080", "Позвоните за 2 часа до прибытия"},
        };
    }


    @Test
    public void checkOrderFromHeader_success() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderScooterMainPage checkOrderPage = new OrderScooterMainPage(driver);
        checkOrderPage.clickHeaderOrderButton();
        checkOrderPage.userName(name);
        checkOrderPage.userSurname(surname);
        checkOrderPage.userAddress(address);
        checkOrderPage.userPhone(phone);
        checkOrderPage.metroStation();
        checkOrderPage.metroStationChoice();
        checkOrderPage.nextPageButton();
        checkOrderPage.calendarDate();
        checkOrderPage.rentalDuration();
        checkOrderPage.scooterColour();
        checkOrderPage.userComment(comment);
        checkOrderPage.orderButton();
        checkOrderPage.confirmButton();

        assertTrue("Order completed window does not appear", checkOrderPage.isOrderCreated());
    }

    @Test
    public void checkOrderFromRoadMapSection_success() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderScooterMainPage checkOrderPage = new OrderScooterMainPage(driver);
        checkOrderPage.checkFooterOrderButtonClickable();
        checkOrderPage.scrollToFooterOrderButton();
        checkOrderPage.clickFooterOrderButton();
        checkOrderPage.userName(name);
        checkOrderPage.userSurname(surname);
        checkOrderPage.userAddress(address);
        checkOrderPage.userPhone(phone);
        checkOrderPage.metroStation();
        checkOrderPage.metroStationChoice();
        checkOrderPage.nextPageButton();
        checkOrderPage.calendarDate();
        checkOrderPage.rentalDuration();
        checkOrderPage.scooterColour();
        checkOrderPage.userComment(comment);
        checkOrderPage.orderButton();
        checkOrderPage.confirmButton();

        assertTrue("Order completed window does not appear", checkOrderPage.isOrderCreated());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
