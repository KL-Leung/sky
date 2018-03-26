<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>药品入库</title>
    
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
        
   
        
        
        <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">药品入库</h1>
            <br />
            
            <ul class="hornav">
                <li class="current"><a href="#basicform">入库表单</a></li>
                <li><a href="#validation">入库列表</a></li>
            </ul>
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
        	
        	<div id="basicform" class="subcontent">
                                
                  
                    <form class="stdform" action="" method="post">
                    	
                        <p>
                        	<label>票据编号</label>
                            <span class="field"><input type="text" name="input1" class="mediuminput" /></span>
                          
                        </p>
                        
                        <p>
                        	<label>药品信息</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        
                        <p>
                        	<label>合格数量</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>销售价</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>批号</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        
                        <p>
                        	<label>货位</label>
                            <span class="field">
                            <select name="select" class="uniformselect">
                            	<option value="">G1</option>
                                <option value="">G2</option>
                                <option value="">G3</option>
                                <option value="">G4</option>
                                <option value="">K1</option>
                            </select>
                            
                            </span>
                        </p>
                        <p>
                        	<label>合格证</label>
                            <span class="field">
                            <select name="select" class="uniformselect">
                            	<option value="">有</option>
                                <option value="">无</option>

                            </select>
                            
                            </span>
                        </p>
                        <p>
                        	<label>入库单价</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>会员价</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>有效期</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>验收人</label>
                            <span class="field">
                            <select name="select" class="uniformselect">
                            	<option value="">陈三</option>
                                <option value="">王四</option>

                            </select>
                            
                            </span>
                        </p>
                        <p>
                        	<label>外观质量</label>
                            <span class="field">
                            <select name="select" class="uniformselect">
                            	<option value="">合格</option>
                                <option value="">不合格</option>

                            </select>
                            
                            </span>
                        </p>
                        <p>
                        	<label>入库金额</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>促销提成</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>生产日期</label>
                            <span class="field"><input type="text" name="input2" class="mediuminput" /></span>
                        </p>
                        <p>
                        	<label>采购员</label>
                            <span class="field">
                            <select name="select" class="uniformselect">
                            	<option value="">陈三</option>
                                <option value="">王四</option>

                            </select>
                            
                            </span>
                        </p>
                         <p>
                        	<label>验收结论</label>
                            <span class="field">
                            <select name="select" class="uniformselect">
                            	<option value="">合格</option>
                                <option value="">不合格</option>

                            </select>
                            
                            </span>
                        </p>
                        
                        <br clear="all" /><br />
                        
                        <p class="stdformbutton">
                        	<button class="submit radius2">提交</button>
                            <input type="reset" class="reset radius2" value="取消" />
                        </p>
                        
                        
                    </form>
                    
                    <br />
                    
					
					
                    <br />

            </div><!--subcontent-->
            
            <div id="validation" class="subcontent" style="display: none">
            	
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
                          	<th class="head1">序号</th>
                            <th class="head1">药品ID</th>
                            <th class="head1">商品名</th>
                            
                            <th class="head1">通用名</th>
                            <th class="head1">规格</th>
                            <th class="head1">厂家</th>
                            <th class="head1">单位</th>
                            <th class="head1">数量</th>
                            
                            <th class="head1">采购价</th>
                            <th class="head1">销售价</th>
                            <th class="head1">采购金额</th>
                         	<th class="head1">批号</th>
                            
                            <th class="head1">有效期</th>
                            <th class="head1">标记</th>
                            <th class="head1">货位</th>
                            <th class="head1">备注</th>

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
                            <td class="center">4</td>
                            <td>Trident</td>
                            <td>Inter</td>
                            <td>Trident</td>
                            <td>Inter</td>
                          

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
