<%--
  Created by IntelliJ IDEA.
  User: 79903
  Date: 2019/3/27
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<%
    String basePath = request.getScheme()+"://"+request.getServerName();
    if(request.getServerPort()!=80){
        basePath+=":"+request.getServerPort();
    }
    basePath+=request.getContextPath();
    pageContext.setAttribute("basepath", basePath);
%>
</body>
</html>
