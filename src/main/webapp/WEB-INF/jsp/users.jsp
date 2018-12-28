<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ include file="../layout/taglib.jsp" %>


<table class="table table-bordered table-hover table-striped" >
<thead>
	<tr>
		<th>user name</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${users}" var="user">
		<tr>
		 	<td>
		 		<a href='<spring:url value="/users/${user.id}.html"></spring:url>'>
		 		${user.name}
		 	</td>
		</tr>
	</c:forEach>
</tbody>

</table>