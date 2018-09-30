<link rel='stylesheet' href='web/swiss.css'/>

# Exercises with an Integrated Development Environment 

## A note on Java SE 8

Throughout this module, we are going to use [Java 8](https://docs.oracle.com/javase/8/). You may be interested in revising:
* [Java language](https://docs.oracle.com/javase/tutorial/java/index.html)
* [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/TOC.html)
* [Java 8 API](https://docs.oracle.com/javase/8/docs/api/index.html)

We may use [lambda expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html) and [aggregate operations](https://docs.oracle.com/javase/tutorial/collections/streams/index.html).


## Exercises: Java and the Eclipse IDE

In this list of exercises, the goal is to program small Java programs using the Eclipse IDE. 

Open the `Spring Tool Suite` and create a workspace for `CO2006`, for example `CO2006ws`. Then open the Java perspective.

Using the IDE, create a Java project and add a class with the method `public static void main(String[] args)` and implement the following exercises in different static methods, which you should call from the `main()`  method:
- 01 (:star:). Print `YOUR_NAME: dd-MM-yyyy` on the output console using `System.out.println`, where `YOUR_NAME` should be your name (or your team's name) and `dd-MM-yyyy` should be replaced by today's date using that format pattern (for example: `02-10-2018`). *Hint*: you may want to use [this example](https://beginnersbook.com/2013/05/java-date-string-conversion/).
- 02 (:star:). Use a loop for printing the members of the following collection `["orange","banana","coconut"]`:
	* Create an `ArrayList` with these elements.
	* Program a loop that traverses the list and prints each word in the output console.
- 03 (:star:). Define a function that given a list of integers, determines the average.
	* Create an `ArrayList` and initialize with `[1,2,3,4,5,6,7,8,9,10]`
	* Program a loop that computes the average: sum all the elements up and then divide by the number of elements in the list.
	* Print the average on the output console.
	* Desk check your logic by changing the given list of numbers.
- 04 (:star::star:). Check whether the list `["orange","banana","coconut"]` contains the word `banana`:
	* Create an `ArrayList` and initialize with the elements `["orange","banana","coconut"]`
	* Use the appropriate collection operation.
	* Print the result in the output console, e.g. `found`.
- 05 (:star::star:). Check whether all the words in the list `["orange","banana","coconut"]` contain the letter `n`:
	* Create an `ArrayList` and initialize with the elements `["orange","banana","coconut"]`
	* Create a loop and for each word use the appropriate `String` method to implement the property to be asserted.
	* Print the result in the output console, e.g. `found` or `fruit X does not contain the letter 'n'`.
	* Desk check your logic by changing the given list of words.

## Contest :star::star::star:

The resources for the contest can be found [here](../IDE_contest/) and they will be released at the start of the second hour of the session.