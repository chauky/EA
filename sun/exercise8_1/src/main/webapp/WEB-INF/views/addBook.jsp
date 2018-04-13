<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a book</title>
</head>
<body>
	<form action="books" method="post">
		<form:errors path="*" />

		<table>
			<tr>
				<td>Title:</td>
				<td><input type="text" name="title" /></td>
				<form:errors path="title" />
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

	</form>
</body>
</html>