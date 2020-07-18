package mydemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBar {

    @Test
    public static void main(String args[]) throws InterruptedException {

        // Set the webdriver to chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriverNew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open the website to be navigated
        driver.navigate().to("http://automationpractice.com/index.php");

        // Maximize the windows
        driver.manage().window().maximize();

        // Click on textbox of search
        driver.findElement(By.id("search_query_top")).click();

        Thread.sleep(3000);

        // Search bar
        WebElement textboxSearch = driver.findElement(By.id("search_query_top"));

        // Search keyword dress and press enter
        textboxSearch.sendKeys("dress");
        textboxSearch.sendKeys(Keys.ENTER);


    }
}