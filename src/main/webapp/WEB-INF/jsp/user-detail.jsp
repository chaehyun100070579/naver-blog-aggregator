<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ include file="../layout/taglib.jsp"%>


<h1>${user.name}</h1>


<c:forEach items="${user.blogs}" var="blog">
	<h1>${blog.name}</h1>
	<p>${blog.url}</p>
	<table>
		<head>
		<tr>
			<th>Title</th>
			<th>Link</th>
		</tr>
		</head>
		<tbody>
			<c:forEach items="${blog.items}" var="item">
				<tr>
					<td>${item.title}</td>
					<td>${item.link}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:forEach>



