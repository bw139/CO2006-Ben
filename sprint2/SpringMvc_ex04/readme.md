<link rel='stylesheet' href='web/swiss.css'/>

# Spring MVC: exercise 04 - master/detail

Import the project `sprint2/SpringMvc_ex04` from your local GitHub repository into your STS workspace using `Import>Existing Gradle Project`.

In this exercise, the goal is to develop a master/detail GUI (Graphical User Interface) to support CRUD (Create/Read/Update/Delete) operations of product information in a store. 


## Skeleton of the web application

By the end of these exercises, the presentation layer should implement the following navigational model (where each screenshot represents a web page and transitions correspond to HTTP requests represented by buttons or hyperlinks in a web page):

<img src="web/navModel.png" alt="navigational model" width="500" height="400">

The architecture of the boilerplate code available in the repository is as follows:

		/src
		|-- main
	        |-- java
	            |-- labJstl
	                |-- LabJstlApplication.java: 
	                |-- WebConfig.java
	                |-- controller
	                    |-- IndexController.java
	                |-- domain
	                    |-- SimpleProduct.java
	        |-- resources
	            |-- application.properties
		    |-- webapp
		        |-- WEB-INF
		            |-- views: where the JSP files can be found
		                |-- forms
		                	|-- master.jsp
		                    |-- detail.jsp


### Exercise: master/detail with JSPs and plain HTML.

The goal is to implement the navigation model above and the business logic corresponding to CRUD operations.

Add the following methods to the class `IndexController.java`:
* `public String productDetail(@ModelAttribute("product") SimpleProduct product, @RequestParam(value="productId", required=false, defaultValue="-1") int productId)`: shows the detail view of the product when adding/editing a product
  * add the corresponding `@RequestMapping` for declaring a `GET "/productDetail"` request
  * if `productId > 0` (that is, it is a modification), the method sets the properties of the variable `product` with the product with identifier `productId` in `productList`  
  * else, the identifier of `product` is set to `SimpleProduct.lastIdSimpleProduct.lastId`
* `public String addProduct(@ModelAttribute("product") SimpleProduct product, Model model)`: creates a product when clicking on `Submit` 
  * add the `@RequestMapping` for a `POST "/addProduct"` request when the `Submit` button is clicked 
  * the product with id `productId` is removed from `productList`
  * a new product with information in the form is added to `productList`
  * the master view must display the resulting list of products
* `public String deleteProduct(@RequestParam(value="productId", required=false, defaultValue="-1") int productId, Model model)`: deletes a product
  * add the `@RequestMapping` for a `GET "/deleteProduct"` request
  * the product with id `productId` is removed from `productList`
  * the master view must display the remaining list of products
  

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
 
***
&copy; Artur Boronat, 2016-18