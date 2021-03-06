<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Movie</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<form method="post">
		<div class="container" style="width: 30%">
			<table class="table table-striped">
				<caption>Enter details to add a movie</caption>
				<tbody>
					<tr>
						<td><label>Id : </label></td>
						<td><input name="id" type="text" /></td>
					</tr>
					<tr>
						<td><label>Title : </label></td>
						<td><input name="title" type="text" /></td>
					</tr>
					<tr>
						<td><label>Director : </label></td>
						<td><input name="director" type="text" /></td>
					</tr>
				</tbody>
			</table>
			<font color="red">${uniqueIdMsg}</font>
			<div align="center">
				<input class="btn btn-success" type="submit" />
			</div>
		</div>
	</form>
</body>
</html>