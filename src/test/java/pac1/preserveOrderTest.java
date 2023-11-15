package pac1;

import org.testng.annotations.Test;

public class preserveOrderTest {

    @Test(priority=2, invocationCount = 10)
    public void A() {
        System.out.println("Modify Customer");
    }

    @Test(priority=-1)
    public void B() {
        System.out.println("Create Customer");
    }

    @Test(priority=0)
    public void C() {
        System.out.println("Verify Customer");
    }

    @Test(priority=3, enabled = false)
    public void D() {
        System.out.println("Delete Customer");
    }


}
