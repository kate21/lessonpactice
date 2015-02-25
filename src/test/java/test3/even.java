package test3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class even {


 private int number;

       @BeforeTest
    public void setUp() {
number = 5;
   }

 @Test
public void isEvenTest() {
      assertTrue(isEven(number));
   }

public static boolean isEven(int x) {
 if (x % 2 == 0) return true;
else
return false;
}


@AfterTest
public void tearDown() {
 number = 0;
}

}




