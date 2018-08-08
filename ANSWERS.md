*Emilia Zinger*
*Answers to Discussion Questions*

**Discussion Question Part 2:**
If n were not an argument, but a constant number, the code for the output could be hard coded in a method. This would not require any of the FizzBuzz logic to be coded or even considered, just the answer known. The problem with this would occur if the constant number was very large. Knowing when a number is divisible 5 is easy, but after a while knowing if it is divisible by 3 could get hard. Additionally, it would take a while to hard code that rather than write a program to do it for you.   
  
  **Discussion Question Part 3**
Part 2 could not have been automatically tested because it prints FizzBuzz rather than storing and return anything. In JUnit it is very difficult to intercept an output stream, if it is even possible. The only way that one would be able to find out if it works would be to actually run the program. 

**Discussion Question Part 4**
In the three parts the actual FizzBuzz logic stays the same, the way it is decided whether the number should be the number itself, fizz, buzz, or fizzbuzz. What changes between these parts is how the result is stored. This only changes a few lines of code such as including something that initializes an array or a list and then in the logic just adding to the array or list. In part 2 the there is no return and the method just prints the result, part 3 returns an Array that the main method is then responsible for printing, and part 4 returns a list that the main method is responsible for printing. The only difference that would be relevant when choosing between these 3 methods would be the ability to test them and how they are used next. The method in part 2 cannot be used by any other part of the program after it is called because it does not return an object. The other two parts are both able to be tested and used in other parts of the program, but they work differently; an Array is static and cannot be changed in size, or things can not be added into the middle easily. And choosing between those two would be dependent on what the result would be used for. 


