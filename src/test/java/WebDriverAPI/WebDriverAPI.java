package WebDriverAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAPI {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karim Shaik\\dev\\source\\practise\\February25thAutomation\\drivers\\chromedriver.exe");

        // Launches Light Browser
        WebDriver driver = new ChromeDriver();

        // Launch the Browser
        driver.get("https://facebook.com");

        // Maximize the Browser
        driver.manage().window().maximize(); // Method chaining in Java Terminology

        // Navigate to amazon.co.uk
        driver.navigate().to("https://www.amazon.co.uk");

        // Navigate back to facebook.com
        driver.navigate().back();
        String currentURL = driver.getCurrentUrl();
        System.out.println("The Current URL after Navigating Back: " + currentURL);

        // Navigate back to amazon.co.uk
        driver.navigate().forward();
        String currentTitle = driver.getTitle();
        System.out.println("The Current Title after Navigating Forward: " + currentTitle);

        // To delete all cookies during run time
        driver.manage().deleteAllCookies();

        // To refresh the browser
        driver.navigate().refresh();
        System.out.println("The Browser is refreshed Now.");

        // Close the Browser
        driver.close();

        // Close all the Tabs of the Browser
        driver.quit();

        System.exit(0);
    }
}
