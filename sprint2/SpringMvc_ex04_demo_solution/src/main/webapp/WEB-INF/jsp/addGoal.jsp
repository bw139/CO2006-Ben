<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal</title>
</head>
<body>

<h1>Goal information</h1>

<form:form method="POST" modelAttribute="goal" action="/selectGoal">
   <table>
    <tr>
        <td><form:label path="id">Goal</form:label></td>
    	<td><form:select path="id">
    		<c:choose>
				<c:when test="${goal.getId() < 0}">
					<form:option value="0" label="--- none ---"/>
				</c:when>
				<c:otherwise>
					<form:option value="-1" label="--- none ---" selected="selected"/>
				</c:otherwise>
			</c:choose>
			<c:forEach var="currentGoal" items="${goalList}">
				<c:choose>
					<c:when test="${currentGoal.getId()==goal.getId()}">
						<form:option value="${currentGoal.getId()}" label="${currentGoal.getDescription()}" selected="selected"/>
					</c:when>
					<c:otherwise>
						<form:option value="${currentGoal.getId()}" label="${currentGoal.getDescription()}"/>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</form:select></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" name="action" value="Select" class="btn btn-default"/>
        </td>
    </tr>
</table>  
</form:form>

<form:form modelAttribute="goal" action="/addGoal">
	<table>
		<tr>
			<td>Enter Minutes:</td>
			<td><form:label path="id">goal id</form:label></td>
			<td><form:input path="id"/></td>
			<td><form:label path="minutes">minutes</form:label></td>
			<td><form:input path="minutes"/></td>
			<td><form:label path="description">description</form:label></td>
			<td><form:input path="description"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Goal Minutes"/>
			</td>
		</tr>
		
	</table>
</form:form>

<h1>List of exercises</h1>
	<a href="/exercise/add?goalId=${goal.id}">Create Exercise for goal '${goal.description}'</a>
	<table>
	<td>
		<table>
			<tr>
				<th>Exercise ID</th>
				<th>Exercise Minutes</th>
				<th>Exercise Activity</th>
			</tr>
			<c:forEach items="${goal.getExercises()}" var="exercise">
				<tr>
					<td>${exercise.id}</td>
					<td>${exercise.minutes}</td>
					<td>${exercise.activity}</td>
					<td><a href="/exercise/edit?goalId=${exercise.goal.id}&exerciseId=${exercise.id}">Edit</a></td>
					<td><a href="/exercise/delete?goalId=${exercise.goal.id}&exerciseId=${exercise.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</td>
	</table>
</body>
</html>