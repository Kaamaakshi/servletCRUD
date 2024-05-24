<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<input type="number" name="id" value="<%=request.getParameter("id")%>"><br>
<input type="text" name="name" value="<%=request.getParameter("name")%>"><br>
<input type="email" name="email" value="<%=request.getParameter("email")%>"><br>
<input type="date" name="dob" value="<%=request.getParameter("dob")%>"><br>
<input type="number" name="number" value="<%=request.getParameter("phno")%>"><br>
male<input type="radio" name="gender" value="male"><br>
female<input type="radio" name="gender" value="female"><br>
country<select name="country">
<option>India</option>
<option>USA</option>
<option>UK</option>
</select><br>
<button>submit</button>
<button>cancel</button>

</form>


</body>
</html>