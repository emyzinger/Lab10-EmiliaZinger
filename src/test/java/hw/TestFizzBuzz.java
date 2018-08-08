 package hw;

import static hw.FizzBuzz.fizzBuzzArray;
import static hw.FizzBuzz.fizzBuzzList;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

 public class TestFizzBuzz {

    private FizzBuzz fixture;
    final String[] expected = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17"};

     // a string with the expected results from the fizzBuzz program

    @Before
    public void setUp() throws Exception {
        fixture = new FizzBuzz();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void testNegativeTen(){ //to make sure -10 cannot be entered
        assertNull(fizzBuzzList(-10));
    }

    @Test
    public void testNegativeOne(){ //to make sure -1 cannot be entered
        assertNull(fizzBuzzList(-1));
    }

    @Test
    public void testZero(){ //to make sure 0 cannot be entered
        assertNull(fizzBuzzList(0));
    }

    @Test
    public void testOne(){ //making sure 1 gets the correct result
        assertEquals(Arrays.asList(Arrays.copyOfRange(expected,0,1)), (fizzBuzzList(1)));

    }

     @Test
     public void testSeven(){ //making sure 7 gets the correct result
         assertEquals(Arrays.asList(Arrays.copyOfRange(expected,0,7)), (fizzBuzzList(7)));

     }

     @Test
     public void testSeventeen(){ //making sure 17 gets the correct result
         assertEquals(Arrays.asList(expected), (fizzBuzzList(17)));
     }
}
