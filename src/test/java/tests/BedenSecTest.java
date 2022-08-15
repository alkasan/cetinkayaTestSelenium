package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BedenSecTest {
    WebDriver driver;
    private ExpectedConditions ExceptionConditions;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cetinkaya.com.tr/kadin/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebElement cookiesOK = driver.findElement(By.id("eu-cookie-ok"));
        cookiesOK.click();

        WebElement bedenSec =driver.findElement(By.xpath("//*[@id=\"navigation-Beden\"]/ul/li[2]/label"));
        bedenSec.click();


    }
}
