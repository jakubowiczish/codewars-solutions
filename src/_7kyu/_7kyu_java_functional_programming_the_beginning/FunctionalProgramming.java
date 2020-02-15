package _7kyu._7kyu_java_functional_programming_the_beginning;

import java.util.function.Function;

/*
With the release of Java 8,
Java has finally added support for "lambda functions",
that is, variables that contain a function
which can operate on data just as class methods can
(well, not just as class methods can...)

Let's learn about lambdas.

This is part 1 in a series.

Part 2: http://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions

Part 3: http://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business

Part 4: http://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot

Coming from most scripting languages (e.g., Javascript, Python, Ruby),
the concept of functions that can be passed
as variables should not be anything new.

The syntax in Java should even look familiar:

Function<MyObject, String> f = p -> p.toString();
String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString

The above is a simple mapper function:
given an input of type MyObject,
return a specific result of type String,
in this case the toString of the object.

They can, of course, become much more complicated.

A full listing of the default function types can be found at

http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

Given this POJO:

public class Student {
  private final String firstName;
  private final String lastName;
  public final String studentNumber;
  public String getFullName() {
    return firstName + " " + lastName;
  }
  public String getCommaName() {
    return lastName + ", " + firstName;
  }
}


Write a Function (with the appropriate types) that returns true if a given student is
"John Smith" with a student number of "js123" (otherwise return false).
 */

public class FunctionalProgramming {
    public static Function<Student, Boolean> f =
            p -> "John Smith".equals(p.getFullName())
                    && "js123".equals(p.studentNumber);
}