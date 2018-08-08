package hw;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void fizzBuzz(int upperBound) {
        int iteration = 1; //number which will be printed
        while(iteration <= upperBound) { //making it loop the necessary number of times
            if ((iteration % 3 == 0)&&(iteration % 5 == 0)){ //divisible by 3 and 5
                System.out.println("FizzBuzz");
            }
            else
                if (iteration % 3 == 0){ //divisible by 3
                    System.out.println("Fizz");
                }
                else
                    if(iteration % 5 == 0){ //divisible by 5
                        System.out.println("Buzz");
                    }
                    else{ //not divisible by anything
                        System.out.println(iteration);
                    }
            iteration++; //makes the loop keep going and not be infinite
        }

    }

    public static String[] fizzBuzzArray(final int upperBound) { //for returning an array
        if (upperBound<= 0){ //if the upper bound is 0 or lower the array will return null as fizzBuzz cannot work
            return null;
        }
        String fizzBuzz[] = new String[upperBound];
        int iteration = 1; //number which will be printed
        while(iteration <= upperBound) { //making it loop the necessary number of times
            if ((iteration % 3 == 0)&&(iteration % 5 == 0)){ //divisible by 3 and 5
                fizzBuzz[iteration-1]= "FizzBuzz";
            }
            else
            if (iteration % 3 == 0){ //divisible by 3
                fizzBuzz[iteration-1]= "Fizz";
            }
            else
            if(iteration % 5 == 0){ //divisible by 5
                fizzBuzz[iteration-1]= "Buzz";
            }
            else{ //not divisible by anything
                fizzBuzz[iteration-1]= String.valueOf(iteration);
            }
            iteration++; //makes the loop keep going and not be infinite
        }
        return fizzBuzz;
    }

    public static List<String> fizzBuzzList(final int upperBound){ //do fizzBuzz returning a list
        List<String> fizzBuzz = new ArrayList<String>();
        if (upperBound<= 0){ //if the upper bound is 0 or lower the array will return null as fizzBuzz cannot work
            return null;
        }
        else {
            int iteration = 1; //number which will be printed
            while(iteration <= upperBound) { //making it loop the necessary number of times
                if ((iteration % 3 == 0)&&(iteration % 5 == 0)){ //divisible by 3 and 5
                    fizzBuzz.add("FizzBuzz");
                }
                else
                if (iteration % 3 == 0){ //divisible by 3
                    fizzBuzz.add("Fizz");
                }
                else
                if(iteration % 5 == 0){ //divisible by 5
                    fizzBuzz.add("Buzz");
                }
                else{ //not divisible by anything
                    fizzBuzz.add(String.valueOf(iteration));
                }
                iteration++; //makes the loop keep going and not be infinite
            }
            return fizzBuzz;
        }
    }

}
