package driverTest;

public class TestExample extends BaseTest {

    public static void main(String[] args) {
        TestExample objc = new TestExample();
        objc.setupBrowser("chrome", "https://www.irctc.co.in/nget/train-search");
    }
}
