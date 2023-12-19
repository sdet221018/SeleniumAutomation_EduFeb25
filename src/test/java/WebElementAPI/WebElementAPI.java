package WebElementAPI;

import driverTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementAPI extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        WebElementAPI WebElemAPIchrome = new WebElementAPI();
        WebElementAPI WebElemeAPIfirefox = new WebElementAPI();
        WebElementAPI WebElemAPIedge = new WebElementAPI();

//        WebElemAPIedge.setupBrowser("edge", "https://www.facebook.com/");
//        WebElemeAPIfirefox.setupBrowser("firefox", "https://www.ticketstoindia.com/");
        WebElemAPIchrome.setupBrowser("chrome", "https://www.facebook.com/");

        // Identify the WebElements of the Facebook Login page
        WebElemAPIchrome.identifyElements();

        System.exit(0);
    }
}
