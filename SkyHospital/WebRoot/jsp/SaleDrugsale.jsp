<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>药品销售</title>
    
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
	<style>
		th{font-size: 10px;}
	</style>
  </head>
  
  <body class="withvernav">
<div class="bodywrapper">
    <%@ include file="common/Top.jsp" %>
        
   
        
        
        <div class="centercontent tables">
    
       
        
        <div id="contentwrapper" class="contentwrapper">
			
             
             
             
             <div class="contenttitle2">
                	<h3>药品销售列表</h3>
                </div><!--contenttitle-->
   
             
          
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable2">
                    <colgroup>
                        <col class="con0" style="width: 4%" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    
                    <thead>
                        <tr>
                          <th class="head1 nosort"><input type="checkbox" /></th>
                          	<th class="head1">药品ID</th>
                            <th class="head1">商品名</th>
                            <th class="head1">通用名</th>
                            <th class="head1">规格</th>
                            <th class="head1">生产企业</th>
                            <th class="head1">批号</th>
                            <th class="head1">单位</th>
                            <th class="head1">实际售价</th>
                            <th class="head1">数量</th>
                            <th class="head1">金额</th>
                            <th class="head1">零整</th>
                            <th>修改</th>
                        </tr>
                    </thead>
               
                    <tbody>
                       
                        <tr class="gradeX">
                          <td align="center"><span class="center">
                            <input type="checkbox" />
                          </span></td>
                            <td>Trident</td>
                            <td>Inter</td>
                            <td>Win 95+</td>
                            <td class="center">4</td>
                            <td>Trident</td>
                            <td>Inter</td>
                            <td>Win 95+</td>
                            <td class="center">4</td>
                            <td>Trident</td>
                            <td>Inter</td>
                            <td>Trident</td>
                            <td class="center"><button  class="BigBtn">编辑</button>  <button class="delete">删除</button></td>
                        </tr>
                        
                    </tbody>
                </table>
                
             
                
				<div class = 'bg-model' style="position:absolute;top:0%;left:0%;display:none;background:rgba(0,0,0,0.3);width:100%;height:100%;position:fixed;z-index:9999">
　　				<div class = 'content' style="position: absolute;left: 25%;top: 8%;border-radius: 8px;width: 60%;height: 80%;background-color: #fff;">
					<form class="stdform" action="" method="post">
                    	
                        <p>
                        	<label>验收日期</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        <p>
                        	<label>药品ID</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        <p>
                        	<label>商品名</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        <p>
                        	<label>通用名</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        <p>
                        	<label>规格</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        <p>
                        	<label>剂型</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        <p>
                        	<label>单位</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        <p>
                        	<label>剂型</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                       
                      
                        <p class="stdformbutton">
                        	<button class="submit radius2">提交</button>
                            <input type="reset" class="reset radius2 resetBtn" value="取消" />
                        </p>
					</form>
					

                    
　　				</div>
				</div>
             
	
          
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
