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



<!-- 模态框 -->
<div class="modal fade" id="siUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel1">订单修改</h4>
            </div>
            <div class="modal-body">


                <form class="form-horizontal">

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">订购原料1</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="rs1"></p>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="rs2" class="col-sm-2 control-label">订购原料2</label>
                        <div class="col-sm-10">
                            <input type="text" name="siadd2" class="form-control" id="rs2"
                                   placeholder="输入第二种原料订购量/袋">
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="rs3" class="col-sm-2 control-label">订购原料3</label>
                        <div class="col-sm-10">
                            <input type="text" name="siadd3" class="form-control" id="rs3"
                                   placeholder="输入第三种原料订购量/袋">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">选择店铺</label>
                        <div class="col-sm-4">
                            <select name="susername1" id="shopname1" class="form-control">

                            </select>
                        </div>
                    </div>
                </form>


            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="submitSI1">更新</button>
            </div>
        </div>
    </div>
</div>



<!-- 模态框 -->
<div class="modal fade" id="siModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">订单增加</h4>
            </div>
            <div class="modal-body">


                <form class="form-horizontal">

                    <div class="form-group">
                        <label for="resource1" class="col-sm-2 control-label">订购原料1</label>
                        <div class="col-sm-10">
                            <input type="text" name="siadd1" class="form-control" id="resource1"
                                   placeholder="输入第一种原料订购量/袋">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="resource2" class="col-sm-2 control-label">订购原料2</label>
                        <div class="col-sm-10">
                            <input type="text" name="siadd2" class="form-control" id="resource2"
                                   placeholder="输入第二种原料订购量/袋">
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="resource3" class="col-sm-2 control-label">订购原料3</label>
                        <div class="col-sm-10">
                            <input type="text" name="siadd3" class="form-control" id="resource3"
                                   placeholder="输入第三种原料订购量/袋">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">选择店铺</label>
                        <div class="col-sm-4">
                            <select name="susername" id="shopname" class="form-control">

                            </select>
                        </div>
                    </div>
                </form>


            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="submitSI">提交</button>
            </div>
        </div>
    </div>
</div>


<%--表头--%>
<div class="row">
    <div class="col-md-12">
        <h1>查询所有订单</h1>
    </div>
</div>
<%--增加删除--%>
<div class="row">
    <div class="col-md-4 col-md-offset-8">
        <button class="btn btn-primary" id="si_add_modal_btn" data-target="#siModal">新增</button>
        <button class="btn btn-danger" id="">删除</button>
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

    var currentPage;

    $(function () {
        topage(1);
    });

    function topage(pn) {
        $.ajax({
            url: "${BASE_PATH}/shopinventories",
            data: "pn=" + pn,
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
        $.each(si, function (index, item) {
            var siidTd = $("<td></td>").append(item.siid);
            var sisidTd = $("<td></td>").append(item.sisid);
            var susernameTd = $("<td></td>").append(item.shop.susername);
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn").append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
            //add编辑按钮的属性
            editBtn.attr("edit_id",item.siid);


            var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm del_btn").append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("删除");
            var BtnTd = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
            $("<tr></tr>").append(siidTd).append(sisidTd).append(susernameTd).append(BtnTd).appendTo("#sitable tbody");
        })

    }

    function build_si_navtext(result) {
        $("#pagetext").empty();
        $("#pagetext").append("共" + result.extend.pageInfo.pages + "页" + "共" + result.extend.pageInfo.total + "份订单" + "当前第" + result.extend.pageInfo.pageNum + "页");
        currentPage = result.extend.pageInfo.pageNum;

    }

    function build_si_nav(result) {

        $("#nav").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;").attr("href", "#"));

        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {

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
        } else {
            nextPageLi.click(function () {
                topage(result.extend.pageInfo.pageNum + 1);
            })
            lastPageLi.click(function () {
                topage(result.extend.pageInfo.lastPage);
            });
        }
        ul.append(firstPageLi).append(prePageLi);
        $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {
            var midPageLi = $("<li></li>").append($("<a></a>").append(item).attr("href", "#"));
            if (result.extend.pageInfo.pageNum == item) {
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

        $("#si_add_modal_btn").click(function () {
            getShops("#shopname");
            $("#siModal").modal({
                backdrop: "static"
            });
        });

        //    编辑按钮事件
        $(document).on("click",".edit_btn",function () {
            getShops("#shopname1");

            getRS1($(this).attr("edit_id"));

            $("#submitSI1").attr("edit_id",$(this).attr("edit_id"));

            $("#siUpdateModal").modal({
                backdrop: "static"
            });
        })
//获取第一种配料信息根据id
        function getRS1(id) {
            $.ajax({
                url:"${BASE_PATH}/shopinventories/"+id,
                type:"GET",
                success:function (result) {
                    console.log(result);
                    var siData = result.extend.si;
                    $("#rs1").text(siData.siadd1);
                    $("#rs2").val(siData.siadd2);
                    $("#rs3").val(siData.siadd3);
                    $("#siUpdateModal select").val([siData.shop.susername]);
                }
            });
        }

        $("#submitSI1").click(function () {
            $.ajax({
                url:"${BASE_PATH}/shopinventories/"+$(this).attr("edit_id"),
                type:"PUT",
                data:$("#siUpdateModal form").serialize(),
                success:function (result) {
                    $("#siUpdateModal").modal('hide');
                    topage(currentPage);
                }

            })
        })

        function getShops(ele) {
            $(ele).empty();

            $.ajax({
                url:"${BASE_PATH}/shop",
                type:"GET",
                success:function (result) {
                    $.each(result.extend.shops,function (index,item) {
                        var optionEl = $("<option></option>").append(item.susername).attr("value",item.sisid);
                        optionEl.appendTo($(ele));
                    })
                }
            });
        }
    }
    $("#submitSI").click(function () {
        alert($("#siModal form").serialize());
        $.ajax({
            url:"${BASE_PATH}/shops",
            type:"POST",
            data:$("#siModal form").serialize(),
            success:function (result) {
                alert(result.massage);
            }
        })
    });

</script>
</body>
</html>
