package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cetinkaya.com.tr/");

        //ARAMA BUTONUNA METİN YAZIP, SONUÇ GÖRÜNTÜLEME
        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        searchBox.click();
        searchBox.sendKeys("ayakkabi");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/div/div"));
        searchButton.click();

    }
}
