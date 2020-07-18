package mydemo;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

    @Test
    public static void main(String args[]) {

        // Set the webdriver to chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriverNew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open the website to be navigated
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Clicks on SignIn option on the menubar
        driver.findElement(By.className("header_user_info")).click();

        // Maximize the windows
        driver.manage().window().maximize();

        // Enters the emailId to be registered
        driver.findElement(By.id("email_create")).sendKeys("sneha3010@gmail.com");

        // Clicks on the submit button
        driver.findElement(By.id("SubmitCreate")).click();

        // Registration form filling starts from here
        // Selecting radio button
        WebElement radio2 = driver.findElement(By.id("id_gender2"));
        radio2.click();

        // Enter first name
        driver.findElement(By.id("customer_firstname")).sendKeys("Sneha");

        // Enter last name 
        driver.findElement(By.id("customer_lastname")).sendKeys("Khanna");

        // Enter the password 
        driver.findElement(By.id("passwd")).sendKeys("sneha3010");

        // Enter DOB using dropdown
        Select dropdownDate = new Select(driver.findElement(By.id("days")));
        dropdownDate.selectByIndex(9);
        Select dropdownMonth = new Select(driver.findElement(By.id("months")));
        dropdownMonth.selectByIndex(5);
        Select dropdownYear = new Select(driver.findElement(By.id("years")));
        dropdownYear.selectByIndex(20);

        // Enter address information
        //driver.findElement(By.id("firstname")).sendKeys("Sneha");
        //driver.findElement(By.id("lastname")).sendKeys("Khanna");
        driver.findElement(By.id("address1")).sendKeys("Times square");
        driver.findElement(By.id("city")).sendKeys("New York");
        Select dropdownState = new Select(driver.findElement(By.id("id_state")));
        dropdownState.selectByVisibleText("New York");
        driver.findElement(By.id("postcode")).sendKeys("40055");
        Select dropdownCountry = new Select(driver.findElement(By.id("id_country")));
        dropdownCountry.selectByVisibleText("United States");
        driver.findElement(By.id("phone_mobile")).sendKeys("9954463255");
        driver.findElement(By.id("alias")).sendKeys("Baf-Hira nagar, Mumbai");

        // Click on register
        driver.findElement(By.id("submitAccount")).click();

    }

}