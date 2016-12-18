<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1> Congratulation!</h1>
 
 <h2>${msg}</h2>
 
 <p>
 Student Name: ${student1.studentName} 
 Student Hobby: ${student1.studentHobby}</p>
 <p> Student Mobile: </p>
 <p>Student Date Of Birth: ${student1.studentDOB}</p>
 <p> Student Skills: ${student1.studentSkills}</p>
 <p> Country: ${student1.studentAddress.country}</p>
 <p> City: ${student1.studentAddress.city}</p>
 <p> Street: ${student1.studentAddress.street}</p>
 <p> Pincode: ${student1.studentAddress.pincode}</p>
</body>
</html>