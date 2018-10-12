<link rel='stylesheet' href='web/swiss.css'/>

# Gradle exercise 3

The goal in this session is to create a Groovy application from scratch using Gradle on your own. This will help you to gain confidence in creating a small app based on the exercises that we have done already. In addition, this session is going to introduce a few concepts that we are going to explain in more detail in sprint 2.

So do not expect step by step instructions on what to do, as the steps that are required have already been introduced in previous lab sessions. That is feel free to reuse parts of code used in previous sessions.

Let's get started...

### Setup

Create a Gradle project from STS (Eclipse IDE) and configure a Groovy application `Gradle_ex3` which runs with the following command:

`gradle -q run`

Copy the file [uk-500.csv](./uk-500.csv) under the project root folder. This file contains free sample data for testing, taken from [here](https://www.briandunning.com/sample-data/):
    * Names are random, constructed from real first and last names. Company names are real, but are randomized along with street addresses and do not represent actual locations.
    * City, County, State/Province, and ZIP/Postal are correct for each record.
    * Phone and fax numbers are random, but the area code and exchange for each are correct for their location.
    * Email and Web addresses are fake but properly formatted for their country.
    * Records are in random order and cover the countries with a more or less even distribution.

Desk check that your application runs. The smoke test could print `Hello World!` on the output console, for example.

### Application logic

Develop a small Groovy application that runs with the following command:

`gradle -q run -Pargs="last_name first_name"`

For example: `gradle -q run -Pargs="Tomkiewicz Aleshia"`

The app will read the CSV file using the class `File`. See this :books: [documentation on reading files](http://docs.groovy-lang.org/docs/groovy-2.4.15/html/documentation/#_reading_files). 

For the line containing the `last_name` and the `first_name` given as arguments, you should insert all of its field names and values as entries in a map called `model`. Feel free to use the methods **String.split()** and **String.replaceAll()**. That is, for the arguments `last_name=Tomkiewicz` and `first_name=Aleshia`, your model map must be filled with the following entries:

```
first_name=Aleshia
last_name=Tomkiewicz
company_name=Alan D Rosenburg Cpa Pc
address=14 Taylor St
city=St. Stephens Ward
county=Kent
postal=CT2 7PP
phone1=01835-703597
phone2=01944-369967
email=atomkiewicz@hotmail.com	
web=http://www.alandrosenburgcpapc.co.uk
```

Render the information in the model map using an HTML table like this one:

| field | value |
|--|--|
| first_name | Aleshia |
| last_name  | Tomkiewicz |
| company_name  | Alan D Rosenburg Cpa Pc |
| address | 14 Taylor St |
| city | St. Stephens Ward |
| county | Kent |
| postal | CT2 7PP |
| phone1 | 01835-703597 |
| phone2 | 01944-369967 |
| email | atomkiewicz@hotmail.com |	
| web | http://www.alandrosenburgcpapc.co.uk |

Open the file [table.html](./table.html), which contains the HTML code for the example above, as text in order to see which columns should be edited by your script. See :books: [documentation on how to write files](http://docs.groovy-lang.org/docs/groovy-2.4.15/html/documentation/#_writing_files). In short, you need:

```groovy
def text = """
...some multi-line text here
"""
def f = new File("./table.html")
f << text
```
 
Run your application from command line and check that the generated file can be rendered in a browser correctly. You should be able to open it in a browser as an HTML page.

If the `last_name` and `first_name` do not match any user, a message `User $first_name $last_name could not be found.` on the output console. 

### Use the Wrapper

Run your application using `./gradlew -q run -Pargs="Spinello Charisse"`. 

From now on we will use the Gradle Wrapper to execute apps and we will use Gradle to import projects. 

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

As soon as you manage to get your web page rendered with the correct answer, register your solution [in this form](https://goo.gl/forms/cBi4XXkoryxlpHXr1).

**Qualification criteria:**
* It is possible to play in pairs (but not in triples). If you work in pairs, try to apply **pair programming** as explained in the module resources.
* For a solution to be correct:
    * the HTML document needs to be rendered as as shown above, and 
    * if the user does not exist, an error message has to be displayed.


***
&copy; Artur Boronat, 2018

