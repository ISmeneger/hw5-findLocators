package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLocatorsTest {
    WebDriver driver;
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void openHomePageTest() throws InterruptedException {
        String webFormUrl = "web-form.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'web-form')]")).click();
        String currentUrl = driver.getCurrentUrl();

        assertEquals(BASE_URL + webFormUrl, currentUrl);

        driver.findElement(By.id("my-text-id")).sendKeys("My login name");
        Thread.sleep(1000);
        driver.findElement(By.name("my-password")).sendKeys("Qwerty");
        Thread.sleep(1000);
        driver.findElement(By.name("my-textarea")).sendKeys("My name is Ilya");
        Thread.sleep(1000);
        WebElement disabledInput = driver.findElement(By.name("my-disabled"));

        assertEquals("Disabled input", disabledInput.getDomAttribute("placeholder"));
        Thread.sleep(1000);

        WebElement readonlyInput = driver.findElement(By.name("my-readonly"));

        assertEquals("Readonly input", readonlyInput.getDomAttribute("value"));
        Thread.sleep(1000);

        driver.findElement(By.className("form-select")).sendKeys("Open this select menu");
        Thread.sleep(1000);
        driver.findElement(By.className("form-select")).sendKeys("One");
        Thread.sleep(1000);
        driver.findElement(By.className("form-select")).sendKeys("Two");
        Thread.sleep(1000);
        driver.findElement(By.className("form-select")).sendKeys("Three");
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys("San Francisco");
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys("New York");
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys("Seattle");
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys("Los Angeles");
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.name("my-datalist")).sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("my-datalist")).sendKeys("Los Chicago");
        Thread.sleep(1000);

        String selectFile = "C:\\Users\\Lenovo\\IdeaProjects\\hw5-findLocators\\src\\test\\java\\downloads\\STE In Banner.jpg";
        driver.findElement(By.name("my-file")).sendKeys(selectFile);
        Thread.sleep(1000);

        driver.findElement(By.id("my-check-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("my-check-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("my-radio-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("my-radio-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("my-colors")).click();
        Thread.sleep(1000);
        WebElement dateBox = driver.findElement(By.name("my-date"));
        dateBox.click();
        Thread.sleep(1000);
        dateBox.sendKeys("03172025");
        Thread.sleep(2000);

        WebElement exampleRange = driver.findElement(By.name("my-range"));
        while (true) {
            exampleRange.getDomAttribute("value == 10");
            exampleRange.sendKeys(Keys.ARROW_RIGHT);
            break;
        }
        Thread.sleep(1000);
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);
    }
}


