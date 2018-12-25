<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
		 		${user.name}
		 	</td>
		</tr>
	</c:forEach>
</tbody>

</table>