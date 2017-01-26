<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
					<li class="active"><a href="/admin/category">Category</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/color">Color</a></li>
					<li><a href="/admin/producer">Producer</a></li>
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
				<form class="form-horizontal" action="/admin/category" method="POST">
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label">Name</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="name" id="name">
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-default">Create</button>
    					</div>
  					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-xs-4"><h3>Category name</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Update</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${categories}" var="category">
				<div class="row">
					<div class="col-md-4 col-xs-4">${category.category}</div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-warning" href="/admin/category/update/${category.id}">update</a></div>
					<div class="col-md-4 col-xs-4"><a class="btn btn-danger" href="/admin/category/delete/${category.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>
