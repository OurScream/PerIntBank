<%@ page language="java" import="java.util.*" pageEncoding="utf-8" import ="perinfo.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<link rel="stylesheet" type="text/css" href="css/styles2.css" />
<link rel="stylesheet" type="text/css" href="css/3D.css" />
<title>yayaayayaya</title>
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/sliding_effect.js"></script>
<script type="text/javascript" src="js/3D.js"></script>
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
<% perinfoDAO fodao=new perinfoDAO();
   person er =new person();
   person ers =new person();
   Cookie cookies[]=request.getCookies(); 
		Cookie sCookie=null; 
		for(int i=0;i<cookies.length-1;i++){    //用一个循环语句遍历刚才建立的Cookie对象数组
	
			sCookie=cookies[i];
		}
		er.setZjid(sCookie.getValue());
  ers= fodao.find(er);

 %>


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

  <li><a href="Zhuanzhang/zhuanzhang.jsp" target="_self">转账汇款</a>
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
	  <li><a href="Per_info_to" class="mobanwang" target="_self">个人信息</a>
      </li>
      <li><a href="updata.jsp" class="mobanwang" target="_self">个人信息修改</a>
      </li>
      <li><a href="xigaimm.jsp" class="mobanwang" target="_self">登录密码修改</a> 
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
    <li class="sliding-element"><a href="./Zhuanzhang/zhuanzhang.jsp">快捷转账</a></li>
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
         <form action="UPdata" method="post">
			   <table border="0" width="238" height="252" align="center">
				<br/>
				<br/>		  
			   <tr><td><font color="black">客户姓名</font></td><td><td><input name="khxm" type="text" value =<%= ers.getKhxm() %>></td></tr>
			   <tr><td><font color="black">出生日期</font></td><td><td><input name="csrq" type="text" value =<%= ers.getCsrq() %>></td></tr>
			   <tr><td><font color="black">婚姻状况</font></td><td><td><input name="hyzk" type="text" value =<%= ers.getHyzk() %>></td></tr>
			   <tr><td><font color="black">所属民族</font></td><td><td><input name="ssmz" type="text" value =<%= ers.getSsmz() %>></td></tr>
			   <tr><td><font color="black">证件类型</font></td><td><td><input name="zjlx" type="text" value =<%= ers.getZjlx() %>></td></tr>
			   <tr><td><font color="black">证件有效起始日期</font></td><td><td><input name="zjqsrq" type="text" value =<%= ers.getZjqsrq() %>></td></tr>
			   <tr><td><font color="black">证件有效截止日期</font></td><td><td><input name="zjjzrq" type="text" value =<%= ers.getZjjzrq() %>></td></tr>
			   <tr><td><font color="black">客户性别</font></td><td><td><input name="khxb" type="text" value =<%= ers.getKhxb() %>></td></tr>
			   <tr><td><font color="black">客户国籍</font></td><td><td><input name="khgj" type="text" value =<%= ers.getKhgj() %>></td></tr>
			   <tr><td><font color="black">移动电话</font></td><td><td><input name="yddh" type="text" value =<%= ers.getYddh() %>></td></tr>
			   <tr><td><font color="black">固定电话</font></td><td><td><input name="gddh" type="text" value =<%= ers.getGddh() %>></td></tr>
			   <tr><td><font color="black">家庭地址</font></td><td><td><input name="jtdz" type="text" value =<%= ers.getJtdz() %>></td></tr>
			   <tr><td><font color="black">家庭邮编</font></td><td><td><input name="jtyb" type="text" value =<%= ers.getJtyb() %>></td></tr>
			   <tr align="center">
			   <td colspan="2">
			     <input type="submit" value="提     交" align="center">
                 </td>
                 </tr>
                 </table>
                 </form>				
				</div>
				<div class="maintest">you</div>

			</div>
    </div>

</body>
</html>
