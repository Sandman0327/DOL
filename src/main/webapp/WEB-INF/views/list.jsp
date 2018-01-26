<%--
  Created by IntelliJ IDEA.
  User: CabbS
  Date: 2018/1/25
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>店铺订单</title>
    <%
        pageContext.setAttribute("BASE_PATH",request.getContextPath());
    %>
    <script type="text/javascript"
            src="${BASE_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <!-- 引入bootstrap -->
    <link
            href="${BASE_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${BASE_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    </head>
<body>

        <%--表头--%>
        <div class="row">
            <div class="col-md-12">
                <h1>查询所有订单</h1>
            </div>
        </div>
        <%--增加删除--%>
        <div class="row">
            <div class="col-md-4 col-md-offset-8">
                <button class="btn btn-primary" id="">新增</button>
                <button class="btn btn-danger">删除</button>
            </div>
        </div>
        <%--table body--%>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>序号</th>
                        <th>订单id</th>
                        <th>店铺id</th>
                        <th>操作</th>
                    </tr>
                </table>
            </div>
        </div>

       </body>
</html>
