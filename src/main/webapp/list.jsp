<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>

<head>
<link href="<%=request.getContextPath()%>/css/index_work.css" rel="stylesheet">

</head>
<body>
	<h1>列表界面</h1>
	
	<table>
	   <tr>
			<td colspan="11">
			<form action="list" method="post">
			id:<input type="text" name="id"><br>
			keywords:<input type="text" name="keywords"><br>
			description:<input type="text" name="description"><br>
			name:<input type="text" name="name"><br>
			cp:<input type="text" name="cp"><br>
			
			dz:<input type="text" name="dz"><br>
			zb:<input type="text" name="zb"><br>
			cltime:<input type="text" name="cltime"><br>
			njtime:<input type="text" name="njtime"><br>
			zt:<input type="text" name="zt"><br>
			bz:<input type="text" name="bz"><br>
			<input type="submit"  value="提交"><br>
			</form>
			</td>
		</tr>
		<tr>
			<th>id</th>
			<th>keywords</th>
			<th>description</th>
			<th>name</th>
			<th>cp</th>
			
			<th>dz</th>
			<th>zb</th>
			<th>cltime</th>
			<th>njtime</th>
			<th>zt</th>
			<th>bz</th>
		</tr>
		<c:forEach items="${pageInfo.list }" var="gs">
			<tr>
				<td>${gs.id }</td>
				<td>${gs.keywords }</td>
				<td>${gs.description }</td>
				<td>${gs.name }</td>
				<td>${gs.cp }</td>
				
				<td>${gs.dz }</td>
				<td>${gs.zb }</td>
				<td>${gs.cltime }</td>
				<td>${gs.njtime }</td>
				<td>${gs.zt }</td>
				<td>${gs.bz }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
			${pageInfo.total}记录数
			<a href="list?pageNum=1">首页</a>
			<a href="list?pageNum=100">100</a>
			<a href="list?pageNum=${pageInfo.prePage}">上一页</a>
			<a href="list?pageNum=${pageInfo.nextPage}">下一页</a>
			<a href="list?pageNum=${pageInfo.pages}">尾页</a>
			</td>
		</tr>
	</table>

</body>
</html>