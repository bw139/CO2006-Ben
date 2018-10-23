<link rel='stylesheet' href='web/swiss.css'/>

# Spring Mvc Exercise 02b 

### Learning outcomes

The **goals** in this session are: 
* to work with an example of **subsystem decomposition** in Model-View-Controller software architecture;
* to complete a **horizontal prototype** of a Model-View-Controller software architecture in the form of a web application, with small examples of Model, View and Controller;
* to apply the design principle **encapsulation (and information hiding)** in the form of a controller API, which hides the logic of the web application.


### Setup

Pull changes applied to the repository `CO2006-18-19` and import the project `sprint2/SpringMvc_ex02b` using Gradle Buildship within the STS.

### Exercises

#### A. Adding a view :star:

Add a simple view that displays the name that is passed in an HTTP request of the form `http://localhost:8090/about?name="Artur"`. The view should display:

A title (tag `<title></title>`) `Fitness app`, a header (tag `<h1></h1>`) `Fitness app`, and a paragraph (tag `<p></p>`) `This web app is developed by Artur`.

If the request is `http://localhost:8090/about?name="Sally"` the paragraph should be rendered as `This web app is developed by Sally`.

You need to:
1. Develop a view based on the code provided in the solutions of previous exercises. The HTML page must have a header and body. Use a simple EL expression to fetch the name from the model.
2. Add a new controller, that is create a new class, with a method to handle the request.


#### B. Add Goal :star::star:

Do the exercises proposed in method `GoalController:updateGoal()`.

#### C. Add Exercises :star::star::star:

Do the exercises proposed in method `MinutesController:addMinutes()`.

#### D. Show report :star:

Do the exercises proposed in method `GoalController:getGoals()`.

### Submission (mandatory)

Submit via Blackboard [here](https://bit.ly/2CaYplN) (section `Assessment and Feedback > Lab sessions submissions`).


The **submission procedure** is as follows: 
1. If you worked in pairs, include a file `readme.md` with the usernames of the members under the root folder of the project. For example:

```
members:
ab123
zyx987
```

2. Zip your project.
3. Submit the zipped file **individually** (each member has to submit it) by the end of the session using corresponding the link.

Regarding **assessment**: It does not matter if your solution is only partially correct, what matters is to participate and attempt the exercises.﻿﻿ Feel free to finish them at home! :wink: As long as you do a genuine effort, you will get full marks for the lab sessions.

Your solutions will be checked at random to ensure that your attempt is a genuine one and different from the solution provided. If a submission is found to be highly similar to the model answer released at the end of the session, the corresponding student will get a **plagiarism penalty**, involving a **zero mark** in the effort component of the whole module, and a **further reduction in the overall mark of the module** (and depending on the offence, of the degree classification).



### Contest (optional but encouraged): report your solution! :hatched_chick:

As soon as you manage to get your web page rendered with the correct answer, register your solution [in this form](https://goo.gl/forms/AzU9xuHTfqV6JxgZ2).

**Qualification criteria:**
* It is possible to play in pairs (but not in triples). If you work in pairs, try to apply **pair programming** as explained in the module resources.
* For a solution to be correct:
    * Exercise A: the corresponding view must be diplayed.
    * Exercise B and D: a goal is added by clicking on `Add Goal`, and then `Show summary` 
    * Exercise C and D: an exercise is added to a goal by clicking on `Add Minutes`, and then `Show summary` 


***
&copy; Artur Boronat, 2018
