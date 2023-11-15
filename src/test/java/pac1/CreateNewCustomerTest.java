package pac1;

import org.testng.annotations.*;

public class CreateNewCustomerTest {

    @Test()
    public void create() {
        System.out.println("Create Customer and Verify the customer is created.");
    }

    @Test
    public void modify() {
        System.out.println("Create Customer, Modify the customer and Verify the modified Customer.");
    }

    @BeforeMethod
    public void lgoin() {
        System.out.println("Login to Application.");
    }

    @AfterMethod
    public void logout() {
        System.out.println("Logout of Application.");
    }

    @BeforeClass
    public void browserLaunch() {
        System.out.println("==Launch Empty Browser, Database Connection==");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Close the Browser, Disconnect DB.");
    }

}
