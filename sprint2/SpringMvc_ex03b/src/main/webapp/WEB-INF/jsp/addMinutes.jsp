<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>
</head>
<body>
<h1>Add Minutes Exercised</h1>

<form:form modelAttribute="exercise" action="/addExercise">
	<table>
		<tr>
			<td><form:label path="goal.id">goal id</form:label></td>
			<td><form:input path="goal.id"/></td>
			<td><form:label path="id">exercise id</form:label></td>
			<td><form:input path="id"/></td>
			<td><form:label path="activity">activity</form:label></td>
			<td><form:input path="activity"/></td>
			<td><form:label path="minutes">minutes</form:label></td>
			<td><form:input path="minutes"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Exercise"/>
			</td>	
		</tr>
	</table>
</form:form>

<h1>Our goal for the day is: ${exercise.goal.minutes}</h1>


</body>
</html>