<%--
  Created by IntelliJ IDEA.
  User: 79903
  Date: 2019/3/27
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/pages/common/head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <script src="${basepath}/js/jquery.js"></script>

    <script>
        $(function(){
            $.ajax({
                "url":"http://127.0.0.1:80/goods/ajax",
                "type":"get",
                "data":{"id":100},
                "async":"true",
                "dataType":"text",
                "success":function (result) {
                    alert(result);
                }
            });
        })
    </script>

</body>
</html>
