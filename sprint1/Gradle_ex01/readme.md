<link rel='stylesheet' href='web/swiss.css'/>

# Gradle: exercise 1

## Tutorial 

### Getting started

Check [how to create Gradle projects](http://www.vogella.com/tutorials/EclipseGradle/article.html#creating-standard-java-projects) using Gradle Buildship within the IDE:

* Create the project `Gradle_ex01` using the Gradle import facility in your IDE (the order of steps may vary depending on the OS that you are using):
  - `File > New...Gradle project`
* Solve the exercises in the file `build.gradle`.

<div class="all-questions">

### Exercise A (:star:)

Write a task that prints `Hello World!` on the output console.

Then use the `gradle tasks` command to see your new task in the console or use Buildship in the Eclipse IDE.

### Exercise B (:star:)

Create two new tasks called `learnGroovy`, which prints `'Learn Groovy'`, and `learnGradle`, which prints `'Learn Gradle'`.

Configure dependencies so that `'Learn Groovy'` is printed before `'Learn Gradle'` when the tasks are executed.

### Exercise C (:star:)

Extend the `learnGroovy`  task so that it prints `'Install Eclipse IDE with Buildship'` before it prints `Learn Groovy`.

### Exercise D (:star:)

* Write 6 tasks, each of them should print `I'm task number n`, where `n` is to be replaced by the number of the task. For example `./gradlew -q task1` (`-q` for `quiet`) should print out `I'm task number 1`.
* Define the dependencies that correspond to the following activity diagram, where:
    * directed edges correspond to the `finalizedBy` clause;
    * bars correspond to fork/join nodes:
      * a **fork node** has one incoming edge and more than one outgoing edge: meaning that several tasks start at the same time;
      * a **join node** has several incoming edges and one outgoing edge, meaning that the outgoing task can proceed only if the previous tasks have finished.  

<img src="web/ad.png">

The output of using the command `./gradlew -q task1` should be something similar to:

	I'm task number 1
	I'm task number 2
	I'm task number 3
	I'm task number 4
	I'm task number 5
	I'm task number 6

Note that this is not the only ordering of tasks that is feasible. For example, it would be entirely correct to execute `task5` before `task4`. That is a fork node does not impose any order in which tasks should be evaluated.

### Exercise E (:star::star:)

* In STS, copy the files under [src/main/resources/source/](./src/main/resources/source/) to `src/main/resources/source/` in your project.
* Create a gradle task that copies files from folder `src/main/resources/source/` to `src/main/resources/target/`.
* Copy only those files whose name corresponds to an even number.
* *Hint*: explore [the documentation of the Copy task](https://docs.gradle.org/current/dsl/org.gradle.api.tasks.Copy.html) and use your Java/Groovy skills to achieve what you are asked to do


### Optional Exercises (:star: - :star::star::star:)

* [Specifying a custom Task in another gradle file](http://www.vogella.com/tutorials/Gradle/article.html#exercise-specifying-a-custom-task-in-another-gradle-file). Follow the instructions in that section for learning how to implement new typed tasks.
* Explore [these examples](https://github.com/udacity/ud867): when accessing the corresponding file `build.gradle`, you'll find comments explaining the code. 



***
&copy; Artur Boronat, 2015-18 

