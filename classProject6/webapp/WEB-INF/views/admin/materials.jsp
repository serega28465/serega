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
					<li><a href="/admin/category">Категорія</a></li>
					<li><a href="/admin/color">Колір</a></li>
					<li><a href="/admin/producer">Виробник</a></li>
					<li><a href="/admin/commodity">Товар</a></li>
					<li><a href="/admin/country">Країна</a></li>
					<li><a href="/admin/material">Список матеріалів</a></li>
					<li class="active"><a href="/admin/materials" >Матеріали</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/mechanika">Механіка</a></li>
					<li><a href="/admin/model">Модель</a></li>
					<li><a href="/admin/size">Розмір</a></li>
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
    					<label for="verh" class="col-sm-2 control-label">Верхня дека: </label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="verh" id="verh" items="${verhs}" itemValue="id" itemLabel="material"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="niz" class="col-sm-2 control-label">Нижня дека: </label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="niz" id="niz" items="${nizs}" itemValue="id" itemLabel="material"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="obechaika" class="col-sm-2 control-label">Обечайка: </label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="obechaika" id="obechaika" items="${obechaikas}" itemValue="id" itemLabel="material"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="grif" class="col-sm-2 control-label">Гриф: </label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="grif" id="grif" items="${grifs}" itemValue="id" itemLabel="material"/>
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
			<div class="col-md-2 col-xs-2"><h3>Верхня дека</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Нижня дека</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Обечайка</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Гриф</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Update</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${materialss}" var="materials">
				<div class="row">
					<div class="col-md-2 col-xs-2">${materials.verh}</div>
					<div class="col-md-2 col-xs-2">${materials.niz}</div>
					<div class="col-md-2 col-xs-2">${materials.obechaika}</div>
					<div class="col-md-2 col-xs-2">${materials.grif}</div>
					<div class="col-md-2 col-xs-2"><a class="btn btn-warning" href="/admin/materials/update/${materials.id}">update</a></div>
					<div class="col-md-2 col-xs-2"><a class="btn btn-danger" href="/admin/materials/delete/${materials.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>