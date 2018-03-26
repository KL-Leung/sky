<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>注册页面</title>
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
<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/index.js"></script>
  </head>
  
  <body class="loginpage">
	<div class="loginbox">
    	<div class="loginboxinner">
        	
            <div class="logo">
            	<h1 class="logo">Dys.<span>Admin</span></h1>
				<span class="slogan">后台管理系统</span>
            </div><!--logo-->
            
            <br clear="all" /><br />
            
            <div class="nousername">
				<div class="loginmsg">密码不正确.</div>
            </div><!--nousername-->
            
            <div class="nopassword">
				<div class="loginmsg">密码不正确.</div>
                <div class="loginf">
                    <div class="thumb"><img alt="" src="images/thumbs/avatar1.png" /></div>
                    <div class="userlogged">
                        <h4></h4>
                        <a href="index.html">Not <span></span>?</a> 
                    </div>
                </div><!--loginf-->
            </div><!--nopassword-->
            
            
            
            <form id="login" action="${pageContext.request.contextPath }/index.jsp" method="post">
            	
                <div class="username">
                	<div class="usernameinner">
                    	<input type="text" name="username" placeholder="请输入账号"/>
                    </div>
                </div>
                
                <div class="password">
                	<div class="passwordinner">
                    	<input type="password" name="password" placeholder="请输入密码"/>
                    </div>
                </div>
            
                <div class="password">
                	<div class="usernameinner">
                    	<input type="text" name="username" placeholder="请输入注册码"/>
                    </div>
                </div>
                
                <button>注册</button>
                
                
                
            </form>
            
        </div><!--loginboxinner-->
    </div><!--loginbox-->


</body>
</html>
