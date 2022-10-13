<%@ page contentType="text/html;charset=UTF-8" language="java" import="backends.*"%>
<%@ page import="java.sql.SQLException" %>
<%@ page import="javax.servlet.jsp.JspWriter" %>

<html>
<head>
    <title>Query3</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>index</title>
    <link rel="stylesheet" href="layui/layui/css/layui.css">
</head>
<body>
<%ConnectDB connector = new ConnectDB();%>
<%connector.buildConnection();%>
<%JspWriter mount = pageContext.getOut();%>

<div class="layui-anim layui-anim-fadein">
    <h1 style="text-align:center">Query: The course numbers and names of all courses offered by either Department of
        Computer Science or Department of Landscape Architect.</h1>
    <br>

    <%
        try {
            ResultsPrinter.printResultSet(connector.query("select number, name from courses where department_code = any(select code from departments where departments.name = 'Computer Science' or departments.name = 'Landscape Architect');"), mount);
            connector.disconnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    %>
</div>

<a href="Query.jsp">
    <div class="layui-anim layui-anim-scale">
        <button class="layui-btn layui-btn-radius layui-btn-normal">Return</button>
    </div>
</a>

</body>
</html>
