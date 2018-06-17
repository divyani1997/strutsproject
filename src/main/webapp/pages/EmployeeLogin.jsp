<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="EmployeeLoginDao">
			<s:textfield name="userName" label="UserName" />
			<s:password name="password" label="Password" />
			<s:submit value="login" align="center">
			</s:submit> 
		</s:form>
		<s:form action="EmployeeRegister">
		<s:submit value="Sign UP"/>
		</s:form>
</body>
</html>