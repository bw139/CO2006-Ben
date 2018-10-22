<link rel='stylesheet' href='web/swiss.css'/>

# (:star::star:) Spring MVC: Exercise 02

Import the project `sprint2/SpringMvc_ex02` from your local GitHub repository into your STS workspace using `Import>Existing Gradle Project`.

In this exercise, we are going to practise how to map HTTP requests to controller methods.

In constrast to Pluralsight videos, we are using Gradle and Java configuration for bootstrapping the web application, which reduces the configuration effort.

## Learning outcomes

* Develop simple controllers
* Link requests to controller methods with `@RequestMapping`
* Identify common problems when running a Spring MVC web app for the first time 

## Setting

The configuration is similar to exercise 01. The project contains the JSP file `src/main/webapp/WEB-INF/views/greeting.jsp`, which is a slight modification of `src/main/webapp/WEB-INF/views/hello.jsp` and that can display the attributes `name` and `value` from the model.

## Exercises

The exercises are in file `src/main/java/labMVC/IndexController.java`. For each method, add the corresponding request mapping annotation as described in the corresponding comment.  

The intent behind this exercise is to get used to explore documentation, in this case about [request mappings](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-ann-requestmapping).

## Optional Exercises

### Pluralsight exercise

* Watch the :movie_camera: [video on controllers](https://app.pluralsight.com/player?course=springmvc-intro&author=bryan-hansen&name=springmvc-m4-controllers&clip=0&mode=live) recommended for the session.
* Do the pluralsight exercise on controllers, from the tutorial [Introduction to Spring MVC](https://app.pluralsight.com/library/courses/springmvc-intro/table-of-contents), under tab `Exercise files > Download exercise files`, unzip file and do the exercise `4-springmvc-m4-controllers-exercise-files`. 
  * Remember that we are using Gradle and not Maven for configuring the project and the migration guide.

### Open (unsolved) exercises

* Define your own controller and display the information encoded in the following GET HTTP request methods in the view:
  * `http://localhost:8090/order/16-10-2018` should display a date `16-10-2018` in the view.
  * `http://localhost:8090/order/1` should display the value `1` in the view.
  * `http://localhost:8090/order?id=1` should display the value `1` in the view.
  * `http://localhost:8090/order/item?id=1` should display the value `1` in the view.
  * `http://localhost:8090/order/item?id=2` should display the value `2` in the view.
  * `http://localhost:8090/order/item?id=1&id=2` should display the value `[1,2]` in the view.
  

***
&copy; Artur Boronat, 2016-17
