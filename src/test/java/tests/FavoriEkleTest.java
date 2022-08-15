package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FavoriEkleTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cetinkaya.com.tr/kadin-kaban/");
        //driver.manage().window().maximize();

        WebElement favButton = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/button"));
        favButton.click();


//       WebElement cookies = driver.findElement(By.id("eu-cookie-ok"));
//       cookies.click();

        Thread.sleep(5);
        driver.get("https://www.cetinkaya.com.tr/armato-kadin-krem-kapusonlu-kaban-4/");
        //burada çerezleri kabul etmem lazım
        WebElement favButton2= driver.findElement(By.id("add-to-wishlist-button-62334828e27b7f3506a01dbe"));
        favButton2.click();






    }
}
