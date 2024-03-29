<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huawei
  Date: 2023/4/30
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户信息展示</title>
<%--    用Bootstrap 美化界面--%>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>客户列表 ------显示所有客户</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
<%--                toaddBook--%>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增客户</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">显示全部客户</a>
            </div>

            <div class="col-md-8 column">
<%--                查询书籍--%>
                <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBook" method="post" style="float: right">
                    <span style="color: red;font: bold">${err}</span>
                    <input type="text" name="queryBookName" class="form-control" placeholder="请输入客户名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>客户编号</th>
                    <th>客户名称</th>
                    <th>产品数量</th>
                    <th>产品详情</th>
                    <th>操作</th>
                </tr>

                </thead>
<%--                书籍从数据库中查询出来的，从list中遍历出来：foreach--%>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookID}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td>

                            <a href="${pageContext.request.contextPath}/book/toUpdate?id=${book.bookID}">修改</a>
                            &nbsp;| &nbsp;
                            <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>

    </div>

</div>

</body>
</html>
