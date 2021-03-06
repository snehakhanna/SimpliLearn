package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

    WebDriver driver;

    @org.testng.annotations.Test(priority = 1)
    public void registration() {
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
        driver.findElement(By.id("email_create")).sendKeys("snehakhanna@gmail.com");

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
        driver.findElement(By.id("passwd")).sendKeys("snehakhanna");

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

    @org.testng.annotations.Test(priority = 2)
    public void login() {
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
        driver.findElement(By.id("passwd")).sendKeys("snehakhanna");

        // Clicks on the SignIn button
        driver.findElement(By.id("SubmitLogin")).click();

    }

    @org.testng.annotations.Test(priority = 3)
    public void search() throws InterruptedException {
        // Set the webdriver to chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriverNew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open the website to be navigated
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Maximize the windows
        driver.manage().window().maximize();
        driver.findElement(By.id("search_query_top")).click();

        Thread.sleep(3000);

        // Search bar
        WebElement textboxSearch = driver.findElement(By.id("search_query_top"));
        textboxSearch.sendKeys("dress");
        textboxSearch.sendKeys(Keys.ENTER);

    }

    @org.testng.annotations.Test(priority = 4)
    public void addToCart() {
        // Set the webdriver to chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriverNew\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_product=5&controller=product']")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement button1 = driver.findElement(By.name("Submit"));
        button1.click();
        //driver.findElement(By.name("Submit")).click();

    }

}