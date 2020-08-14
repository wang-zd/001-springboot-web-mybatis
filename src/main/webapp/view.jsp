<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>title</title>
</head>

<body>
<h1>${student.id}</h1><br/>
<h1>${student.age}</h1><br/>
<h1>${student.name}</h1><br/>
</body>
</html>
