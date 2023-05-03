<%--
  Created by IntelliJ IDEA.
  User: huawei
  Date: 2023/4/30
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a{
        text-decoration: none;//取消下划线
        color: black;
        font-size:18px;
      }
      h3{
        width:180px;
        height:38px;
        margin:100px auto;//边距
        text-align: center;//文本居中
        line-height:38px;//行高
        background:deepskyblue;//背景色 天蓝色
        border-radius:5px;//圆角边框

      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>
