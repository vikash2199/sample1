<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  

		<h1>Edit Employee</h1>
       <form:form method="POST" action="/process2/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>EventName : </td> 
          <td><form:input path="eventName"  /></td>
         </tr>  
         <tr>  
          <td>OrganiserName :</td>  
          <td><form:input path="eventOrganiserName" /></td>
         </tr> 
         <tr>  
          <td>Date :</td>  
          <td><form:input  path="onDay" /></td>
         </tr> 
         <tr>  
          <td>Fare :</td>  
          <td><form:input path="eventFare" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  

</body>
</html>