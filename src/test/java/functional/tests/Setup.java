package functional.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Setup {

    @BeforeClass
    public void doSetUp(){
        System.out.println("Setup done..");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("Destroying resources");
    }


}
