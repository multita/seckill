<%--
  Created by IntelliJ IDEA.
  User: hjt
  Date: 2019/4/24
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <
    <title>插件之一：模态窗口</title>
</head>
<body>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">点击留言</button>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="media-header">
                <button data-dismiss="modal" class="close" type="button">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4>留言板</h4>
            </div>
            <div class="modal-body">
                <p>留言内容</p>
                <textarea class="form-control"></textarea>
            </div>
            <div class="modal-footer">
                <button data-dismiss="modal" class="btn btn-primary" type="button">取消</button>
                <button class="btn btn-success" type="button">确定</button>
            </div>
        </div>
    </div>
</div>


<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
    $(function () {
        $('#myModal').on('show.bs.modal', function () {
            alert('Start to show');
        });
        $('#myModal').on('shown.bs.modal', function () {
            alert('Finished show');
        });
        $('#myModal').on('hide.bs.modal', function () {
            alert('Start to hide');
        });
        $('#myModal').on('hidden.bs.modal', function () {
            alert('Finished hide')
        })
    })
</script>
</body>
</html>