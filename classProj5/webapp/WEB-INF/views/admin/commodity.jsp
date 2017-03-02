<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<style>
	#filter>.form-group>.col-sm-12>span{
		display: block;
	}
</style>
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
					<li  class="active"><a href="/admin/commodity">Товар</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/country">Країна</a></li>
					<li><a href="/admin/material">Список матеріалів</a></li>
					<li><a href="/admin/materials">Матеріали</a></li>
					<li><a href="/admin/mechanika">Механіка</a></li>
					<li><a href="/admin/model">Модель</a></li>
					<li><a href="/admin/size">Розмір</a></li>
					
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="col-md-3 col-xs-12">
		<c:if test="${category eq null}">
			<form:form class="form-horizontal" action="/admin/commodity" method="GET" modelAttribute="filter" id="filter">
				<custom:hiddenInputs excludeParams="search, minPrice, maxPrice, producers, categorys"/>
					<div class="form-group">
					<div class="col-sm-12">
	      				<form:input type="text" class="form-control" path="search" placeholder="Search"/>
	    			</div>
				</div>
				<div class="form-group">
					<div class="col-sm-6 col-xs-6">
	      				<form:input type="text" class="form-control" path="minPrice" placeholder="Min price"/>
	    			</div>
	    			<div class="col-sm-6 col-xs-6">
	      				<form:input type="text" class="form-control" path="maxPrice" placeholder="Max price"/>
	    			</div>
				</div>
				
				<c:forEach items="${producers}" var="producers">
					<div class="form-group">
						<label class="col-sm-12">${producers.name}</label>
					</div>
					<div class="form-group">
						<div class="col-sm-12">
<%-- 							<form:checkboxes items="${producers.name}" itemLabel="producer" itemValue="id" path="producers"/> --%>
						</div>
					</div>	
				</c:forEach>
					
				
					<div class="form-group">
						<div class="col-sm-12">
							<form:checkboxes items="${categorys}" itemLabel="category" itemValue="id" path="categorys"/>
						</div>
					</div>
					
				<div class="form-group">
    				<div class="col-sm-12">
      					<button type="submit" class="btn btn-primary">Search</button>
    				</div>
  				</div>
			</form:form>
		</c:if>
	</div>
</div>
	
	<div class="col-md-7 col-xs-12">
	<c:if test="${category ne null}">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/commodity" method="POST" modelAttribute="commodity" enctype="multipart/form-data">
					<custom:hiddenInputs excludeParams="categorys, producers, price"/>
					<form:hidden value="${category.id}" path="category"/>
					<div class="form-group">
						<label for="category" class="col-sm-offset-2 col-sm-10"><form:errors path="category"/></label>
					</div>
					<div class="form-group">
    					<label class="col-sm-2 control-label">Category</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="categorys" itemLabel="categorys" itemValue="categorys" items="${categorys}"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label class="col-sm-2 control-label">Producer</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="producers" itemLabel="producers" itemValue="producers" items="${producers}"/>
    					</div>
  					</div>
					<div class="form-group">
						<label for="price" class="col-sm-offset-2 col-sm-10"><form:errors path="price"/></label>
					</div>
  					<div class="form-group">
  						<label class="col-sm-2 control-label">Price</label>
  						<div class="col-sm-7">
  							<form:input id="price" path="price" class="form-control"/>
  						</div>
  					</div>
  					<div class="form-group">
  						<div class="col-sm-offset-2 col-sm-10">
		  					<label class="btn btn-default btn-file">
		        				Browse <input type="file" name="file" style="display: none;">
		    				</label>
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
	</c:if>	
	<div class="row">
			<div class="col-md-2 col-xs-2"><h3>Image</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Item name</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Item price</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Category</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Producer</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Update</h3>
			<h3>Delete</h3></div>
		</div>
	<c:forEach items="${page.content}" var="commodity">
				<div class="row">
					<div class="col-md-2 col-xs-2"><img class="img-rounded" width="100%" src="/images/commodity/${commodity.id}.jpg?version=${commodity.version}"></div>
					<div class="col-md-2 col-xs-2">${Commodity.name}</div>
					<div class="col-md-2 col-xs-2">${commodity.price}</div>
					<div class="col-md-2 col-xs-2">${commodity.category.category}</div>
					<div class="col-md-2 col-xs-2">${commodity.producer.name}</div>
					<div class="col-md-2 col-xs-2"><a class="btn btn-warning" href="/admin/commodity/update/${commodity.id}<custom:allParams/>">update</a>
					<a class="btn btn-danger" href="/admin/commodity/delete/${commodity.id}<custom:allParams/>">delete</a></div>
				</div>
			</c:forEach>	
<div class="col-md-2 col-xs-12">
		<div class="row">
			<div class="col-md-6 col-xs-6 text-center">
				<div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Sort <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<custom:sort innerHtml="Name asc" paramValue="producers"/>
						<custom:sort innerHtml="Name desc" paramValue="producers,desc"/>
						<custom:sort innerHtml="Price asc" paramValue="price"/>
						<custom:sort innerHtml="Price asc" paramValue="price,desc"/>
					</ul>
				</div>
			</div>
			<div class="col-md-6 col-xs-6 text-center">
				<custom:size posibleSizes="1,2,5,10" size="${page.size}" />
			</div>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-md-12 col-xs-12 text-center">
		<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
	</div>
</div>	