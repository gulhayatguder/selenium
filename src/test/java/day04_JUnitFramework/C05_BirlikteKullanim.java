package day04_JUnitFramework;

import org.junit.*;

public class C05_BirlikteKullanim {
    @BeforeClass
    public  static  void  beforeClass(){
        System.out.println(" Befor class calisti  \n============================" );

    }
    @AfterClass
    public static void afterClass(){
        System.out.println(" \n============================ After class calisti  " );
    }
    @Before
    public void before(){
        System.out.println("   \n before methodu class calisti" );
    }
    @After
    public void after(){
        System.out.println("   \n after methodu class calisti" );

    } @Test
    public void test1(){
        System.out.println("\n..... Test 1  calisti");
    }
    @Test
    public void test2(){
        System.out.println("\n..... Test 2  calisti");
    }
    @Test
    public void test3(){
        System.out.println("\n..... Test 3   calisti");
    }
}
