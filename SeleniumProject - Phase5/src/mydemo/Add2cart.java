package mydemo;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add2cart {

    @Test
    public static void main(String args[]) throws InterruptedException {

        // Set the webdriver to chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriverNew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open the website to be navigated
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_product=5&controller=product']")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement button1 = driver.findElement(By.name("Submit"));
        button1.click();

    }

}