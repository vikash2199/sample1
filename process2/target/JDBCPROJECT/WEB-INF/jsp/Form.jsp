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
<body style="text-align:center">

  		<h1>Add New Event</h1>
       <form:form method="post"  action="save">  
      	<table >  
         <tr>  
          <td>EventName : </td> 
          <td><form:input path="eventName"  /></td>
         </tr>  
         <tr>  
          <td>OrganiserName :</td>  
          <td><form:input path="eventOrganiserName" /></td>
         </tr> 
         <tr>  
          <td>Fair :</td>  
          <td><form:input path="eventFare" /></td>
         </tr> 
                  <tr>  
          <td>Date :</td>  
          <td><form:input  path="onDay" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
</body>
</html>