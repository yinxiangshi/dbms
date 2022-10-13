<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>index</title>
    <link rel="stylesheet" href="layui/layui/css/layui.css">
    <title>Query Terminal</title>
</head>
<body>
<div class="layui-anim layui-anim-down">
    <h1 style="text-align:center">Please choose one of the following queries</h1>
</div>

<div class="layui-anim layui-anim-scale">
    <p style="text-align: center;">
        <img src = 'https://s3.bmp.ovh/imgs/2022/10/13/3b71d06f393e68d1.jpeg'  alt="query_icon" width="889" height="500"/>
    </p>
</div>

<br>

<div class="layui-anim layui-anim-fadein">
    <h3 style="text-align:center">Query 1: The student number and ssn of the student whose name is "Becky".</h3>
</div>
<br>
<a style="text-align: center;" href="Q1.jsp">
    <div class="layui-anim layui-anim-scale">
        <button class="layui-btn layui-btn-radius layui-btn-normal">Q1</button>
    </div>
</a>
<br>
<div class="layui-anim layui-anim-fadein">
    <h3 style="text-align:center">Query 2: All degree names and levels offered by the department of Computer Science.</h3>
</div>
<br>
<a style="text-align: center;" href="Q2.jsp">
    <div class="layui-anim layui-anim-scale">
        <button class="layui-btn layui-btn-radius layui-btn-normal">Q2</button>
    </div>
</a>
<br>
<div class="layui-anim layui-anim-fadein">
    <h3 style="text-align:center">Query 3: The course numbers and names of all courses offered by either Department of
        Computer Science or Department of Landscape Architect.</h3>
</div>
<br>
<a style="text-align: center;" href="Q3.jsp">
    <div class="layui-anim layui-anim-scale">
        <button class="layui-btn layui-btn-radius layui-btn-normal">Q3</button>
    </div>
</a>
<br>
<a href="index.jsp" style="text-align: center">
    <div class="layui-anim layui-anim-scale">
        <button class="layui-btn layui-btn-radius layui-btn-normal">Return</button>
    </div>
</a>
</body>
</html>
