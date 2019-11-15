<%--
  Created by IntelliJ IDEA.
  User: tttttwtt
  Date: 2019/11/12
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>

<%--7、DispatcherServlet 已经知道由哪个视图渲染结果了，那请求的任务基本上也就完成了。--%>
<%--它的最后一站是视图的实现，在这里它交付模型数据，请求的任务也就完成了。
视图使用模型数据渲染出结果，这个输出结果会通过响应对象传递给客户端。--%>

<head>
    <title>hello spring mvc</title>
</head>
<body>
<%--用El表达式显示HelloController中message 的内容--%>
<h1>${message}</h1>
<p>${date}</p>
<form action="/param" role="form">
    <%--    在spring的一个controller中要把参数传到页面，只要配置视图解析器，把参数添加到Model中，在页面用el表达式就可以取到。
    但是，这样使用的是forward方式，浏览器的地址栏是不变的，如果这时候浏览器F5刷新，就会造成表单重复提交的情况。--%>
    <%--    可以使用重定向的方式，改变浏览器的地址栏，防止表单因为刷新重复提交。--%>
    name：<input type="text" name="name" value=${user.name}> <br/>
    password：<input type="text" name="password" value=${user.password}> <br/>
    <input type="submit" value="提  交">
</form>
</body>
</body>
</html>
