package org.seleniumqa.lesson_2;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.System.out;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

import java.io.*;


/**
 * Created by admin on 09.02.2015.
 */
public class prime_num {

    private int number;
    @BeforeTest
        public void setUp(){
        number = 25;
    }
    @Test
    public void isPrimeTest() {
        assertTrue(isPrime(number));
    }

    public static boolean isPrime(int x) {
        if(x==2) return false;
        for (int i = 2; i < x / 2; i++) {
            if ((x % i) == 0)
                return false;
            else
                return true;
        }
    return true; }

    @AfterTest
    public void tearDown() {
        number = 0;
    }

    }




