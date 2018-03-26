<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>修改密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.smartWizard-2.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.colorbox-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/general.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function(){
		// Smart Wizard 	
  		jQuery('#wizard').smartWizard({onFinish: onFinishCallback});
      	jQuery('#wizard2').smartWizard({onFinish: onFinishCallback});
		jQuery('#wizard3').smartWizard({onFinish: onFinishCallback});
		jQuery('#wizard4').smartWizard({onFinish: onFinishCallback});
		
		function onFinishCallback(){ //确认修改
			alert('Finish Clicked');
		} 
		
		jQuery(".inline").colorbox({inline:true, width: '60%', height: '500px'});
		
		jQuery('select, input:checkbox').uniform();
	});
</script>
	<style>
		th{font-size: 10px;}
	</style>
  </head>
  
  <body class="withvernav">
<div class="bodywrapper">
    <%@ include file="common/Top.jsp" %>
        
   
        
        
        <div class="centercontent">
    
       
        
        <div id="contentwrapper" class="contentwrapper">
        
        	<div id="default" class="subcontent">
                    <!-- START OF DEFAULT WIZARD -->
                    <form class="stdform" method="post" action="">
                    <div id="wizard" class="wizard">
                    	<br />
                        <ul class="hormenu">
                            <li>
                            	<a href="#wiz1step1">
                                	<span class="h2">第一步</span>
                                    <span class="dot"><span></span></span>
                                    <span class="label">输入旧密码</span>
                                </a>
                            </li>
                            <li>
                            	<a href="#wiz1step2">
                                	<span class="h2">第二步</span>
                                    <span class="dot"><span></span></span>
                                    <span class="label">输入新密码</span>
                                </a>
                            </li>
                            <li>
                            	<a href="#wiz1step3">
                                	<span class="h2">第三步</span>
                                    <span class="dot"><span></span></span>
                                    <span class="label">确认修改</span>
                                </a>
                            </li>
                        </ul>
                        
                        <br clear="all" /><br /><br />
                        	
                        <div id="wiz1step1" class="formwiz">
                        	<h4>第一步: 输入旧密码</h4>
                        	
                                <p>
                                    <label>旧密码</label>
                                    <span class="field"><input type="text" name="firstname" id="password" class="longinput"  placeholder=""/></span>
                                </p>
                                
                                
                                
                        	
                            
                        </div><!--#wiz1step1-->
                        
                        <div id="wiz1step2" class="formwiz">
                        	<h4>第二部: 输入新密码</h4>
                            
                                <p>
                                    <label>新密码</label>
                                    <span class="field"><input type="text" name="lastname" class="longinput" /></span>
                                </p>
                                <p>
                                    <label>再次确认</label>
                                    <span class="field"><input type="text" name="lastname" class="longinput" /></span>
                                </p>
                                                                                               
                        </div><!--#wiz1step2-->
                        
                        <div id="wiz1step3">
                        	<h4>第三步: 确认修改</h4>
                            
                        </div><!--#wiz1step3-->
                        
                    </div><!--#wizard-->
                    </form>
                    <!-- END OF DEFAULT WIZARD -->
                    
                    <br /><br />
                    
            </div><!-- #default -->
            
            
          
          
            
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->
<script type="text/javascript">

if(document.location.protocol == 'file:') {
	alert("The examples might not work properly on the local file system due to security settings in your browser. Please use a real webserver.");
}






</script>



</body>
</html>
