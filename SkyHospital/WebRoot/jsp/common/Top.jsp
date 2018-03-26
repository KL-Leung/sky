<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<style>
		.margtime{margin-left: 1%;}
    	.shortcuts li{width: 20%;height: 15%;}
		.shortcuts li a{width: 100%;height: 100%;}
	</style>
  </head>
  
  <div class="topheader">
        <div class="left">
            <h1 class="logo">DYS.<span>Admin</span></h1>
            <span class="slogan">后台管理系统</span>
            
            <div class="search">
            	<form action="" method="post">
                	<input type="text" name="keyword" id="keyword" value="请输入" />
                    <button class="submitbutton"></button>
                </form>
            </div><!--search-->
            
            <br clear="all" />
            
        </div><!--left-->
        
        <div class="right">
        	<!--<div class="notification">
                <a class="count" href="ajax/notifications.html"><span>9</span></a>
        	</div>-->
            <div class="userinfo">
            	<img src="images/thumbs/avatar.png" alt="" />
                <span>管理员</span>
            </div><!--userinfo-->
            
            <div class="userinfodrop">
            	<div class="avatar">
                	<a href=""><img src="images/thumbs/avatarbig.png" alt="" /></a>
                    <div class="changetheme">
                    	切换主题: <br />
                    	<a class="default"></a>
                        <a class="blueline"></a>
                        <a class="greenline"></a>
                        <a class="contrast"></a>
                        <a class="custombg"></a>
                    </div>
                </div><!--avatar-->
                <div class="userdata">
                	<h4>Juan</h4>
                    <span class="email">youremail@yourdomain.com</span>
                    <ul>
                    	<li><a href="${pageContext.request.contextPath }/jsp/forms.jsp">编辑资料</a></li>
                        <li><a href="accountsettings.html">账号设置</a></li>
                        <li><a href="help.html">帮助</a></li>
                        <li><a href="index.html">退出</a></li>
                    </ul>
                </div><!--userdata-->
            </div><!--userinfodrop-->
        </div><!--right-->
    </div><!--topheader-->
    
    
    <div class="header">
    	<ul class="headermenu">
        	<li class="current"><a href="${pageContext.request.contextPath }/dashboard.jsp"><span class="icon icon-flatscreen"></span>首页</a></li>
            <li><a href="${pageContext.request.contextPath }/jsp/TStockNum.jsp"><span class="icon icon-pencil"></span>库存管理</a></li>
            <li><a href="messages.html"><span class="icon icon-message"></span>查看消息</a></li>
            <li><a href="reports.html"><span class="icon icon-chart"></span>统计报表</a></li>
        </ul>
        
       <div class="headerwidget">
        	<div class="earnings">
            	<div class="one_half">
                	<h4>信&nbsp;息&nbsp;提&nbsp;醒</h4>
                    <h2>99+</h2>
                </div><!--one_half-->
                <div class="one_half last alignright">
                	<h4>药&nbsp;品&nbsp;库&nbsp;存</h4>
                    <h2>53%</h2>
                </div><!--one_half last-->
            </div><!--earnings-->
        </div><!--headerwidget-->
        
    </div><!--header-->
    <div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="#formsub" class="editor">用户管理</a>
            	<span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="${pageContext.request.contextPath }/jsp/forms.jsp">个人信息</a></li>
                    <li><a href="${pageContext.request.contextPath }/jsp/wizard.jsp">修改密码</a></li>
                    <li><a href="${pageContext.request.contextPath }/jsp/Gelements.jsp">操作员权限管理</a></li>
                </ul>
            </li>
            <!--<li><a href="filemanager.html" class="gallery">文件管理</a></li>-->
            <li><a href="#formsubCheck" class="elements">统计查询</a>
            	<span class="arrow"></span>
            	<ul id="formsubCheck">
            		<li><a href="${pageContext.request.contextPath }/medicine/getMedicineList.action">查询库存与养护</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/CheckKeepAndWeiHu.jsp">查询入库记录</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/CheckSalesRecord.jsp">查询销售记录</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/CheckImportAndExport.jsp">查询进销存记录</a></li>
            	</ul>
            </li>
            <li><a href="#formsubCheckwork" class="widgets">销售业务</a>
            	<span class="arrow"></span>
            	<ul id="formsubCheckwork">
            		<li><a href="${pageContext.request.contextPath }/jsp/SaleDrugsale.jsp">药品销售</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/SaleTurnover.jsp">销售营业额</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/SaleShift.jsp">收银员交班</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/SaleClearancePlan.jsp">处方药销售登记</a></li>
            	</ul>
            </li>
            <li><a href="#formsubbuywork" class="calendar">采购业务</a>
            	<span class="arrow"></span>
            	<ul id="formsubbuywork">
            		<li><a href="${pageContext.request.contextPath }/jsp/BuyDrugsWarehousing.jsp">药品入库</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/BuyDrugsSettlements.jsp">药品入库应付结算</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/BuyDrugsTheLibrary.jsp">药品出库</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/BuyDrugsTreasurySettlement.jsp">药品出库应收结算</a></li>
            	</ul>
            </li>
          	<li><a href="#formsubkuwork" class="support">库存管理</a>
            	<span class="arrow"></span>
            	<ul id="formsubkuwork">
            		<li><a href="${pageContext.request.contextPath }/jsp/TStockNum.jsp">库存盘点</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/TStockPromotion.jsp">调价促销</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/TStockTermOfValidity.jsp">有效期报警</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/TStockDrugTreatment.jsp">药品处理</a></li>
            	</ul>
            </li>
          	<li><a href="#formsubbuytime" class="typo">基本信息</a>
            	<span class="arrow"></span>
            	<ul id="formsubbuytime">
            		<li><a href="${pageContext.request.contextPath }/jsp/InformationDictionaries.jsp">药品字典</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/InformationMember.jsp">会员管理</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/InformationSupplyUnit.jsp">供货单位管理</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/InformationCandidateDrugs.jsp">采购候选信息</a></li>
            	</ul>
            </li>
            <li><a href="#formsubGSP" class="calendar">GSP报表</a>
            	<span class="arrow"></span>
            	<ul id="formsubGSP">
            		<li><a href="${pageContext.request.contextPath }/jsp/GSPBuyDrugs.jsp">药品购进记录</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/GSPBuyDrugAcceptance.jsp">药品验收记录</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/GSPBuyTraditionalChineseMedicine.jsp">药品养护报表</a></li>
            		<li><a href="${pageContext.request.contextPath }/jsp/GSPBuyWesternMedicine.jsp">药品处理报表</a></li>
            	</ul>
            </li>
        
        
          
			<li><a href="#" class="buttons">客户支持</a></li>
            <li><a href="#error" class="error">其他页面</a>
            	<span class="arrow"></span>
            	
            </li>
            <li><a href="#addons" class="addons">设置</a>
            	<span class="arrow"></span>
            	
            </li>
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->
</html>
