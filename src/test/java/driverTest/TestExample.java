package driverTest;

public class TestExample extends BaseTest {

    public static void main(String[] args) {
        TestExample objc = new TestExample();
        TestExample objf = new TestExample();
        TestExample obje = new TestExample();
        objc.setupBrowser("chrome", "https://www.rightmove.co.uk");
        objf.setupBrowser("firefox", "https://www.ticketstoindia.com/");
        obje.setupBrowser("edge", "https://www.irctc.co.in/nget/train-search");

    }
}
