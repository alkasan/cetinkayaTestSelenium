package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrunAdediYukseltTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cetinkaya.com.tr/kadin/");
        driver.manage().window().maximize();

        WebElement bedenSecButton =driver.findElement(By.xpath("//*[@id=\"navigation-Beden\"]/ul/li[2]/label"));
        boolean isEnabled =bedenSecButton.isEnabled();
        System.out.println(isEnabled);
        if(isEnabled) {
            bedenSecButton.click();
        }





    }
}
