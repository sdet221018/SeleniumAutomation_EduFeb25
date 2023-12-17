package driverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

        if (url != "")
            driver.get(url);
        else
            driver.get("about:blank");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        System.exit(0);
    }
}
