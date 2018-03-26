<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>个人信息</title>
    
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
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.validate.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.tagsinput.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/charCount.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/ui.spinner.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/chosen.jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/general.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/forms.js"></script>
	<style>
		th{font-size: 10px;}
	</style>
  </head>
  
  <body class="withvernav">
<div class="bodywrapper">
    <%@ include file="common/Top.jsp" %>
        
        <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">个人信息</h1>
            <span class="pagedesc">编辑资料</span>
            
            <ul class="hornav">
                <li class="current"><a href="#basicform">修改</a></li>
                
            </ul>
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
        	
        	<div id="basicform" class="subcontent">
                                
                    <div class="contenttitle2">
                        <h3>Form</h3>
                    </div><!--contenttitle-->

                    <form class="stdform" action="" method="post">
                    	
                        <p>
                        	<label>姓名</label>
                            <span class="field"><input type="text" name="input1" class="smallinput" /></span>
                            
                        </p>
                        
                        <p>
                        	<label>性别</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        
                        <p>
                        	<label>出生日期</label>
                            <span class="field"><input type="text" name="input3" class="longinput" /></span>
                        </p>
                        
                        <p>
                        	<label>详细信息</label>
                            <span class="field"><textarea cols="80" rows="5" class="longinput"></textarea></span> 
                        </p>
               
                        
                        <p>
                        	<label>权限管理</label>
                            <span class="field">
                            <select name="select" class="uniformselect">
                            	<option value="">销售员</option>
                              
                            </select>
                            
                            </span>
                        </p>
                        
                       
                        
                       
                        
                        
                       
                        
                       
               
                        
                        <p>
                        	<label>附件上传</label>
                            <span class="field">
                            	<input type="file" name="filename" />
                            </span>
                        </p>
                        
                  
                        
                 
                        <br clear="all" /><br />
                        
                        <p class="stdformbutton">
                        	<button class="submit radius2">完成修改</button>
                            <input type="reset" class="reset radius2" value="取消" />
                        </p>
                        
                        
                    </form>
                    
                    <br />
                    
					
            </div><!--subcontent-->
        
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
