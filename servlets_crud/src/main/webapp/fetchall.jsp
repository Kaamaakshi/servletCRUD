<%@page import="StudentDTO.Student_DTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Student_DTO> l=(List<Student_DTO>)request.getAttribute("yamini"); %>
<table border=" ">
<tr>
<th>id</th>
<th>name</th>
<th>country</th>
<th>delete</th>
<th>update</th>
</tr>
<%for(Student_DTO a:l) {%>
<tr>
<td><%=a.getId()%></td>
<td><%=a.getName()%></td>
<td><%=a.getCountry()%></td>
<td><a href="did?pk=<%=a.getId()%>">remove</a></td>
<td><a href="update.jsp?id=<%=a.getId()%>&&name=<%=a.getName()%>&&
                                         email=<%=a.getEmail()%>&&
                                         dob=<%=a.getDob()%>&&
                                         phno=<%=a.getNumber()%>&&
                                         gender=<%=a.getGender()%>&&
                                         country=<%=a.getCountry()%>">Modify</a></td>
</tr>
<%} %>
</table>
</body>
</html>