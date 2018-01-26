<%--
  Created by IntelliJ IDEA.
  User: CabbS
  Date: 2018/1/25
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>店铺订单</title>
    <%
        pageContext.setAttribute("BASE_PATH", request.getContextPath());
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
        <table class="table table-hover" id="sitable">
            <thead>
            <tr>
                <th>订单id</th>
                <th>店铺id</th>
                <th>店铺名</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <%--利用jsp展现数据--%>
            </tbody>
        </table>
    </div>
</div>
<%--分页--%>
    <div class="row">
        <div class="col-md-6" id="pagetext">
            共份订单，共页，当前第页
        </div>
        <div class="col-md-6" id="nav">

        </div>
    </div>

<script type="text/javascript" language="JavaScript">
    $(function () {
        topage(1);
    });
    function topage(pn) {
        $.ajax({
            url: "${BASE_PATH}/shopinventories",
            data: "pn="+pn,
            type: "GET",
            success: function (result) {

                // console.log(result);

                build_si_table(result);
                build_si_navtext(result);
                build_si_nav(result);
            }
        });

    }

    function build_si_table(result) {

        $("#sitable tbody").empty();

        var si = result.extend.pageInfo.list;
        $.each(si,function (index,item) {
            var siidTd = $("<td></td>").append(item.siid);
            var sisidTd = $("<td></td>").append(item.sisid);
            var susernameTd = $("<td></td>").append(item.shop.susername);
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm").append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
            var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm").append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("删除");
            var BtnTd = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
            $("<tr></tr>").append(siidTd).append(sisidTd).append(susernameTd).append(BtnTd).appendTo("#sitable tbody");
        })

    }

    function build_si_navtext(result) {
        $("#pagetext").empty();
        $("#pagetext").append("共"+result.extend.pageInfo.pages+"页"+"共"+result.extend.pageInfo.total+"份订单"+"当前第"+result.extend.pageInfo.pageNum+"页");

    }

    function build_si_nav(result) {

        $("#nav").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;").attr("href","#"));

        if (result.extend.pageInfo.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else {

            firstPageLi.click(function () {
                topage(1);
            });
            prePageLi.click(function () {
                topage(result.extend.pageInfo.pageNum - 1);
            });
        }

            var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;").attr("href", "#"));
            var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
        if (result.extend.pageInfo.hasNextPage == false) {
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else {
            nextPageLi.click(function () {
                topage(result.extend.pageInfo.pageNum + 1);
            })
            lastPageLi.click(function () {
                topage(result.extend.pageInfo.lastPage);
            });
        }
        ul.append(firstPageLi).append(prePageLi);
        $.each(result.extend.pageInfo.navigatepageNums,function (index,item) {
            var midPageLi = $("<li></li>").append($("<a></a>").append(item).attr("href","#"));
            if(result.extend.pageInfo.pageNum == item){
                midPageLi.addClass("active");
            }
            midPageLi.click(function () {
                topage(item);
            });
            ul.append(midPageLi);
        })
        ul.append(nextPageLi).append(lastPageLi);

        var navEl = $("<nav></nav>").append(ul);
        navEl.appendTo("#nav");
    }
</script>
</body>
</html>
