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
import static org.openqa.selenium.By.cssSelector;

@RunWith(Parameterized.class)
public class OrderScooterTest {

    WebDriver driver = new ChromeDriver();
     //WebDriver driver = new FirefoxDriver();

    final By buttonAddress;
    final String name;
    final String surname;
    final String address;
    final String phone;
    final String comment;

    public OrderScooterTest(By buttonAddress, String name, String surname, String address, String phone, String comment) {
        this.buttonAddress = buttonAddress;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g"), "Ирина", "Кутина", "ул.Куликовская д.1", "+79639009090", "Подъезд №1"},
                {cssSelector("div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button"), "Игорь", "Зайцев", "ул.Новоясеневская д.2", "+79638008080", "Позвоните за 2 часа до прибытия"},
        };
         }

    @Test
    public void checkOrderFromHeader_success() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        OrderScooterMainPage objCheckOrderPage = new OrderScooterMainPage(driver);
        objCheckOrderPage.open();
        objCheckOrderPage.findCheckAndClickOrderButton(buttonAddress);
        objCheckOrderPage.userName(name);
        objCheckOrderPage.userSurname(surname);
        objCheckOrderPage.userAddress(address);
        objCheckOrderPage.userPhone(phone);
        objCheckOrderPage.metroStation();
        objCheckOrderPage.metroStationChoice();
        objCheckOrderPage.nextPageButton();
        objCheckOrderPage.calendarDate();
        objCheckOrderPage.rentalDuration();
        objCheckOrderPage.scooterColour();
        objCheckOrderPage.userComment(comment);
        objCheckOrderPage.orderButton();
        objCheckOrderPage.confirmButton();
        assertTrue("Order completed window does not appear", objCheckOrderPage.isOrderCreated());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
