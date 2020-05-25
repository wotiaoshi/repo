$(function () {

    //全选框与单选框
    $("#qx").click(function () {
        $("input[name=xz]").prop("checked", this.checked);
    });
    $("#interfaceBody").on("click", $("input[name=xz]"), function () {
        $("#qx").prop("checked", $("input[name=xz]").length === $("input[name=xz]:checked").length)
    });


    //为保存按钮绑定事件，执行市场活动的添加操作
    $("#add-save").click(function () {
        $.ajax({
            url: "interfaces/add",
            data: {
                "name": $.trim($("#add-name").val()),
                "fromSource": $.trim($("#add-fromSource").val()),
                "field": $.trim($("#add-field").val()),
                "dataContent": $.trim($("#add-dataContent").val()),
                "dataType": $.trim($("#add-dataType").val()),
                "syncCycle": $.trim($("#add-syncCycle").val()),
                "dataCount": $.trim($("#add-dataCount").val()),
                "shuliangji": $.trim($("#add-shuliangji").val()),
                "collectUnit": $.trim($("#add-collectUnit").val()),
                "interfaceComputer": $.trim($("#add-interfaceComputer").val()),
                "documentCatagory": $.trim($("#add-documentCatagory").val()),
                "documentName": $.trim($("#add-documentName").val()),
                "duiSystemLeadingPerson": $.trim($("#add-duiSystemLeadingPerson").val()),
                "benSystemLeadingPerson": $.trim($("#add-benSystemLeadingPerson").val()),
                "description": $.trim($("#add-description").val())
            },
            type: "post",
            dataType: "json",
            success: function (data) {
                /*
                   data
                        {"success":true/false}
                 */

                if (data.success) {
                    alert("添加成功");
                    //添加成功
                    //刷新列表
                    //pageList(1,$("#activityPage").bs_pagination('getOption', 'rowsPerPage'));

                    //清空添加的form表单
                    $("#add-form")[0].reset();

                    //关闭模态窗口
                    $("#addInterfacesModal").modal("hide");
                } else {
                    alert("添加接口失败，请稍后重试");
                }
            }
        })
    });


    //删除按钮绑定事件，删除操作
    $("#deleteInterfacesBtn").click(function () {
        var $xz = $("input[name=xz]:checked");

        //参数处理
        if ($xz.length == 0) {
            alert("请选择需要删除的记录");
        } else {
            //肯定选了，有可能是一条，有可能选了多条
            if (confirm("确定要删除所选记录吗?")) {
                var param = "";
                //遍历所有选中的元素，取得id值，拼接为为后台传递的参数
                for (var i = 0; i < $xz.length; i++) {
                    param += "ids=" + $($xz[i]).val() + "&";
                }
                param = param.substr(0, param.length - 1);

                $.ajax({
                    url: "interfaces/delete",
                    data: param,
                    type: "post",
                    dataType: "json",
                    success: function (data) {
                        if (data.success) {
                            //删除成功
                            //刷新列表
                            //pageList(1,2);
                            //pageList(1,$("#activityPage").bs_pagination('getOption', 'rowsPerPage'));
                        } else {
                            alert("删除接口失败");
                        }
                    }
                })
            }
        }
    })

});


function pageList(pageNo, pageSize) {

    //alert("查询并局部刷新市场活动列表");

    //将全选的复选框的√灭掉
    $("#qx").prop("checked", false);

    //将隐藏域中的信息取出，重新赋值给搜索框
    $("#search-name").val($.trim($("#hidden-name").val()));
    $("#search-owner").val($.trim($("#hidden-owner").val()));
    $("#search-startDate").val($.trim($("#hidden-startDate").val()));
    $("#search-endDate").val($.trim($("#hidden-endDate").val()));

    $.ajax({

        url: "workbench/activity/pageList2.do",
        data: {

            "pageNoStr": pageNo,
            "pageSizeStr": pageSize,
            "name": $.trim($("#search-name").val()),
            "owner": $.trim($("#search-owner").val()),
            "startDate": $.trim($("#search-startDate").val()),
            "endDate": $.trim($("#search-endDate").val())

        },
        type: "get",
        dataType: "json",
        success: function (data) {
            var html = "";

            $.each(data.dataList, function (i, n) {

                html += '<tr class="active">';
                html += '<td><input type="checkbox" name="xz" value="' + n.id + '"/></td>';
                html += '<td><a style="text-decoration: none; cursor: pointer;" onclick="window.location.href=\'workbench/activity/toActivityDetail.do?id=' + n.id + '\';">' + n.name + '</a></td>';
                html += '<td>' + n.owner + '</td>';
                html += '<td>' + n.startDate + '</td>';
                html += '<td>' + n.endDate + '</td>';
                html += '</tr>';

            });

            $("#activityBody").html(html);

            //以上列表信息展现完毕后，使用bs_pagination来操作分页相关的信息

            //计算总页数
            var totalPages = data.total % pageSize == 0 ? data.total / pageSize : parseInt(data.total / pageSize) + 1;

            $("#activityPage").bs_pagination({
                currentPage: pageNo, // 页码
                rowsPerPage: pageSize, // 每页显示的记录条数
                maxRowsPerPage: 20, // 每页最多显示的记录条数
                totalPages: totalPages, // 总页数
                totalRows: data.total, // 总记录条数

                visiblePageLinks: 3, // 显示几个卡片

                showGoToPage: true,
                showRowsPerPage: true,
                showRowsInfo: true,
                showRowsDefaultInfo: true,

                //该函数的触发时机：在我们点击分页组件的时候（上一页，下一页，首页，尾页，12345...页）
                onChangePage: function (event, data) {
                    /*

                        data.currentPage：点击分页组件后的当前页码
                        data.rowsPerPage：点击分页组件后每页展现的记录数

                        以上这两个值，是分页插件为我们提供的，我们千万不要去改动

                     */
                    pageList(data.currentPage, data.rowsPerPage);
                }
            });
        }
    })
}