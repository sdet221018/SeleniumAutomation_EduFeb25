package driverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    public void setupBrowser(String browser, String url) {
        String fs = System.getProperty("file.separator");
        String driverDir = System.getProperty("user.dir") + fs + "drivers" + fs;

        String osName = System.getProperty("os.name");
        String fileExtn = osName.contains("Windows") ? ".exe" : "";

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverDir + "chromedriver" + fileExtn);
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", driverDir + "geckodriver" + fileExtn);
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", driverDir + "msedgedriver" + fileExtn);
            driver = new EdgeDriver();
        }
        else {
            System.out.println("Valid browser is not provided, hence quitting the automation run.");
        }

        // Implicitly Wait / Global Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        if (url != "")
            driver.get(url);
        else
            driver.get("about:blank");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        System.out.println("The Browser is maximised Now.");

        // To delete all cookies during run time
        driver.manage().deleteAllCookies();
        System.out.println("All the cookies of the Browser are deleted Now.");

        // To refresh the browser
        driver.navigate().refresh();
        System.out.println("The Browser is refreshed Now.");
    }

    public void identifyElements() {
//        Thread.sleep(3000);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait1.until(ExpectedConditions.elementToBeClickable(By.id("email")));

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("rakeshSinghraks");

        WebElement password = driver.findElement(By.id("pass"));
        password.clear();
        password.sendKeys("hakoonamatata");

        driver.findElement(By.name("login")).click();

//        Thread.sleep(3000);

////        WebElement error = driver.findElement(By.className("_9ay7"));
//
//        String errormessage = error.getText();
//        System.out.println("Error Message = " + errormessage);

        // Navigate back to facebook.com
        driver.navigate().back();

        // Capture logo WebElement
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));

//        driver.navigate().back();

        // Check if logo is displayed on the screen
        boolean statusofLogo = logo.isDisplayed();
        System.out.println("Is the Logo present on the Screen ? " + statusofLogo);

        // Click on Create New Account button
        WebElement CreateNewAccount = driver.findElement(By.xpath("//a[@role=\"button\" and text() = 'Create new account']"));

        // Explicitly Wait / Local Wait
        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.elementToBeClickable(CreateNewAccount));

        CreateNewAccount.click();

        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        boolean statusOfRadioButton = male.isSelected();
        System.out.println("Status of Male Radio Button = " + statusOfRadioButton);

        // Sign Up Button
        WebElement SignUp = driver.findElement(By.name("websubmit"));

        String fontFamily = SignUp.getCssValue("font-family");
        System.out.println("The FontFamily of Sign Up Button is " + fontFamily);

        // How to get the attribute value of a WebElement
        String attribute = SignUp.getAttribute("type");
        System.out.println("The attribute value of the WebElement " + SignUp + " is " + attribute);

        SignUp.click();
    }

    public void TearDownBrowser() {
        // Close the Browser
        //driver.close();

        // Close all the Tabs of the Browser
        driver.quit();
    }
}
