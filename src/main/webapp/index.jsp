<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>index</title>
    <link rel="stylesheet" href="layui/layui/css/layui.css">
</head>
<body>

<div class="layui-anim layui-anim-down">
    <h1 style="text-align:center">Welcome to the database web manage system!</h1>
</div>

<div class="layui-anim layui-anim-scale">
<p style="text-align: center;">
    <img src = 'https://s3.bmp.ovh/imgs/2022/10/13/293d9968c1c745f8.jpg'  alt="school_icon" width="500" height="500"/>
</p>
</div>
<br>
<div class="layui-anim layui-anim-fadein">
<h3 style="text-align:center">Click submit to create tables</h3>
</div>
<br>
<a style="text-align: center;">
    <form action="Results" method="post">
        <div class="layui-anim layui-anim-scale">
            <button type="submit" name="button" value="createTable" class="layui-btn">Submit</button>
        </div>
    </form>
</a>
<br>
<div class="layui-anim layui-anim-fadein">
<h3 style="text-align:center">Click insert to insert records</h3>
</div>
<br>
<a style="text-align: center;">
    <form action="Results" method="post">
        <div class="layui-anim layui-anim-scale">
            <button type="submit" name="button" value="insertRecords" class="layui-btn">Insert</button>
        </div>
    </form>
</a>
<br>
<div class="layui-anim layui-anim-fadein">
<h3 style="text-align:center">Click query to query</h3>
</div>
<br>
<a style="text-align: center;" href="Query.jsp">
    <div class="layui-anim layui-anim-scale">
        <button class="layui-btn">Query</button>
    </div>
</a>
<br>
<div class="layui-anim layui-anim-fadein">
<h3 style="text-align:center">Click modify to modify</h3>
</div>
<br>
<a style="text-align: center;">
    <form action="Results" method="post">
        <div class="layui-anim layui-anim-scale">
            <button type="submit" name="button" value="modify" class="layui-btn">Modify</button>
        </div>
    </form>
</a>
<form action="Results" method="post">
    <button type="submit" name="button" value="egg" class="layui-btn layui-btn-disabled"></button>
</form>
</body>
</html>
