<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a book</title>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<form:form modelAttribue="addBook" commandName="addBook" method="post" >
		<form:errors path="*" cssClass="errorblock" element="div" />

		<table>
			<tr>
				<td>Title:</td>
				<td><form:input path="title" /></td>
				<td><form:errors path="title" cssClass="error" /></td>

			</tr>
			<tr>
				<td>ISBN:</td>
				<td><input type="text" name="ISBN" /></td>
			</tr>
			<tr>
				<td>Author:</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price" /></td>
			</tr>
		</table>
		<input type="submit" />

	</form:form>
</body>
</html>