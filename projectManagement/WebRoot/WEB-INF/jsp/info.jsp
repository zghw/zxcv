<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'info.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="getList" method="post">
       
      
       	<table style="border: 1px solid #000;">
       	<tr><td align="center" colspan="5"><h1>项目申报表</h1></td></tr>
       		<tr>
       			<th width="20%">项目编号</th>
       			<th width="30%">项目名称</th>
       			<th width="20%">申报开始日期</th>
       			<th width="20%">申报结束日期</th>
    
       			<th width="10%">操作</th>
       		</tr>
       		<c:if test="${list != null }">
       			<c:forEach items="${list}" var="item">
       				<tr>
       					<td>${item.id }</td>
       					<td>${item.projectName }</td>
       					<td><fmt:formatDate value="${item.startDate }" pattern="yyyy-MM-dd" /></td>
       					<td><fmt:formatDate value="${item.endDate }" pattern="yyyy-MM-dd" /></td>
       				
       					<td>
       					<c:if test="${item.status!=2}">
       					<a href="alter?id=${item.id }">审核</a>
       					</c:if>
       					 </td>
       				</tr>
       			</c:forEach>
       		</c:if>
       	</table>
    </form>
  </body>
</html>
