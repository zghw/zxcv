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
    
    <title>My JSP 'alterProject.jsp' starting page</title>
    
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
     <form name="update" action="alteritem">
    <table border="1px">
    <tr>
    	 <td align="center" colspan="2"> <h1>申报项目信息</h1></td>
    </tr>
    <input style="display: none" type="text" name="id" value="${iteminfo.id }"/>
    	<tr style="background-color:#999">
    		<td>项目编号</td>
    		<td>${iteminfo.id }</td>
    		
    	</tr>
    	<tr>
    		<td>项目名称</td>
    		<td>${iteminfo.projectName }</td>
    	</tr>
    	<tr>
    		<td>开始日期</td>
    		<td><fmt:formatDate value="${iteminfo.startDate }" pattern="yyyy-MM-dd" /></td>
    	</tr>
    	<tr>
    		<td>结束日期</td>
    		<td><fmt:formatDate value="${iteminfo.endDate }" pattern="yyyy-MM-dd" /></td>
    	</tr>
    	<tr>
    		<td>申报状态</td>
    		<td>
    		<select name="status">
                	   <c:if test="${iteminfo.status==0 }">
                	   	<option value="0" selected="selected">已申报</option>
                       	<option value="1">审核中</option>
                       	<option value="2">已审核</option>
                	   </c:if>
                       <c:if test="${iteminfo.status==1 }">
                       	<option value="1" selected="selected">审核中</option>
                       	<option value="2">已审核</option>
                	   </c:if>
                   </select>
    		</td>
    	</tr>
    
    	<tr>
    		
    		<td> <a href="list">返回</a>   <input type="submit" value="审核"></td>
    	</tr>
    	
    </table>
    </form>
  </body>
</html>
