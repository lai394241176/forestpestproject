<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--欢迎界面--%><!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>系统登陆</title>
    <link rel="icon" href="icon/bug.png">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
</head>
<body>
<div class="site-wrapper">

    <div class="site-wrapper-inner">
        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h2 class="masthead-brand">森林病虫害防治系统</h2>
                    <nav>
                        <ul class="nav masthead-nav">
                            <li class="active"><a href="#">登陆</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="container">

                <form class="form-signin">
                    <h3 class="form-signin-heading">系统登陆</h3>

                    <input type="text" id="inputAccount" class="form-control" placeholder="用户账户" required
                           autofocus>

                    <input type="password" id="inputPassword" class="form-control" placeholder="用户密码" required>
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me"> 记住密码
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
                </form>
            </div> <!-- /container -->


            <div class="mastfoot">
                <div class="inner">
                    <p>Cover by WriteAllRight.</p>
                </div>
            </div>
        </div>
    </div>


</div>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>