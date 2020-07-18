package mydemo;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    @Test
    public static void main(String args[]) {

        // Set the webdriver to chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriverNew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open the website to be navigated
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Maximize the windows
        driver.manage().window().maximize();

        // Clicks on Signup option on the menubar
        driver.findElement(By.className("header_user_info")).click();

        // Enters the emailId 
        driver.findElement(By.id("email")).sendKeys("sneha3010khanna@gmail.com");

        // Enters the password 
        driver.findElement(By.id("passwd")).sendKeys("snehakhann");

        // Clicks on the SignIn button
        driver.findElement(By.id("SubmitLogin")).click();

        // Actual URL displaying
        String actualUrl = driver.getCurrentUrl();

        // Expected URL to be displayed after Login
        String expectedUrl = "http://automationpractice.com/index.php?controller=my-account";

        // Comparing both the URL's
        if (expectedUrl != actualUrl) {
            System.out.println("Authentication Failed! Enter Valid emailId and password");
        }


    }

}