<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>birthdays</title>
</head>
<body>

<s:if test="flag">
<img src="images/birthdayIcon.jpg"  /> <s:property value="	displayBirthdayList" />
</s:if>
<s:else>


</s:else>


 

</body>
</html>