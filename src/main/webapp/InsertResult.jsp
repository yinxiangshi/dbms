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

<h2>The follow records have been successfully inserted:</h2>

<a href="http://localhost:8080/test">
  <div class="layui-anim layui-anim-scale">
    <button class="layui-btn">Return</button>
  </div>
</a>

<%JspWriter mount = pageContext.getOut();%>
<%
  try {
    out.print("Table name: students");
    out.print("<br>");
    ResultsPrinter.printResultSet(connector.query("select * from students;"), mount);
    out.print("<br>");
    out.print("Table name: departments");
    out.print("<br>");
    ResultsPrinter.printResultSet(connector.query("select * from departments;"), mount);
    out.print("<br>");
    out.print("Table name: courses");
    out.print("<br>");
    ResultsPrinter.printResultSet(connector.query("select * from courses;"), mount);
    out.print("<br>");
    out.print("Table name: degrees");
    out.print("<br>");
    ResultsPrinter.printResultSet(connector.query("select * from degrees;"), mount);
    out.print("<br>");
    out.print("Table name: register");
    out.print("<br>");
    ResultsPrinter.printResultSet(connector.query("select * from register;"), mount);
    out.print("<br>");
    out.print("Table name: major");
    out.print("<br>");
    ResultsPrinter.printResultSet(connector.query("select * from major;"), mount);
    out.print("<br>");
    out.print("Table name: minor");
    out.print("<br>");
    ResultsPrinter.printResultSet(connector.query("select * from minor;"), mount);
  } catch (SQLException e) {
    throw new RuntimeException(e);
  }
%>
<%connector.disconnection();%>

<a href="http://localhost:8080/test">
  <div class="layui-anim layui-anim-scale">
    <button class="layui-btn">Return</button>
  </div>
</a>

</body>
</html>
