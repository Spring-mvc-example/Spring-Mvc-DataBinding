<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${headerMessage }</h1>
<table>
<tr>
   <td>Student Name</td>
    <td>${student1.studentname }</td>
    </tr>
    <tr>
    <td> Student Hobby</td>
    <td> ${student1.studenthobby }</td>
    </tr>
    <tr>
    <td> Student Mobile</td>
    <td> ${student1.studentmobile }</td>
    </tr>
   
    <tr> 
    <td> student skills </td>
    <td> ${student1.studentskill}</td>
    </tr>
    
    

</table>

</body>
</html>