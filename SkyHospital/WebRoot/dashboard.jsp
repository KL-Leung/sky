<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>控制台页面</title>
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
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.flot.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.flot.resize.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.slimscroll.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/general.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/dashboard.js"></script>

  </head>
  
  <body class="withvernav">
<div class="bodywrapper">
     <%@ include file="jsp/common/Top.jsp" %> 
 
        
    <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">快捷选项</h1>
            <span class="pagedesc"></span>
            
            <ul class="hornav">
                <li class="current"><a href="#updates">最新更新</a></li>
               
            </ul>
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
        
        	<div id="updates" class="subcontent">
                    <div class="notibar announcement">
                        <a class="close"></a>
                        <h3>小贴士</h3>
                        <p>蜂蜜可促进酒精分解排泄，保护肝脏。酒后喝些蜂蜜水可解除因大量饮酒导致的头痛。做下酒菜时也可用蜂蜜代替糖类，达到解酒作用。</p>
                    </div><!-- notification announcement -->
                    
                    <div  >
                    
                    	<ul class="shortcuts">
                        	
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/forms.jsp" class="users"><span>用户</span></a></li>
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/TStockNum.jsp" class="gallery"><span>库存</span></a></li>
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/CheckStorage.jsp" class="events"><span>入库</span></a></li>
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/SaleDrugsale.jsp" class="analytics"><span>销售</span></a></li>
                            
                            
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/BuyDrugsWarehousing.jsp" class="settings"><span>采购</span></a></li>
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/InformationDictionaries.jsp" class="gallery"><span>字典</span></a></li>
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/GSPBuyDrugs.jsp" class="events"><span>报表</span></a></li>
                            <li class="margtime"><a href="${pageContext.request.contextPath }/jsp/TStockPromotion.jsp" class="analytics"><span>促销</span></a></li>
                        </ul>
                        
                        <br clear="all" />
                    
                       <!-- <div class="contenttitle2 nomargintop">
                            <h3>Visit Overview</h3>
                        </div><!--contenttitle-->
                        
                        <!--<div class="overviewhead">
                        	<div class="overviewselect">
                                <select id="overviewselect" name="select">
                                    <option value="">Last 1 hour ago</option>
                                    <option value="">Last 5 hours ago</option>
                                    <option value="">Today</option>
                                    <option value="">Yesterday</option>
                                    <option value="">This Week</option>
                                    <option value="">Last Week</option>
                                    <option value="">This Month</option>
                                    <option value="">Last Month</option>
                                </select>
                            </div><!--floatright-->
                        	
                        
                        <!--<br clear="all" />
                        
                        <table cellpadding="0" cellspacing="0" border="0" class="stdtable overviewtable">
                            <colgroup>
                                <col class="con0" width="20%" />
                                <col class="con1" width="20%" />
                                <col class="con0" width="20%" />
                                <col class="con1" width="20%" />
                                <col class="con0" width="20%" />
                            </colgroup>
                            <thead>
                                <tr>
                                    <th class="head0">Metric</th>
                                    <th class="head1">Rates</th>
                                    <th class="head0">Impressions</th>
                                    <th class="head1">Unique Visits</th>
                                    <th class="head0">Average Time (min)</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                    	<div class="progress progress150">
                            				<div class="bar"><div style="width: 60%;" class="value bluebar"></div></div>
                        				</div>
                        			</td>
                                    <td>67.3%</td>
                                    <td>856, 220</td>
                                    <td class="center">32, 012</td>
                                    <td class="center">20.5</td>
                                </tr>
                            </tbody>
                        </table>
                        
                        <br clear="all" />
                        
                        <div id="chartplace" style="height:300px;"></div>
                        
                        <br clear="all" />
                        
                        <table cellpadding="0" cellspacing="0" border="0" class="stdtable stdtablecb overviewtable2">
                            <colgroup>
                                <col class="con0" style="width: 4%" />
                                <col class="con1" />
                                <col class="con0" />
                                <col class="con1" />
                                <col class="con0" />
                                <col class="con1" />
                            </colgroup>
                            <thead>
                                <tr>
                                    <th class="head0"><input type="checkbox" class="checkall" /></th>
                                    <th class="head1">Rendering engine</th>
                                    <th class="head0">Browser</th>
                                    <th class="head1">Platform(s)</th>
                                    <th class="head0">Engine version</th>
                                    <th class="head1">CSS grade</th>
                                </tr>
                            </thead>-->
                            
                           
                        </table>
                        
                        <br />
                       
                        
                       <!-- <div class="widgetbox">
                        	<div class="title"><h3>Latest Articles</h3></div>
                            <div class="widgetcontent">
                                <div id="scroll1" class="mousescroll">
                                        <ul class="entrylist">
                                              <li>
                                                <div class="entry_wrap">
                                                    <div class="entry_img"><img src="images/thumbs/image1.png" alt="" /></div>
                                                    <div class="entry_content">
                                                        <h4><a href="">Why Won't My Cat Eat?</a></h4>
                                                        <small>Submitted by: <a href=""><strong>Hiccup</strong></a> - June 10, 2012</small>
                                                        <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non...</p>
                                                        <p><button class="stdbtn btn_lime">Approve</button> <button class="stdbtn">Decline</button></p>
                                                    </div>
                                                </div>
                                              </li>
                                              <li class="even">
                                                <div class="entry_wrap">
                                                <div class="entry_img"><img src="images/thumbs/image2.png" alt="" /></div>
                                                <div class="entry_content">
                                                    <h4><a href="">We Are About Color</a></h4>
                                                    <small>Submitted by: <a href=""><strong>Hiccup</strong></a> - June 10, 2012</small>
                                                    <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non...</p>
                                                    <p><button class="stdbtn btn_lime">Approve</button> <button class="stdbtn">Decline</button></p>
                                                </div>
                                                </div>
                                              </li>
                                              <li>
                                                <div class="entry_wrap">
                                                <div class="entry_img"><img src="images/thumbs/image3.png" alt="" /></div>
                                                <div class="entry_content">
                                                    <h4><a href="">Ancient Technology</a></h4>
                                                    <small>Submitted by: <a href=""><strong>Hiccup</strong></a> - June 10, 2012</small>
                                                    <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non...</p>
                                                    <p><button class="stdbtn btn_lime">Approve</button> <button class="stdbtn">Decline</button></p>
                                                </div>
                                                </div>
                                              </li>
                                              <li class="even">
                                                <div class="entry_wrap">
                                                <div class="entry_img"><img src="images/thumbs/image4.png" alt="" /></div>
                                                <div class="entry_content">
                                                    <h4><a href="">Bird's Nest Soup</a></h4>
                                                    <small>Submitted by: <a href=""><strong>Hiccup</strong></a> - June 10, 2012</small>
                                                    <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non...</p>
                                                    <p><button class="stdbtn btn_lime">Approve</button> <button class="stdbtn">Decline</button></p>
                                                </div>
                                                </div>
                                              </li>
                                            </ul>                        
                                </div><!--#scroll1-->
                            <!--</div>--><!--widgetcontent-->
                        <!--</div>--><!-- widgetbox -->                        
                        
                        
                    </div><!--two_third dashboard_left -->
                    
                   
            
            <div id="activities" class="subcontent" style="display: none;">
            	&nbsp;
            </div><!-- #activities -->
        
        </div><!--contentwrapper-->
        
        <br clear="all" />
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
