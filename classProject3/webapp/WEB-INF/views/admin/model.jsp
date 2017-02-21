<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
	<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"><a href="/admin/registration">Registration</a></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="/admin/category">Category</a></li>
					<li><a href="/admin/color">Color</a></li>
					<li><a href="/admin/producer">Producer</a></li>
					<li><a href="/admin/commodity">Commodity</a></li>
					<li><a href="/admin/country">Country</a></li>
					<li><a href="/admin/materials">Materials</a></li>
					<li><a href="/admin/mechanika">Mechanika</a></li>
					<li class="active"><a href="/admin/model">Model</a><span
						class="sr-only">(current)</span></li>
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
				<form:form class="form-horizontal" action="/admin/model" method="POST" modelAttribute = "model">
					<div class="form-group">
						<label for="model" class="col-sm-offset-2 col-sm-10"><form:errors path="model"/></label>
					</div>
					<div class="form-group">
    					<label for="model" class="col-sm-2 control-label">Name</label>
    					<div class="col-sm-10">
      						<form:input type="text" class="form-control" path="model" id="model"/>
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
			<div class="col-md-4 col-xs-4"><h3>Model</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${models}" var="model">
				<div class="row">
					<div class="col-md-4 col-xs-4">${model.model}</div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-warning" href="/admin/model/update/${model.id}">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/model/delete/${model.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>