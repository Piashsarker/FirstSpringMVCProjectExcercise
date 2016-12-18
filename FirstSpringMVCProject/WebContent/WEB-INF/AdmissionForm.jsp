<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${headerMsg }</h1>
 <h1>Student Admission From For This Course:</h1>
 <form action="/FirstSpringMVCProject/admission/submitAdmissionForm.html" method="post">
 <h2> ${error_msg}</h2>
 
 <p>Student Name: <input type="text" name="studentName"/></p>
  <p>Student Hobby: <input type="text" name="studentHobby"/></p>
 
  <p> Student's Mobile: <input type="text" name="studentMobile"/></p>
  <p> Student's Dob: <input type="text" name="studentDOB"/></p>
  <p> Student's Skills set: <select name="studentSkills" multiple>
  <option value="Java Core">Java Core</option>
  <option value="Spring Core">Spring Core</option>
  <option value="Spring MVC">Spring MVC</option>
  
  </select> </p>
  <p>Student Address: </p>
  <p>Country : <input type="text" name= "studentAddress.country"/></p>
  <p>City: <input type="text" name="studentAddress.city"/></p>
  <p>Street: <input type="text" name="studentAddress.street"/></p>
  <p>Pin Code: <input type="text" name="studentAddress.pincode"/></p>
   <input type="submit" value="Submit This From By Clicking Here"/>
 </form>
</body>
</html>