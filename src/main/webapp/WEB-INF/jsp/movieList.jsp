<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Movies</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<caption>Movie List</caption>
			<thead>
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Director</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${movies}" var="movie">
					<tr>
						<td>${movie.id}</td>
						<td>${movie.title}</td>
						<td>${movie.director}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div align="center">
			<a class="btn btn-success" href="/addMovie">Add Movie</a> 
			<a class="btn btn-primary" href="/updateMovie">Update Movie</a> 
			<a class="btn btn-danger" href="/deleteMovie">Delete Movie</a>
		</div>
	</div>
</body>
</html>