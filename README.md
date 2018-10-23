<link rel='stylesheet' href='./web/swiss.css'/>

<a href="https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=69fe1611-62b5-4d3a-b556-a96800b4f2bc"><img src="web/L0_thumbnail_play.png" alt="CO2006 introductory session" height="350" width="800"></a>


<details><summary>Study Guide</summary>

## Study Guide

The **study guide** is available :notebook_with_decorative_cover: [here](./CO2006-studyguide-18-19.pdf).

</details>

## Module Structure and Timetable 

The module is split in four main parts, called [sprints](https://en.wikipedia.org/wiki/Scrum_(software_development)#Sprint), and each sprint has a goal, that is an assessed component:

| Sprint | Assignment | Weight | Deadline |
|--|--|--|--|
| [Sprint 1. Agile practices and build automation](#sprint-1-agile-practices-and-build-automation) | Test | 15% | Tue 16 Oct, 15:00 (CWB 301) |
| [Sprint 2. Spring MVC (business logic and validation)](#sprint-2-spring-mvc-business-logic-and-validation) | Homework | 20% | Tue 6 Nov, 23:59 |
| [Sprint 3. Quality Assurance (Behaviour-Driven Development)](#sprint-3-quality-assurance-behaviour-driven-development) | Homework | 20% | Tue 20 Nov, 23:59 |
| [Sprint 4. Spring Data (JPA) and Spring Security](#sprint-4-spring-data-jpa-and-spring-security) | Homework | 20% | Fri 7 Dec, 23:59 |
|  | Final test | 25% | Wed 12 Dec, 14:00 (CWB 301) |

See below the timetable for the term:

<img src="web/sampletimetable.png" alt="CO2006 timetable" height="500" width="800">


<br />
<br />
<br />



### Lectures/Lab sessions

<details><summary><b>Sprint 1</b> (click me to expand)</summary>

#### Sprint 1. Agile practices and build automation

The goal for this sprint is a test on agile practices in software development, Groovy and Gradle:
* :dart: **TEST: Tuesday 16th October, CW3 Lab (out of 100, weight: 15%): 15:00-15:50**
* :nerd_face: Contents to be assessed in the test summarised [here](./sprint1.test.md#contents-for-test-sprint-1)
  * The **revision session** will be on **Monday 15 October, 14:00, in Brookfield Lecture Theatre**
* :computer: A sample test is available [here](https://bit.ly/2DE8j1I) (this is a link to Blackboard and you need to be signed in for it to work)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="web/bannerSessions.png" alt="what to do in lab sessions" height="200" width="600">

| Topic | Lecture  (:warning: watch before the session) | Worksheet | Solution | Additional resources | 
|--|--|--|--|--|
| Introduction to Build Automation | - | - | - | :movie_camera: [lecture](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=a4e9fc02-2df3-4a00-b55b-a96d00c81305), <br/> :notebook_with_decorative_cover: [slides](./lectureNotes/sprint1.lecture.pdf), <br/>:movie_camera: [Waterfall Fundamentals and Its Problems (21:14)](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m2&clip=0&mode=live), <br/> :movie_camera: [What is agile all about? (28:41)](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m3&clip=0&mode=live), <br/> :movie_camera: [Common agile misconceptions (20:12)](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m4&clip=0&mode=live),<br/> :movie_camera: [Advantages and disadvantages (18:48)](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m5&clip=0&mode=live) |
| Integrated Development Environments (IDEs)	 | :movie_camera: [Intro to IDEs (19:33)](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=9624f170-8536-4ad6-9655-a96500e049e9), <br/> :movie_camera: [Pair programming (16:05)](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=a21e8ac3-d6ee-4ccc-bf7b-a96c00a0af9c) | :computer: [worksheet](./sprint1/IDE_exercises/) |  | :notebook_with_decorative_cover: lecture notes ([PDF](./lectureNotes/sprint1.lab1.IDE.pdf), [HTML](./lectureNotes/sprint1.lab1.IDE.md)) |
| Groovy (basic syntax and collections) | :movie_camera: [Intro to Groovy (26:35)](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m1&clip=0&mode=live) | :computer: [worksheet](./sprint1/Groovy_exercises/) | :computer: [solution](./sprint1/Groovy_exercises_solution/src/solution/exercises_solutions.groovy) | :notebook_with_decorative_cover: lecture notes ([PDF](./lectureNotes/sprint1.lab2.Groovy.pdf), [HTML](./lectureNotes/sprint1.lab2.Groovy.md)) <br/> :movie_camera: [Groovy's basic syntax (31:13)](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=0&mode=live) |  
|  Gradle (tasks and dependencies)  		| :movie_camera: [Intro to Gradle (18:59)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m1&clip=0&mode=live), <br/>  :movie_camera: [Tasks (20:50)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m2&clip=0&mode=live) | :computer: [worksheet](./sprint1/Gradle_ex01/) | :computer: [solution](./sprint1/Gradle_ex01_solution/build.gradle) | :movie_camera: [Task dependencies (17:18)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m3&clip=0&mode=live), <br/> :movie_camera: [Typed tasks (11:36)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m4&clip=0&mode=live),<br/> :notebook_with_decorative_cover: lecture notes ([PDF](./lectureNotes/sprint1.lab3.Gradle.pdf), [HTML](./lectureNotes/sprint1.lab3.Gradle.md)), <br/> :movie_camera: [webcast (questions on Buildship)](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=ad336c72-edd0-48c2-a4d6-a97300a4fae9) |
| Gradle (Plugins - Java, Groovy, external dependencies) 		| :movie_camera: [Java projects (18:59)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m5&clip=0&mode=live)* | :computer: [worksheet](./sprint1/Gradle_ex02/) | :computer: [solution](./sprint1/Gradle_ex02_solution/) | :notebook_with_decorative_cover: lecture notes ([PDF](./lectureNotes/sprint1.lab4.Gradle.pdf), [HTML](./lectureNotes/sprint1.lab4.Gradle.md)), <br/> :movie_camera: [External dependencies (24:15)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m5&clip=0&mode=live)  | 
| Gradle (external dependencies, testing, wrapper) 		| :movie_camera: [Testing (16:13)](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m7&clip=0&mode=live) | :computer: [worksheet](./sprint1/Gradle_ex03/) | :computer: [solution](./sprint1/Gradle_ex03_solution/)  | :notebook_with_decorative_cover: lecture notes ([PDF](./lectureNotes/sprint1.lab5.Gradle.pdf), [HTML](./lectureNotes/sprint1.lab5.Gradle.md)) | 
| Revision 		| :movie_camera: [revision](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=55abaa08-2cc1-4090-afc4-a97a00d6b638) |  |  | :notebook_with_decorative_cover: [slides](./lectureNotes/sprint1.revision.pdf) | 


\* Skip `Writing a multi-project build`

<br />
<br />
<br />

</details> 

#### Sprint 2. Spring MVC (business logic and validation)

The goal of this Sprint is to develop a web application. 

* :dart: [mini project worksheet](./miniproject.md) (the link will not work until the worksheet is released):
  * **marks: 100, weight: 20%** of overall mark
  * [checkpoint and effort](): **Tue 30 Oct, 23:59, weight 10% of sprint 2**
  * [release](): **Tue 6 Nov, 23:59, weight 90% of sprint 2**
* :loudspeaker: [solution miniproject (source code)]() (TBA)
  * [feedback form]()

| Topic | Lecture  (:warning: watch before the session) | Worksheet | Solution | Additional resources | 
|--|--|--|--|--|
| Introduction to Spring MVC				|  |  | | :movie_camera: [lecture](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=b9485004-f43e-4da0-bd86-a97d00f85ec6), <br/>  :notebook_with_decorative_cover: [slides](./lectureNotes/sprint2.lecture.pdf) | 
| Spring MVC (basics)					| :movie_camera: [Introduction to Spring MVC (16:56)](https://app.pluralsight.com/player?course=springmvc-intro&author=bryan-hansen&name=springmvc-m1-intro&clip=0&mode=live)<br/>:movie_camera: [Architecture (12:25)](https://app.pluralsight.com/player?course=springmvc-intro&author=bryan-hansen&name=springmvc-m3-architecture&clip=0&mode=live) :movie_camera: [webcast](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=22d81fc5-c1fd-491f-a703-a97e008a7f9a)| :computer: [worksheet](./sprint2/SpringMvc_ex01/readme.md) | :computer: [solution](./sprint2/SpringMvc_ex01_solution/)  | | 
| Controllers (request mappings) 		| <br/> :movie_camera: [Controllers - request mappings (21:00)](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=36f7f901-8ec8-4281-8b18-a980014228bd) <br/> | :computer: [worksheet](./sprint2/SpringMvc_ex02/readme.md) | :computer: [solution](./sprint2/SpringMvc_ex02_solution/) | :notebook_with_decorative_cover: [slides](./lectureNotes/sprint2.lab2.handouts.pdf), <br/> :notebook_with_decorative_cover: lecture notes ([PDF](./lectureNotes/sprint2.lab2.pdf), [HTML](./lectureNotes/sprint2.lab2.md)), <br/> :movie_camera: [Controllers (27:54)](https://app.pluralsight.com/player?course=springmvc-intro&author=bryan-hansen&name=springmvc-m4-controllers&clip=0&mode=live)  |
| Views (JSP, JSTL)						| :movie_camera: [MVC and design principles](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=7871e274-b7bf-4f84-901c-a98200e2e2b4) | :computer: [worksheet](./sprint2/SpringMvc_ex02b) | <!-- :computer: [solution](./sprint2/SpringMvc_ex02b_solution) --> | :movie_camera: [Views (~4:00)](https://app.pluralsight.com/player?course=springmvc-intro&author=bryan-hansen&name=springmvc-m5-views&clip=0&mode=live) (skip: chaining, resolving static files) |
| Controllers (forms)			 		| :movie_camera: [Forms and POST requests](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=36f7f901-8ec8-4281-8b18-a980014228bd) | :computer: [worksheet](./sprint2/SpringMvc_ex03/readme.md) | <!-- :computer: [solution](./sprint2/SpringMvc_ex03_solution/) --> |  |
| Spring MVC (master/detail)						| :movie_camera: [Tag libraries (37:52)](https://app.pluralsight.com/player?course=springmvc-intro&author=bryan-hansen&name=springmvc-m6-tags&clip=0&mode=live) | :computer: [worksheet](./sprint2/SpringMvc_ex04/readme.md) | <!-- :computer: [solution](./sprint2/SpringMvc_ex04_solution/) --> | |
| Spring Validation 						| :movie_camera: [Validation (23:22)](https://app.pluralsight.com/player?course=springmvc-intro&author=bryan-hansen&name=springmvc-m7-validation&clip=0&mode=live) | :computer: [worksheet](./sprint2/SpringMvc_ex05/readme.md) | <!-- :computer: [solution](./sprint2/SpringMvc_ex05_solution/) --> | |


<details><summary><b>Sprint 3</b> (click me to expand)</summary>


<br />
<br />
<br />


#### Sprint 3. Quality Assurance (Behaviour-Driven Development)

:warning: The links under this section will be enabled once sprint 3 starts.

The goal of this Sprint is to develop a web application:
* :dart: [mini project worksheet](./miniproject.md) (the link will not work until the worksheet is released):
  * **marks: 100, weight: 20%** of overall mark
  * [checkpoint](): **Tue 13 Nov, 23:59, weight 10% of sprint 3**
  * [release](): **Tue 20 Nov, 23:59, weight 90% of sprint 3**
* :loudspeaker: [solution miniproject (source code)]() (TBA)
  * [feedback form]()
  
| Topic | Lecture  (:warning: watch before the session) | Worksheet | Solution | Additional resources | 
|--|--|--|--|--|
| Introduction to Quality Assurance			|  |  | | :movie_camera: [lecture](), <br/>  :notebook_with_decorative_cover: [slides]() | 
| TDD with JUnit/Hamcrest			|  :movie_camera: [lecture]() | :computer: [worksheet]() |  | |
| Triangulation 						|  :movie_camera: [lecture]() | :computer: [worksheet]() |  | |
| Spock 								| :movie_camera: [lecture]() | :computer: [worksheet]() |  | |
| Spring Test Framework				|  :movie_camera: [lecture]() | :computer: [worksheet]() |  | |
| Testing criteria			 		|  :movie_camera: [lecture]() | :computer: [worksheet]() |  | |



<br />
<br />
<br />

</details>

<details><summary><b>Sprint 4</b> (click me to expand)</summary>

#### Sprint 4. Spring Data (JPA) and Spring Security

:warning: The links under this section will be enabled once sprint 4 starts.

The goal of this Sprint is to develop a web application:
* :dart: [mini project worksheet](./miniproject.md) (the link will not work until the worksheet is released):
  * **marks: 100, weight: 20%** of overall mark
  * [checkpoint](): **Thu 29 Nov, 23:59, weight 10% of sprint 4**
  * [release](): **Fri 7 Dec, 23:59, weight 90% of sprint 4**
* :loudspeaker: [solution miniproject (source code)]() (TBA)
  * [feedback form]()

| Topic | Lecture  (:warning: watch before the session) | Worksheet | Solution | Additional resources | 
|--|--|--|--|--|
| Intro to Spring Data/Security			|  |  | | :movie_camera: [lecture](), <br/>  :notebook_with_decorative_cover: [slides]() | 
| Revision SQL |  |  :computer:[exercise 01](./ex01.md)  <br/> :movie_camera: [explanation]() |  | |
| ORM problem | :movie_camera: [ORM1 (16:53)]() | :computer: [exercise 02](./sprint4.ex02/)  <br/> :movie_camera:[explanation]() |  |  |
| ORM solution (JPA) | :movie_camera: [ORM2 (15:11)]() |  :computer:[exercise 03](./sprint4.ex03/) <br/> :movie_camera:[explanation]() |  |  |
| Spring Data | :movie_camera: [ORM3 (25:04)]() |  :computer: [exercise 04](./sprint4.ex04/) <br/> :movie_camera: [explanation]() |  |   |   |
| Spring Data |  | :computer: [exercise 05](./sprint4.ex05/) <br/> :movie_camera:  [explanation]() | |  |  |
| Spring Security  | :movie_camera: [Spring Security (54:14)]() |  :computer: [exercise 06](./sprint4.ex06/) <br/> :movie_camera: [explanation]() |  |  | Watch the lecture, fetch ex06 and watch its explanation. |  


<br />
<br />
<br />

</details>

<details><summary><b>Final Test</b> (click me to expand)</summary>

#### Final test (assessed coursework)

* :dart: **Final Test (covering sprints 2, 3 and 4): Wednesday 12th December, 14:00-15:00**
* :nerd_face: Contents to be assessed in the test summarised here
  * The **revision session** will be on **Monday 10th December, 14:00, in KE LT2**
* :computer: A sample test can be found [here]()


<br />
<br />
<br />

</details>

## Other resources

### IDE and Tooling

The tools that we are going to use in this module are reported [here](./tooling.md)   






