package org.seleniumqa.lesson_2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

/**
 * Created by admin on 11.02.2015.
 */
public class test2 {
    String month;

    @BeforeTest
    public void setUp() {
        month = "2";
    }

    @Test
    public void isCorrectMonth() {
        assertTrue(isCorrect(month));
    }

    private boolean isCorrect(String month) {

        String s1 = "January";
        String s2 = "February";
        String s3 = "March";
        String s4 = "April";
        String sd = "Error";
        String n;


        switch (month) {
            case ("1"): n = s1;

            case ("2"):
                n = s2;
            case ("3"):
                n = s3;

            case ("4"):
                n = s4;

            default:
                n = sd;

        }

        if ()

    }
    @AfterTest
    public void tearDown(){
        month=0;
    }
}