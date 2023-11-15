package pac1;

import org.testng.annotations.Test;

public class dependsonTest {

    @Test(dependsOnMethods = "Test3")
    public void Test1() {
        System.out.println("Login to the Private Application");
    }

    @Test(dependsOnMethods= "Test1")
    public void Test2() {
        System.out.println("Create, Modify and Verify the Customer");
    }

    @Test()
    public void Test3() {
        System.out.println("Verify Database connection is set.");
    }
}
