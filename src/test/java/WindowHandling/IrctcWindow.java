package WindowHandling;

import driverTest.BaseTest;
import driverTest.TestExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class IrctcWindow extends BaseTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karim Shaik\\dev\\source\\practise\\February25thAutomation\\drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        // Launch the Browser with a specific URL
        driver.get("https://www.irctc.co.in/nget/train-search");

//        IrctcWindow irctc = new IrctcWindow();
//        irctc.setupBrowser("chrome", "https://www.irctc.co.in/nget/train-search");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        // How to get the current Window Id
        String parentWin = driver.getWindowHandle();
        System.out.println("Parent Window Id: " + parentWin);

        WebElement flights = driver.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']"));
        flights.click();

        // How to get all the Window Ids
        Set<String> set = driver.getWindowHandles();
        System.out.println(set);

        // How to retrieve each Window Id
        Iterator<String> it = set.iterator();
        String parentWinId = it.next();
        String childWinId = it.next();
        boolean anyWin = it.hasNext();
        System.out.println("Parent Window Id: " + parentWinId);
        System.out.println("Child Window Id: " + childWinId);
        System.out.println("Do we have any more Windows ? " + anyWin);

        // Shift the focus of Selenium to the Child Window
        driver.switchTo().window(childWinId);

        // Gt the Title of the page
        String title = driver.getTitle();
        System.out.println(title);

        driver.close();

        // Selenium now lost it's focus - Now switch the focus to the desired Window
        driver.switchTo().window(parentWinId);

        // Check the current URL
        String url = driver.getCurrentUrl();
        System.out.println("The current URL is: " + url);

        System.out.println("The Title of the Current Window: " + driver.getTitle());

        driver.quit();

        System.exit(0);
    }
}
