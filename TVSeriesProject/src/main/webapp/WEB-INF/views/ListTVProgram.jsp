<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>

<html>
<head>
<title>The TV Series project</title>
</head>
<body>
	<div class="container">
		<form:form action="searchShow" method="POST">
			<div class="row">
				<div class="col-lg-3 col-sm-4 ">
					<div class="search-form">
						<h4>
							<span class="glyphicon glyphicon-search"></span> Search Show
						</h4>
						<input type="text" name="textSearch" class="form-control"
							placeholder="Search your shows">
						<div>
							<div class="col-lg-12">
								<select name="type" class="form-control">
									<option value="all">-- search type --</option>
									<option value="name">Name</option>
									<option value="genre">Genre</option>
									<option value="rate">Rate</option>
									<option value="artist">Name of Artist</option>
									<option value="director">Name of Director</option>
								</select>
							</div>
						</div>
						<button type="submit" id="searchBtnHomeList"
							class="btn btn-primary col-lg-4 col-sm-5">Find Now</button>
					</div>
				</div>
			</div>

			<h4>The list of shows</h4>
			<div class="row" id="searchResult">
				<!-- start of listing shows-->
				<c:forEach var="show" items="${listTVPrograms}">
					<div class="col-lg-4 col-sm-6">
						<h4>${show.name}</h4>
						<p>Description: ${show.description}</p>
						<p>Genre: ${show.genre}</p>
						<p>Studio: ${show.studio}</p>
						<p>Rating: ${show.rating}</p>
						<p>
							<em>Director:</em> ${show.director.name}
						</p>
					</div>
				</c:forEach>
			</div>
		</form:form>
	</div>
</body>
</html>