<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="register">  
<s:textfield name="name" label="Empname"></s:textfield>  
<s:date name = "DOB" format = "dd/MM/yyyy" />
<s:textfield name="address" label="address"></s:textfield>
<s:textfield name="mobile" label="mobile"></s:textfield>
<s:radio list="{'male','female'}" name="gender"></s:radio> 
<s:textfield name="username" label="username"></s:textfield>  
<s:password name="password" label="Password"></s:password>   
<s:submit value="register"></s:submit>  
</s:form>  
</body>
</html>