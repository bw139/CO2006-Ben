<link rel='stylesheet' href='web/swiss.css'/>

# Gradle exercise 2

Follow the steps used in Gradle exercise 1 to import the project into the STS IDE workspace.

## Exercise A: Java project (:star:)


Within STS:

1. Create a Gradle project.
2. Edit the file `build.gradle` and configure a Java project with the plugins `java` and `application` with the standard layout of source sets
3. Add a class with a `main` method that prints `Hello, world!` in the output console.
4. Configure the property `mainClassName` of the plugin `application` to point to that class. It has to be a fully qualified name, that is, if the class `Hello` contains the method `static void main(String[] args)` and this class is in package `app`, then you should use `app.Hello`. 

Within a Bash terminal:

1. `cd` to the directory where the project is stored. That is if you execute `ls` you should see the file `build.gradle`.
2. Check that you can run your project from command line using `gradle run`.
 
## Exercise B: Importing a Java project (:star:)

1. **Make a backup copy** of the directory containing the project of exercise A. You may use:
    * a `cp` command (or similar) in a terminal, 
    * STS copy-and-paste on the package explorer view ;
    * Ubuntu's file manager.
2. Within STS, on the package explorer view, delete the project of exercise A and **DO NOT TICK** `Delete project contents on disk (cannot be undone)`.
    * If you ticked it by mistake. Your project will be gone and you will have to retrieve from your backup copy.
    * If you did not create a backup copy, your project will be gone forever - as expected.
3. Import project using `File > Import > Gradle > Existing Gradle Project...` 
    * Choose the directory containing the project you created in exercise A.
    * Select `Override workspace setttings` whenever offered the option.
    * Select `Gradle wrapper` whenever offered the option.
4. Check that it runs as in exercise A in a Bash terminal, or, equivalently, by using the view `Gradle Tasks` (display it from `Window > Show View > Other > Gradle > Gradle Tasks`, then select task, right-click and `Execute Gradle Tasks)

## Exercise C: Configuring a Groovy project (:star:)

1. Create a Gradle project
2. Apply the plugins `groovy`, which includes `java`, and `application`
3. Create a source folder (`Right-click on project > new > source folder`) with name `src/main/groovy`
4. Refresh the eclipse project configuration either:
    * from a Bash terminal: using `gradle clean cleanEclipse eclipse` (which is equivalent to executing each of those tasks separately)
    * from STS: `right-click on project > Gradle > Refresh Gradle project`
5. Create a Groovy class with a main method that prints `Hello, world!` on the output console. 
6. Configure the property `mainClassName` of the plugin `application` as in previous exercises.
7. Configure the eclipse project by adding the following code snippet to `build.gradle`:


```gradle
eclipse {
	project {
	  name='Gradle_ex02_c'
	  // to build the project  
	  buildCommand 'org.eclipse.jdt.core.javabuilder'
	  buildCommand 'org.eclipse.buildship.core.gradleprojectbuilder'
	  // to configure the project in the workspace 
	  natures 'org.eclipse.jdt.core.javanature',
	    'org.eclipse.jdt.groovy.core.groovyNature', 
	  	'org.eclipse.buildship.core.gradleprojectnature'
	}
}
```

8. Add the following code snippet, which configures the Groovy SDK.

```gradle
repositories {
	mavenCentral()
}

dependencies {
	compile 'org.codehaus.groovy:groovy-all:2.4.15'
}
```

9. Refresh the eclipse project configuration again and check that the name has changed. Check that by removing the project from the workspace and by importing it with Gradle, the project is left properly configured and that you can run it using `right-click on project > Run as..> Java application`, or with Gradle either from a terminal with `gradle run` or from the view `Gradle tasks`.

## Exercise D: Configuring Java Dependencies (:star: :star:)

Watch the video on :movie_camera: [External dependencies (24:15)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m5&clip=0&mode=live).

### Setup 

1. Find out where your local copy of the git repository `CO2006-XX-YY`. To see/change where this is go to `Preferences` (usually under `Help` or `Spring Tool Suite` menus) and then select `Team > Git > Default repository folder`.
2. In a file manager (or from a terminal), copy the project `sprint1/Gradle_ex2` from your local copy of the git repository `CO2006-XX-YY` and paste it into your workspace directory.
3. Within STS, import that project using Gradle as done in previous exercises, you should get the following project structure: 

<div class="all-questions">

	|-- build.gradle
	|-- src
		|-- main
			|-- java
				|-- labGradle
					|-- Log4jExample.java : main class that uses log4j
			|-- resources
				|-- log4j.properties : configuration of log4j
	|-- log4j
		|-- log.out : file that will be generated once you run the application
	
The build script uses the following plugins:
* [java](https://docs.gradle.org/current/userguide/java_plugin.html): to build Java projects, as explained :movie_camera: [in this Pluralsight video](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m5&clip=0&mode=live);
* [application](https://docs.gradle.org/current/userguide/application_plugin.html): to run Java console applications, as explained :movie_camera: [in this Pluralsight video](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m5&clip=5&mode=live); and
* [eclipse](https://docs.gradle.org/current/userguide/eclipse_plugin.html): to configure the eclipse workpace using `gradle -q eclipse`.

### Exercise

Configure the gradle build script required to run a small program in Java that uses [log4j 1.2.17](https://logging.apache.org/log4j/1.2/manual.html), [available from Maven Central](http://mvnrepository.com/artifact/log4j/log4j/1.2.17), by adding the corresponding dependency.

Once you have added the corresponding dependency in `build.gradle`, execute the program with `gradle run` and check that the log file `log4j/log.out` contains the following lines (you may need to refresh the project folder in STS in order to see the generated file):

		Hello this is a debug message
		Hello this is an info message 

* *Hint*: use the following sequence of commands in order to use imported libraries in Java projects in the STS.
  - `gradle cleanEclipse clean eclipse`
  - Refresh the project in the STS by using F5 (or right-click on resource > refresh)
* *Hint*: you can also refresh the project from the STS
    * `right-click on project > Gradle > Refresh Gradle project` 
    * run it using the view `Gradle tasks`
		
## Additional Resources

* [Getting started](https://docs.gradle.org/current/userguide/tutorials.html): official Gradle tutorial to get started with Gradle.
* [Gradle's user guide](https://docs.gradle.org/current/userguide/userguide)

## Credits

* Some parts of this tutorial have been adapted from [this tutorialspoint's tutorial on log4j](http://www.tutorialspoint.com/log4j/log4j_sample_program.htm).

***
&copy; Artur Boronat, 2015-2018

