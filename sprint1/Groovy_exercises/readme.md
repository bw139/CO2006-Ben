<link rel='stylesheet' href='web/swiss.css'/>

# Groovy exercises

## Setup

Create a new Groovy project:
* In the STS, select `File>New>Groovy Project` and follow the instructions, give a name to your project and click `Finish`.

A Groovy project should appear in your workspace.

Create a Groovy file (file with extension `.groovy` or a Groovy class) with the following contents under the source folder `src`:

```groovy
def name = "my name"
println name
def date = new Date().format ("dd-mm-yyyy")
println date
def fruitBag = ["orange","banana","coconut"]
println fruitBag


// ex 01 (*). print "my name: 06-18-2016" on the output console using a GString

// ex 02 (*). use a loop for printing the members of 
// the collection fruitBag

// ex 03 (*). define a function that given a range of integers, 
// determines the average

// ex 04 (**). using a closure check whether fruitBag 
// contains 'banana' 

// ex 05 (**). using a closure check whether all the words
// in fruitBag contain the letter 'n'
```

The Groovy script can be run by following these steps:
* Right-click on your file. 
* `Run as...>Groovy script`.
* The results of the script should be displayed in a new console <img src="web/console.png">.

## Exercises

In the file that you have just created, implement the exercises. These exercises are similar to those used in the lab session on IDEs and Java in order for you to compare similarities and differences between Groovy and Java.

The :notebook_with_decorative_cover: [lecture notes](../../lectureNotes/sprint1.lab2.Groovy.md) accompanying this lab session provide pointers to Groovy's documentation.

### Exercise 01 (:star:): Output Stream

1. Watch :movie_camera: [this video on Groovy's basic syntax](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=0&mode=live).
2. Then complete the Groovy script above in order to print the string `MY_NAME: DATE` on the output console using a GString, where: `MY_NAME` must be your name and `DATE`  must be today's date. That is initialise variables for the name and for the date, as you did in the previous lab session, and use string interpolation. 

### Exercise 02 (:star:): Control Structures

1. Familiarise yourself with :books: [Groovy's control structures](http://docs.groovy-lang.org/docs/groovy-2.4.15/html/documentation/#_control_structures), similar to Java's.
2. Watch :movie_camera: [this video on Groovy collections](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=1&mode=live) and :movie_camera: [this video on Groovy ranges](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=2&mode=live).
3. Use a loop for printing the members of the following collection `["orange","banana","coconut"]`.

### Exercise 03 (:star:): Functions

1. Watch :movie_camera: [this video on Groovy collections](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=3&mode=live).
2. Define a function that given a range of integers, determines the average of the elements in the list.

### Exercise 04 (:star::star:): Closures

1. Watch :movie_camera: [this video on Groovy closures](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=4&mode=live).
2. Using a closure check whether the variable `fruitBag` contains 'banana'.

### Exercise 05 (:star::star:)

1. Watch :movie_camera: [this video on Groovy dynamic capabilities](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=5&mode=live) and :movie_camera: [this summary](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=6&mode=live).
2. Using a closure check whether all the words in `fruitBag` contain the letter `'n'`. 


## More exercises
* [Repository with exercises to become fluent in Groovy](https://github.com/nadavc/groovykoans): use the gradle commands described in the repository to clean the solutions

