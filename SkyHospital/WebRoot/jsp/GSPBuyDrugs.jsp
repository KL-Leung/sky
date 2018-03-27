<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>药品购进记录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/style.default.css"
	type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/plugins/jquery.cookie.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/custom/general.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/custom/tables.js"></script>
<style>
th {
	font-size: 10px;
}
</style>
</head>

<body class="withvernav">
	<div class="bodywrapper">
		<%@ include file="common/Top.jsp"%>

		<div class="centercontent tables">
			<div id="contentwrapper" class="contentwrapper">
				<div class="contenttitle2">
					<h3>药品购进记录列表</h3>
				</div>
				<!--contenttitle-->
				<table cellpadding="0" cellspacing="0" border="0" class="stdtable"
					id="dyntable2">
					<colgroup>
						<col class="con0" style="width: 4%" />
						<col class="con1" />
						<col class="con0" />
						<col class="con1" />
						<col class="con0" />
					</colgroup>

					<thead>
						<tr>
							<th class="head1">发票日期</th>
							<th class="head1">到货日期</th>
							<th class="head1">商品名</th>
							<th class="head1">通用名</th>
							
							<th class="head1">规格</th>
							<th class="head1">剂型</th>
							<th class="head1">单位</th>
							<th class="head1">数量</th>
							<th class="head1">生产厂家</th>
							
							<th class="head1">供货单位</th>
							<th class="head1">批准文号</th>
							<th class="head1">生产批号</th>
							<th class="head1">生产日期</th>
							<th class="head1">有效期</th>
							
							<th class="head1">验收</th>
						</tr>
					</thead>

					<tbody>
						
						<c:forEach items="${requestScope.list }" var="item">
						<tr class="gradeX">
							<td>${item.invoice}</td>
							<td>${item.medicinename }</td>
							<td>${item.iodate}</td>
							<td>${item.number}</td>
							<td>${item.batchnumber}</td>
							
							<td>${item.actuallypaid}</td>
							<td>${item.due}</td>
							<td>${item.unitname}</td>
							<td>${item.manufacturername}</td>
							<td>${item.dosageformsname}</td>
							
							<td>${item.suppliername}</td>
							<td>${item.purchaseprice}</td>
							<td>${item.validity}</td>
							<td>${item.amount}</td>
							<td>${item.comment}</td>
						</tr>
						</c:forEach>

					</tbody>
				</table>



				<div class='bg-model'
					style="position:absolute;top:0%;left:0%;display:none;background:rgba(0,0,0,0.3);width:100%;height:100%;position:fixed;z-index:9999">
					<div class='content'
						style="position: absolute;left: 25%;top: 8%;border-radius: 8px;width: 60%;height: 80%;background-color: #fff;">
						<form class="stdform" action="" method="post">

							<p>
								<label>验收日期</label> <span class="field"><input
									type="text" name="input1" class="mediuminput" /></span>

							</p>
							<p>
								<label>药品ID</label> <span class="field"><input
									type="text" name="input1" class="mediuminput" /></span>

							</p>
							<p>
								<label>商品名</label> <span class="field"><input type="text"
									name="input1" class="mediuminput" /></span>

							</p>
							<p>
								<label>通用名</label> <span class="field"><input type="text"
									name="input1" class="mediuminput" /></span>

							</p>
							<p>
								<label>规格</label> <span class="field"><input type="text"
									name="input1" class="mediuminput" /></span>

							</p>
							<p>
								<label>剂型</label> <span class="field"><input type="text"
									name="input1" class="mediuminput" /></span>

							</p>
							<p>
								<label>单位</label> <span class="field"><input type="text"
									name="input1" class="mediuminput" /></span>

							</p>
							<p>
								<label>剂型</label> <span class="field"><input type="text"
									name="input1" class="mediuminput" /></span>

							</p>


							<p class="stdformbutton">
								<button class="submit radius2">提交</button>
								<input type="reset" class="reset radius2 resetBtn" value="取消" />
							</p>
						</form>



					</div>
				</div>


			</div>
			<!--contentwrapper-->

		</div>
		<!-- centercontent -->


	</div>
	<!--bodywrapper-->
	<script type="text/javascript">
		if (document.location.protocol == 'file:') {
			alert("The examples might not work properly on the local file system due to security settings in your browser. Please use a real webserver.");
		}
	</script>



</body>
</html>
