<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link rel="stylesheet" type="text/css" href="styles.css" />
<link rel="stylesheet" type="text/css" href="styles2.css" />
<link rel="stylesheet" type="text/css" href="3D.css" />
<link rel="stylesheet" type="text/css" href="zzinput.css" media="all" />
<title>yayaayayaya</title>
<script type="text/javascript" src="jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="sliding_effect.js"></script>
<script type="text/javascript" src="3D.js"></script>
<script type=text/javascript>
$(function(){
	$('#mobanwang_com li').hover(function(){
		$(this).children('ul').stop(true,true).show('slow');
	},function(){
		$(this).children('ul').stop(true,true).hide('slow');
	});
	
	$('#mobanwang_com li').hover(function(){
		$(this).children('div').stop(true,true).show('slow');
	},function(){
		$(this).children('div').stop(true,true).hide('slow');
	});
});
</script>

</head>

<body>

    <div id="Container">
            <div id="header">
<ul id="mobanwang_com" class="first-menu">
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>

  <li><a href="#" target="_self">转账汇款</a>
    <ul style="display: none;" id="subMusic" class="second-menu">
      <li><a href="Zhuanzhang/zhuanzhang.jsp" class="mobanwang" target="_self">快捷转账</a>
      </li>
	  
      <li><a href="#" class="mobanwang" target="_self">跨行转账</a>
      </li>
	  
      <li><a href="#" class="mobanwang" target="_self">定活互转</a>
      </li>
    </ul>
  </li>
  <li><a href="#" target="_self">账户查询</a>
    <ul id="subNews" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">余额查询</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">交易明细</a>
	  </li>
    </ul>
  </li>
  <li><a href="#" class="mobanwang" target="_self">快捷生活</a>
    <ul style="display: none;" id="subMgm" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">缴纳电费</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">缴纳水费</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">缴纳煤气费</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">手机充值</a>
      </li>
    </ul>
  </li>
  <li><a href="#" class="mobanwang" target="_self">投资理财</a>
<ul id="subNews" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">股票</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">外汇</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">保险</a>
	  </li>
	  <li><a href="#" class="mobanwang" target="_self">基金</a>
      </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">信用卡</a>
<ul id="subNews" class="second-menu">
	  <li><a href="#" class="mobanwang" target="_self">账户信息</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">账单查询</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">自助还款</a> 
    </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">个人贷款</a>
<ul id="subNews" class="second-menu">
	  <li><a href="#" class="mobanwang" target="_self">申请贷款</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">贷款还款</a>
      </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">收款方管理</a>
<ul id="subNews" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">收款人列表</a> 
	  </li>
	  <li><a href="#" class="mobanwang" target="_self">添加收款人</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">删除收款人</a>
      </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">用户服务</a>
<ul id="subNews" class="second-menu">
	  <li><a href="#" class="mobanwang" target="_self">个人信息</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">个人信息修改</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">登录密码修改</a> 
	  <li><a href="#" class="mobanwang" target="_self">联系客服</a>
      </li>
    </li>
</ul>
</li>
  
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>
  <li><a href="#" class="mobanwang" target="_self"> </a></li>

</ul>			
			</div>
            <div id="main">
				<div class="mainleft">
					<div class="kuaijiemenu">
	<ul id="sliding-navigation">
    <li class="sliding-element"><a href="Zhuanzhang/zhuanzhang.jsp">快捷转账</a></li>
    <li class="sliding-element"><a href="#">余额查询</a></li>
    <li class="sliding-element"><a href="#">手机充值</a></li>
    <li class="sliding-element"><a href="#">添加收款人</a></li>
    <li class="sliding-element"><a href="#">Link 5</a></li>
	<li class="sliding-element"><a href="#">Link 5</a></li>
	<li class="sliding-element"><a href="#">Link 5</a></li>
    <li class="sliding-element"><a href="#">Link 5</a></li>
    <li class="sliding-element"><a href="#">Link 5</a></li>
  </ul>
					
					</div>
					<div class="rili">日历</div>
				</div>
				<div class="mainright">
<div class="contact-form">
	 <div class="signin">

		<p><font color=#0 size="5px"><%=request.getAttribute("outputMessage") %></font>

	 </div>
</div>	
		
					
				</div>
				<div class="maintest">you</div>

			</div>
    </div>

</body>
</html>
