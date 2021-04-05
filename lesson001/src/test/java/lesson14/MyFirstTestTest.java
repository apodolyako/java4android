package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyFirstTestTest {
    private  MyFirstTest test;

    @BeforeEach
    public void init(){
        test = new MyFirstTest();
    }

    @Test
    void test1(){
        int[] arr = new int[]{1,2,3,4,5,67};
        Assertions.assertArrayEquals(new int[]{5,67}, test.afterLast4(arr) );
    }

    @Test
    void test2(){
        int[] arr = new int[]{1,2,3,5,67,4};
        Assertions.assertArrayEquals(new int[]{}, test.afterLast4(arr) );
    }

    @Test
    void test3(){
        int[] arr = new int[]{4,1,2};
        Assertions.assertArrayEquals(new int[]{1,2}, test.afterLast4(arr) );
    }

    @Test
    void test4(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        Assertions.assertArrayEquals(new int[]{5,6,7,8}, test.afterLast4(arr) );
    }


}