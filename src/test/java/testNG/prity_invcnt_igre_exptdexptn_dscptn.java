package testNG;

import org.testng.annotations.Test;

public class prity_invcnt_igre_exptdexptn_dscptn {
    @Test(priority = -1)
    public static void method1(){
        System.out.println("Method1");
    }

    @Test(priority = 0)
    public static void method2(){
        System.out.println("Method2");

    }
    @Test(invocationCount = 3)
    public static void method3(){

        System.out.println("Method3");
    }

    @Test(description = "my name is billa")
    public static void method4(){
        System.out.println("Method4");

    }

    @Test(expectedExceptions = ArithmeticException.class)
    public static void method5(){
        System.out.println("Method5");
        int s = 10/0;
        System.out.println(s);

    }


    @Test(enabled = false)
    public static void method6(){
        System.out.println("Method6");

    }
    public static void method7(){
        System.out.println("Method7");

    }
}
