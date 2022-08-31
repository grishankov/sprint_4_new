package pageObject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Faq {
    private final WebDriver driver;

    public Faq(WebDriver driver) {
        this.driver = driver;
    }

    public String getQuestionText(String text) {
        return this.driver.findElement(By.xpath("//*[text()='" + text + "']")).getText();
    }

    public void waitForLoadHomePage() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(3L))).until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_SubHeader__zwi_E")));
    }

    public void waitForLoadQuestionText(String text) {
        (new WebDriverWait(this.driver, Duration.ofSeconds(3L))).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + text + "']")));
    }
}
