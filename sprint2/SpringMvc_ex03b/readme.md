<link rel='stylesheet' href='web/swiss.css'/>

# Spring MVC: Fitness Tracker - HTTP requests and Spring forms

Import the project `sprint2/SpringMvc_ex03b` from your local GitHub repository into your STS workspace using `Import>Existing Gradle Project`.

In this exercise we are going to build on the FitnessTracker web app from the previous session in order to allow the user to enter goals and exercises. Please the session lecture for an introduction to these exercises.

## Solved Exercises 

### Implementing the HTTP request "/addGoal" (POST)

In the `GoalController`, implement a handler method for the HTTP POST request `/addGoal` as explained in the lecture. 

### Implementing the HTTP request "/addExercise" (POST)

In the `MinutesController`, implement a handler method for the HTTP POST request `/addExercise` as explained in the lecture. 

## Unsolved Exercises

To be done after [exercise 03](../SpringMvc_ex03/):

1. Modify the layout of the HTML code in the view `addMinutes` in order to display the form in an [HTML table](https://www.w3schools.com/html/html_tables.asp), which displays each field in a different row (vertically). The idea is to play with the layout of the HTML code in the view.
2. Modify the functional feature `addGoal` so that each goal has a description. 
    * A user should be able to enter such description in the view `addGoal`
    * The description should be displayed meaningfully in the table of the view `getGoals`. At the moment only the identifier is displayed to identify a goal. 
3. Add logic (java code) in the handler method for the request `addGoal` to ensure the uniqueness of the identifier of the goal. That is, if the goal identifier entered by the user is taken, go back to the view `addGoal` without storing the goal and show an informative message to the user, explaining what to do next.

***
&copy; Artur Boronat, 2018 