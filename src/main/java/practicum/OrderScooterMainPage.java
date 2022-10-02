package practicum;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;


public class OrderScooterMainPage {


    private final By headerOrderButton = cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g"); //кнопка "Заказать" вверху страницы
    private final By footerOrderButton = cssSelector("div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button"); //кнопка "Заказать" внизу страницы
    private final By userName = xpath("//div[@class='Order_Form__17u6u']/div[1]/input"); //поле ввода имени
    private final By userSurname = xpath("//div[@class='Order_Form__17u6u']/div[2]/input"); //поле ввода фамилии
    private final By userAddress = xpath("//div[@class='Order_Form__17u6u']/div[3]/input"); //поле ввода адреса
    private final By userPhone = xpath("//div[@class='Order_Form__17u6u']/div[5]/input"); //поле ввода телефона
    private final By metroStation = xpath("//div[@class='Order_Form__17u6u']/div[4]"); //поле выбра станции, раскрытие выпадающего списка
    private final By metroStationChoice = xpath("//div[@class='select-search__select']/ul/li/button/div[2]"); //поле выбра станции, выбор элемента списка для тестового набора 1
    private final By nextPageButton = cssSelector("div.Order_NextButton__1_rCA > button.Button_Middle__1CSJM"); //кнопка "Далее"
    private final By calendarDate = xpath("//div[@class='Order_Form__17u6u']/div/div/div/input");  //поле для ввода даты
    private final By rentalDuration = xpath("//div[@class='Dropdown-control']"); //поле выбора периода аренды, раскрытие выпадающего списка
    private final By rentalDurationChoice = xpath("//div[@class='Dropdown-menu']/div[2]"); //поле выбра периода аренды, выбор элемента списка
    private final By scooterColour = xpath("//div[@class='Order_Checkboxes__3lWSI']/label[1]"); //выбор цвета для тестового набора 1
    private final By userComment = xpath("//div[@class='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");  //поле ввода комментария
    private final By orderButton = xpath("//div[@class='Order_Buttons__1xGrp']/button[2]"); //кнопка "Заказать"
    private final By confirmButton = xpath("//div[@class='Order_Modal__YZ-d3']/div[2]/button[2]"); //кнопка "Да"
    private final By orderCreated = xpath("//*[contains(text(), 'Заказ оформлен')]"); //Заказ оформлен

    private final WebDriver driver;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // готовим нужный форматтер
    String date = LocalDate.now().plusDays(3).format(formatter); // получаем текущую дату, прибавляем к ней 3 дня и форматируем

    public OrderScooterMainPage(WebDriver driver) {
        this.driver = driver;
    }



    public void clickHeaderOrderButton() {
        driver.findElement(headerOrderButton).click();
    }

    public void checkFooterOrderButtonClickable() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(footerOrderButton));
    }

    public void scrollToFooterOrderButton() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(footerOrderButton));
        // Поиск элемента с кнопкой заказа из секции с road_map и скролл до нее

        Object elementOrderButton = driver.findElement(footerOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementOrderButton);
    }

    public void clickFooterOrderButton() {
        driver.findElement(footerOrderButton).click();
    }

    public void userName(String name){
        driver.findElement(userName).sendKeys(name);
    }
    public void userSurname(String surname) {
        driver.findElement(userSurname).sendKeys(surname);
    }
    public void userAddress(String address) {
        driver.findElement(userAddress).sendKeys(address);
    }
    public void userPhone(String phone) {
        driver.findElement(userPhone).sendKeys(phone);
    }
    public void metroStation() {
        driver.findElement(metroStation).click();
    }
    public void metroStationChoice() {
        driver.findElement(metroStationChoice).click();
    }
    public void nextPageButton() {
        driver.findElement(nextPageButton).click();
    }
    public void calendarDate() {
        driver.findElement(calendarDate).click();
        driver.findElement(calendarDate).sendKeys(date);
        driver.findElement(calendarDate).sendKeys(Keys.ENTER);

    }
    public void rentalDuration() {
        driver.findElement(rentalDuration).click();
        driver.findElement(rentalDurationChoice).click();
    }
    public void scooterColour() {
        driver.findElement(scooterColour).click();
    }
    public void userComment(String comment) {
        driver.findElement(userComment).sendKeys(comment);
    }
    public void orderButton() {
        driver.findElement(orderButton).click();
    }
    public void confirmButton() {
        driver.findElement(confirmButton).click();
    }


    public boolean isOrderCreated() {
        try {
            return driver.findElement(orderCreated).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

