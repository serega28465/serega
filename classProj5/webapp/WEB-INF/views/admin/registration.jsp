<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
					<li class="active"><a href="/admin/category">Категорія</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/color">Color</a></li>
					<li><a href="/admin/producer">Producer</a></li>
					<li><a href="/admin/commodity">Commodity</a></li>
					<li><a href="/admin/country">Country</a></li>
					<li><a href="/admin/materials">Materials</a></li>
					<li><a href="/admin/mechanika">Mechanika</a></li>
					<li><a href="/admin/model">Model</a></li>
					<li><a href="/admin/size">Size</a></li>
					
					<li><a href="/registration">Registration</a></li>
					<li><a href="/login">Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="col-sm-12 col-xs-12">
		<form:form class="form-horizontal" action="/registration" method="POST" modelAttribute="userForm">
			<div class="form-group">
				<label for="name" class="col-sm-offset-2 col-sm-10"><form:errors path="username"/></label>
			</div>
			<div class="form-group">
    			<label for="name" class="col-sm-2 control-label">Login</label>
    			<div class="col-sm-10">
      				<form:input class="form-control" path="username" id="name"/>
    			</div>
  			</div>
  			<div class="form-group">
				<label for="email" class="col-sm-offset-2 col-sm-10"><form:errors path="email"/></label>
			</div>
			<div class="form-group">
    			<label for="email" class="col-sm-2 control-label">Email</label>
    			<div class="col-sm-10">
      				<form:input class="form-control" path="email" id="email"/>
    			</div>
  			</div>
  			<div class="form-group">
				<label for="email" class="col-sm-offset-2 col-sm-10"><form:errors path="email"/></label>
			</div>
			<div class="form-group">
    			<label for="password" class="col-sm-2 control-label">Password</label>
    			<div class="col-sm-10">
      				<form:password class="form-control" path="password" id="password"/>
    			</div>
  			</div>
  			<div class="form-group">
    			<div class="col-sm-offset-2 col-sm-10">
      				<button type="submit" class="btn btn-default">Register</button>
    			</div>
  			</div>
		</form:form>
	</div>
</div>