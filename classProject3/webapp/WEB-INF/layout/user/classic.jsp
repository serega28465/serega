<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/resources/js/jquery-3.1.1.min.js"></script>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<script src="/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/chosen.jquery.min.js"></script>
<link rel="stylesheet" href="/resources/css/chosen.min.css">
<script type="text/javascript">
	$(function() {
		$("select").chosen();
	});
</script>
<style type="text/css">
body {
	padding-bottom: 70px; 
	padding-top: 70px;
}
</style>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
    <tiles:insertAttribute name="header" />
	<div class="container-fluid">
		<tiles:insertAttribute name="body" />
	</div>
		<tiles:insertAttribute name="footer" />
</body>
</html>