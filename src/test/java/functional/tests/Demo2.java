package functional.tests;

import org.testng.annotations.Test;

import java.util.Set;
import org.testng.annotations.Test;

public class Demo2 extends Setup {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Test1 in Class Demo2 started..");
        Thread.sleep(10000);
        System.out.println("Test1 in class Demo2 finished..");
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Test2 in Class Demo2 started..");
        Thread.sleep(10000);
        System.out.println("Test2 in class Demo2 finished..");
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Test3 in Class Demo2 started..");
        Thread.sleep(10000);
        System.out.println("Test3 in class Demo2 finished..");
    }

}

