<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Admission Form</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
	<h1>${headerMessage}</h1>
	<form:errors path="student1.*" class="error"/>
	
	
	<form action="/FirstSpringMVCProject/submitAdmissionForm1.html"
		method="post">
		<p>
			Student Name : <input type="text" name="studentName" />
		</p>
		<p>
			Student Hobby : <input type="text" name="studentHobby" />
		</p>
		<p>
			Student Mobile : <input type="text" name="studentMobile" />
		</p>
		<p>
			Student DOB : <input type="text" name="studentDOB" />
		</p>

		Student's Skills Set : <select name="studentSkills" multiple>
			<option value="Core Java">Core Java</option>
			<option value="Spring MVC">Spring MVC</option>
			<option value="Spring Core">Spring Core</option>
		</select> <br /> <br /> 
		
		Student's Address :
		<p>
			Country : <input type="text" name="studentAddress.country" />
		</p>
		<p>
			City : <input type="text" name="studentAddress.city" />
		</p>
		<p>
			Street : <input type="text" name="studentAddress.street" />
		</p>
		<p>
			Pincode : <input type="text" name="studentAddress.pincode" />
		</p>
		
		<input type="submit" value="Submit this form by clicking here" /> 
	</form>
</body>
</html>