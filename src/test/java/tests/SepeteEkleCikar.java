package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SepeteEkleCikar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cetinkaya.com.tr/kadin-kaban/");
        //driver.manage().window().maximize();
        WebElement cookiesOK = driver.findElement(By.id("eu-cookie-ok"));
        cookiesOK.click();

        WebElement sepeteEkle = driver.findElement(By.xpath("div.picture-container a.cls-image picture img[alt='Resim Armato Kadın Krem Kapüşonlu Kaban'"));
        sepeteEkle.click();
    }
}
