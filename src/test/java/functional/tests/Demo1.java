package functional.tests;

import org.testng.annotations.Test;

public class Demo1 extends Setup {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Test1 in Class Demo1 started..");
        Thread.sleep(10000);
        System.out.println("Test1 in class Demo1 finished..");
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Test2 in Class Demo1 started..");
        Thread.sleep(10000);
        System.out.println("Test2 in class Demo1 finished..");
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Test3 in Class Demo1 started..");
        Thread.sleep(10000);
        System.out.println("Test3 in class Demo1 finished..");
    }

}
