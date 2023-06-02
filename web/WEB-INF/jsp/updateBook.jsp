<%--
  Created by IntelliJ IDEA.
  User: huawei
  Date: 2023/5/1
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改客户信息</small>
                </h1>
            </div>
        </div>

    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%--        SQL语句updateBook，需要ID，所以前端 构建隐藏域--%>
        <input type="hidden" name="bookID" value="${Qbook.bookID}" >
        <div class="form-group">
            <label>客户名称：</label>
            <input type="text" name="bookName"class="form-control" value="${Qbook.bookName}" required>
        </div>
        <div class="form-group">
            <label>产品数量：</label>
            <input type="text" name="bookCounts" class="form-control" value="${Qbook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>产品描述：</label>
            <input type="text" name="detail" class="form-control" value="${Qbook.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>



</div>
</body>
</html>
