import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorTest {
    private WebDriver driver;

    public ErrorTest(WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public void before() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void errorName() {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Имя']")).sendKeys("rmm");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).click();
        Assertions.assertTrue(driver.findElement(By.xpath("//*[text()='Введите корректное имя']")).getText()
                .contains("Введите корректное имя"));
    }

    @Test
    public void errorFamilia() {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).sendKeys("GJkhj");
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Введите корректную фамилию']")).getText()
                .contains("Введите корректную фамилию"));
    }

    @Test
    public void errorAdress() {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"))
                .sendKeys("рмр");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Введите корректный адрес']")).getText()
                .contains("Введите корректный адрес"));
    }

    @Test
    public void errorMetro() {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Имя']")).sendKeys("Игорь");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).sendKeys("Левада");
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"))
                .sendKeys("г. Москва, ул. Карла Маркса д.1");

        driver.findElement(By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"))
                .sendKeys("89001502000");
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Выберите станцию']")).getText()
                .contains("Выберите станцию"));
    }

    @Test
    public void errorMetro2() {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Имя']")).sendKeys("Игорь");
        driver.findElement(By.xpath("//input[@placeholder='* Фамилия']")).sendKeys("Левада");
        driver.findElement(By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"))
                .sendKeys("г. Москва, ул. Карла Маркса д.1");
        driver.findElement(By.xpath("//input[@placeholder='* Станция метро']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']")).click();

        driver.findElement(By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"))
                .sendKeys("ыаы");
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
        Assertions.assertTrue( driver.findElement(By.xpath("//*[text()='Введите корректный номер']")).getText()
                .contains("Введите корректный номер"));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}