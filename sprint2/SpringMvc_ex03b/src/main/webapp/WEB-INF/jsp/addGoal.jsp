<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal</title>
</head>
<body>

<form:form modelAttribute="goal" action="/addGoal">

	<table>
		<tr>
			<td>Enter Minutes:</td>
			<td><form:label path="id">goal id</form:label></td>
			<td><form:input path="id"/></td>
			<td><form:label path="minutes">minutes</form:label></td>
			<td><form:input path="minutes"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Goal Minutes"/>
			</td>
		</tr>
		
	</table>

</form:form>

</body>
</html>