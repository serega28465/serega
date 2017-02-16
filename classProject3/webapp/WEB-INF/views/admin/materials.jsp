<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
					<li class="active"><a href="/admin/materials" >Materials</a><span
						class="sr-only">(current)</span></li>
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
				<form:form class="form-horizontal" action="/admin/materials" method="POST" modelAttribute="materialList">
					<div class="form-group">
    					<label for="verh" class="col-sm-2 control-label">Verh</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="verh" id="verh" items="${materials}" itemValue="verh" itemLabel="verh"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="niz" class="col-sm-2 control-label">Niz</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="niz" id="niz" items="${materials}" itemValue="niz" itemLabel="niz"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="obechaika" class="col-sm-2 control-label">Obechaika</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="obechaika" id="obechaika" items="${materials}" itemValue="obechaika" itemLabel="obechaika"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="grif" class="col-sm-2 control-label">Grif</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="grif" id="grif" items="${materials}" itemValue="grif" itemLabel="grif"/>
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
			<div class="col-md-4 col-xs-4"><h3>Materials</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${materialss}" var="materials">
				<div class="row">
					<div class="col-md-4 col-xs-4">${materials.materials}</div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-warning" href="/admin/materials/update/${materials.id}">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/materials/delete/${materials.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>