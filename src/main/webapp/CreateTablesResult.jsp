<%@ page contentType="text/html;charset=UTF-8" language="java" import="backends.*"%>
<%@ page import="java.sql.SQLException" %>
<%@ page import="javax.servlet.jsp.JspWriter" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>index</title>
    <link rel="stylesheet" href="layui/layui/css/layui.css">
    <title>Results</title>
</head>
<body>

<%ConnectDB connector = new ConnectDB();%>
<%connector.buildConnection();%>

<h2>The follow tables have been successfully created:</h2>

<%JspWriter mount = pageContext.getOut();%>
<%
    try {
        ResultsPrinter.printResultSet(connector.query("show tables;"), mount);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
%>
<%connector.disconnection();%>

<a href="index.jsp">
    <div class="layui-anim layui-anim-scale">
        <button class="layui-btn">Return</button>
    </div>
</a>

</body>
</html>
