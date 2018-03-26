<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>收银员交班</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.default.css" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-1.7.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.cookie.js"></script>

	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.uniform.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/general.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/tables.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.smartWizard-2.0.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.colorbox-min.js"></script>
	<style>
		th{font-size: 10px;}
	</style>
  </head>
  
  <body class="withvernav">
<div class="bodywrapper">
    <%@ include file="common/Top.jsp" %>
        
   
        
        
        <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">收银员交班</h1>

            <br />
            <ul class="hornav">
                <li class="current"><a href="#default">Default</a></li>

            </ul>
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
        
        	<div id="default" class="subcontent">
                    <!-- START OF DEFAULT WIZARD -->
                    <form class="stdform" method="post" action="">
                    <div id="wizard" class="wizard">
                 
                        	
                        <div id="wiz1step1" class="formwiz">
                       
                        	
                                <p>
                                    <label>交班人姓名</label>
                                    <span class="field"><input type="text" name="firstname" id="firstname" class="longinput" /></span>
                                </p>
                                
                                <p>
                                    <label>钱箱金额</label>
                                    <span class="field"><input type="text" name="lastname" id="lastname" class="longinput" /></span>
                                </p>
                                                                
                                <p class="stdformbutton">
                        			<button class="submit radius2">完成</button>
                            		<input type="reset" class="reset radius2" value="取消" />
                        		</p>
                                
                        	
                            
                        </div><!--#wiz1step1-->
                        
                     
                        
                      
                </div>    
            </div><!-- #default -->
    
    
</div><!--bodywrapper-->
</div>
    
    
</div><!--bodywrapper-->
<script type="text/javascript">

if(document.location.protocol == 'file:') {
	alert("The examples might not work properly on the local file system due to security settings in your browser. Please use a real webserver.");
}






</script>



</body>
</html>
