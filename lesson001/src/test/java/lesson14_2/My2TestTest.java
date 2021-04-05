package lesson14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class My2TestTest {

   private My2Test exp;

    @BeforeEach
    public void init(){
        exp = new My2Test();
    }

    @Test
    void test1(){
        int[] arr = new int[]{1,1,1,4,4,1,4,4};
        boolean flag = true;
        Assertions.assertEquals(true, exp.checkNum(arr));
    }

    @Test
    void test2(){
        int[] arr = new int[]{1,1,1,1,1,1};
        boolean flag = true;
        Assertions.assertEquals(false, exp.checkNum(arr));
    }

    @Test
    void test3(){
        int[] arr = new int[]{4,4,4,4};
        boolean flag = true;
        Assertions.assertEquals(false, exp.checkNum(arr));
    }

    @Test
    void test4(){
        int[] arr = new int[]{1,4,4,1,1,4,3};
        boolean flag = true;
        Assertions.assertEquals(false, exp.checkNum(arr));
    }


}