<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<style>

    .layadmin-iframe {

        width: 1500px;
        height: 2000px;
        left: 0;

        right: 0;

    }

</style>
<link href="http://learning.cmr.com.cn/student/acourse/img/images/css/base.css" rel="stylesheet" type="text/css"/>
<link href="../img/images/css/course.css" rel="stylesheet" type="text/css"/>
<script src="http://learning.cmr.com.cn/student/acourse/js/jquery.min.js" type="text/javascript"></script>
<script src="../js/base64.js" type="text/javascript"></script>
<script src="../js/log.js" type="text/javascript"></script>
<script src="http://learning.cmr.com.cn/student/acourse/js/main.js" type="text/javascript"></script>
<script src="http://learning.cmr.com.cn/student/acourse/js/jqui.js" type="text/javascript"></script>
<script type="text/javascript" src="http://learning.cmr.com.cn/student/acourse/js/course.js"></script>
<body>
<%
    response.setHeader("P3P", "CP='IDC DSP COR ADM DEVi TAIi PSA PSD IVAi IVDi CONi HIS OUR IND CNT'");
%>
<!-- 主体内容 -->
<div class="layui-body" id="LAY_app_body">
    <div class="layadmin-tabsbody-item layui-show" style="text-align: center">

        <%--<iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110001"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110002"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110003"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110004"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110005"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110006"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110007"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110008"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110009"
                class="layadmin-iframe"></iframe>
        <iframe src="http://learning.cmr.com.cn/student/acourse/HomeworkCenter/InstantRnd.asp?CourseID=zk103b&CID=04110010"
                class="layadmin-iframe"></iframe>--%>


        <c:forEach items="${homeworkList}" var="map">

            <iframe src="${map.homeUrl}"
                    class="layadmin-iframe"></iframe>


        </c:forEach>

    </div>

</div>

</body>
</html>