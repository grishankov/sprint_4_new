package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Main {
    private final WebDriver driver;
    private final By yandexLogo = By.className("Header_LogoYandex__3TSOI");
    private final By samokatLogo = By.className("Header_LogoScooter__3lsAR");
    private final By buttonCookie = By.id("rcc-confirm-button");
    private final By buttonOrderUp = By.xpath(".//button[@class='Button_Button__ra12g']");
    private final By buttonOrderDown = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By name = By.xpath("//input[@placeholder='* Имя']");
    private final By surname = By.xpath("//input[@placeholder='* Фамилия']");
    private final By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metro = By.xpath("//input[@placeholder='* Станция метро']");
    private final By metroStation = By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']");
    private final By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By buttonThen = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By date = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private final By aboutRent = By.xpath("//*[text() = 'Про аренду']");
    private final By rentalPeriod = By.xpath("//*[@class='Dropdown-control']");
    private final By day = By.xpath("//*[text() = 'сутки']");
    private final By scooterColor = By.id("black");
    private final By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrderRent = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By buttonYes = By.xpath("//*[text() = 'Да']");
    private final By buttonOrderStatus = By.xpath("//button[@class='Header_Link__1TAG7']");
    private final By orderNumber = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private final By buttonGO = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    public Main(WebDriver driver) {
        this.driver = driver;
    }

    public void setYandexLogo() {
        this.driver.findElement(this.yandexLogo).click();
    }

    public void setSamokatLogo() {
        this.driver.findElement(this.samokatLogo).click();
    }

    public void setButtonCookie() {
        this.driver.findElement(this.buttonCookie).click();
    }

    public void setButtonOrderUp() {
        this.driver.findElement(this.buttonOrderUp).click();
    }

    public void setButtonOrderDown() {
        this.driver.findElement(this.buttonOrderDown).click();
    }

    public void setName(String nameEnter) {
        this.driver.findElement(this.name).sendKeys(nameEnter);
    }

    public void setSurname(String surnameEnter) {
        this.driver.findElement(this.surname).sendKeys(surnameEnter);
    }

    public void setAddress(String addressEnter) {
        this.driver.findElement(this.address).sendKeys(addressEnter);
    }

    public void setMetro() {
        this.driver.findElement(this.metro).sendKeys(Keys.ARROW_DOWN);
    }

    public void setMetro2() {
        this.driver.findElement(this.metroStation).click();
    }

    public void setPhone(String phoneEnter) {
        this.driver.findElement(this.phone).sendKeys(phoneEnter);
    }

    public void setButtonThen() {
        this.driver.findElement(this.buttonThen).click();
    }

    public void setDate(String dateEnter) {
        this.driver.findElement(this.date).sendKeys(dateEnter);
    }

    public void setAboutRent() {
        this.driver.findElement(this.aboutRent).click();
    }

    public void setRentalPeriod() {
        this.driver.findElement(this.rentalPeriod).click();
    }

    public void setDay() {
        this.driver.findElement(this.day).click();
    }

    public void setScooterColor() {
        this.driver.findElement(this.scooterColor).click();
    }

    public void setComment(String commentEnter) {
        this.driver.findElement(this.comment).sendKeys(commentEnter);
    }

    public void setButtonOrderRent() {
        this.driver.findElement(this.buttonOrderRent).click();
    }

    public void setButtonYes() {
        this.driver.findElement(this.buttonYes).click();
    }

    public void setButtonOrderStatus() {
        this.driver.findElement(this.buttonOrderStatus).click();
    }

    public void setOrderNumber() {
        this.driver.findElement(this.orderNumber).sendKeys();
    }

    public void setButtonGO() {
        this.driver.findElement(this.buttonGO).click();
    }

    public void Order(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter) {
        this.setButtonCookie();
        this.setButtonOrderUp();
        this.setName(nameEnter);
        this.setSurname(surnameEnter);
        this.setAddress(addressEnter);
        this.setMetro();
        this.setMetro2();
        this.setPhone(phoneEnter);
        this.setButtonThen();
        this.setDate(dateEnter);
        this.setAboutRent();
        this.setRentalPeriod();
        this.setDay();
        this.setScooterColor();
        this.setComment(commentEnter);
        this.setButtonOrderRent();
        this.setButtonYes();
        this.setButtonOrderStatus();
        this.setOrderNumber();
        this.setButtonGO();
    }

    public void Order2(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter) {
        this.setButtonCookie();
        this.setButtonOrderDown();
        this.setName(nameEnter);
        this.setSurname(surnameEnter);
        this.setAddress(addressEnter);
        this.setMetro();
        this.setMetro2();
        this.setPhone(phoneEnter);
        this.setButtonThen();
        this.setDate(dateEnter);
        this.setAboutRent();
        this.setRentalPeriod();
        this.setDay();
        this.setScooterColor();
        this.setComment(commentEnter);
        this.setButtonOrderRent();
        this.setButtonYes();
    }
}
