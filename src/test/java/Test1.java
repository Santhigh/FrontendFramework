import framework.base.Base;
import framework.resources.staticResource.GLOBAL_STATIC;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test1 extends Base {

    @BeforeMethod
    public void setUp() throws IOException {
        launchBrowser();
    }

    @Test
    public void test(){

    }

    @AfterMethod
    public void teardown()
    {
        GLOBAL_STATIC.driver.close();
    }

}
