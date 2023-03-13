# Lab 06 - Stonks
In this lab, you will create a program that models a stock market based around the fictional cryptocurrency FazCoin.

## Step 1: Self-Explanation
Using the UML diagram and the [javadoc](https://csu-compsci-cs163-4.github.io/Lab06Stonks/package-summary.html), explain *in your own words* what is happening in `go()`. Put some comments above the different methods being called so that before you start coding, you know the big picture of how the game is going to work.

## Step 2: Coding
Take a look at the [javadoc](https://csu-compsci-cs163-4.github.io/Lab06Stonks/package-summary.html). Implement all methods, constructors, and vairables listed for each class. Some have already been provided for you, some you will need to write yourself. Make sure to test your methods as you complete each one. 

## Step 3: Playtest
Now that you have completed the methods and tested them individuallly, it is time to playtest the program in its entirety.

## Step 4: Turning In/Receiving Credit
Submit the lab in Zybooks by clicking through the Canvas link. Make sure Canvas updated (you may need to click the link again, and then click submit for grading again)!

## Using Random
The `Random` class is useful for providing random numbers in a program. The default for `nextDouble()` (no arguments provided) will return a double in the range of 0-1. To change the range of values that will be returned (NOT the size of the range), add or subtract your low-range value.

Ex: To get range from -30 to 70 percent:
```
exchangeRate += (randy.nextDouble() - 0.3)
```
To change the size of the range of return values (NOT NEEDED FOR THIS IMPLEMENTATION), add an argument to the `nextDouble()` call based on desired range size.

Ex: To get range from 0 - 99:
```
return random.nextDouble(100)
```

## Overloaded Methods/Constructors
Overloaded methods and constructors are useful because we can keep the same the same method signature or constructor name but change the arguments and get a unique method/constructor recognized by the compiler. 

Constructors:

Default constructors have no arguments provided. Inside the constructor, it is common to set default values to instance variables. Overloaded constructors have arguments, which can be used to customize the instance variables at time of construction.
```
class Rectangle{
    int length;
    int width;
    
    public Rectangle(){ //default constructor
        length = 2;
        width = 2;
    }
    
    public Rectangle(int length){ //overloaded constructor
        this.length = length;
        width = 2;
    }
    
    public Rectangle(int width){ //overloaded constructor
        length = 2;
        this.width = width;
    }
    
    public Rectangle(int length, int width){ //overloaded constructor
        this.length = length;
        this.width = width;
    }
}
```

Methods:

Overloaded methods are similar to constructors, in which different arguments can be used to change related methods' functionality.
```
public String getAction() { //default method
        return scanner.nextLine().toLowerCase();
    }

public String getAction(String msg) { //overloaded method
        System.out.println(msg);
        return getAction();
    }
```
