<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/admin/category">Category</a></li>
					<li><a href="/admin/color">Color</a></li>
					<li><a href="/admin/producer">Producer</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/commodity">Commodity</a></li>
					<li><a href="/admin/country">Country</a></li>
					<li><a href="/admin/materials">Materials</a></li>
					<li><a href="/admin/mechanika">Mechanika</a></li>
					<li><a href="/admin/model">Model</a></li>
					<li><a href="/admin/size">Size</a></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="col-md-3 col-xs-12"></div>
	<div class="col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/producer" method="POST" modelAttribute="producer">
					<div class="form-group">
    					<label for="producerId" class="col-sm-2 control-label">Producer</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="country" id="countryId" items="${countrys}" itemValue="id" itemLabel="country"/>
    					</div>
  					</div>
					<div class="form-group">
    					<label for="producer" class="col-sm-2 control-label">Producer</label>
    					<div class="col-sm-10">
      						<form:input type="text" class="form-control" path="name" id="producer"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-default">Create</button>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-xs-4"><h3>Producer name</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${producers}" var="producer">
				<div class="row">
					<div class="col-md-4 col-xs-4">${producer.name}</div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-warning" href="/admin/producer/update/${producer.id}">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/producer/delete/${producer.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>