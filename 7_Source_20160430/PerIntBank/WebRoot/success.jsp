<%@page language = "java" pageEncoding ="GB2312" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<link rel="stylesheet" type="text/css" href="css/styles2.css" />
<link rel="stylesheet" type="text/css" href="css/3D.css" />
<title>����</title>
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

  <li><a href="Zhuanzhang/zhuanzhang.jsp" target="_self">ת�˻��</a>
    <ul style="display: none;" id="subMusic" class="second-menu">
      <li><a href="Zhuanzhang/zhuanzhang.jsp" class="mobanwang" target="_self">���ת��</a>
      </li>
	  
      <li><a href="#" class="mobanwang" target="_self">����ת��</a>
      </li>
	  
      <li><a href="#" class="mobanwang" target="_self">���ת</a>
      </li>
    </ul>
  </li>
  <li><a href="#" target="_self">�˻���ѯ</a>
    <ul id="subNews" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">����ѯ</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">������ϸ</a>
	  </li>
    </ul>
  </li>
  <li><a href="#" class="mobanwang" target="_self">�������</a>
    <ul style="display: none;" id="subMgm" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">���ɵ��</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">����ˮ��</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">����ú����</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">�ֻ���ֵ</a>
      </li>
    </ul>
  </li>
  <li><a href="#" class="mobanwang" target="_self">Ͷ�����</a>
<ul id="subNews" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">��Ʊ</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">���</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">����</a>
	  </li>
	  <li><a href="#" class="mobanwang" target="_self">����</a>
      </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">���ÿ�</a>
<ul id="subNews" class="second-menu">
	  <li><a href="#" class="mobanwang" target="_self">�˻���Ϣ</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">�˵���ѯ</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">��������</a> 
    </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">���˴���</a>
<ul id="subNews" class="second-menu">
	  <li><a href="#" class="mobanwang" target="_self">�������</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">�����</a>
      </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">�տ����</a>
<ul id="subNews" class="second-menu">
      <li><a href="#" class="mobanwang" target="_self">�տ����б�</a> 
	  </li>
	  <li><a href="#" class="mobanwang" target="_self">����տ���</a>
      </li>
      <li><a href="#" class="mobanwang" target="_self">ɾ���տ���</a>
      </li>
</ul>
</li>
  <li><a href="#" class="mobanwang" target="_self">�û�����</a>
<ul id="subNews" class="second-menu">
	  <li><a href="Per_info_to" class="mobanwang" target="_self">������Ϣ</a>
      </li>
      <li><a href="updata.jsp" class="mobanwang" target="_self">������Ϣ�޸�</a>
      </li>
      <li><a href="xigaimm.jsp" class="mobanwang" target="_self">��¼�����޸�</a> 
	  <li><a href="#" class="mobanwang" target="_self">��ϵ�ͷ�</a>
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
    <li class="sliding-element"><a href="./Zhuanzhang/zhuanzhang.jsp">���ת��</a></li>
    <li class="sliding-element"><a href="#">����ѯ</a></li>
    <li class="sliding-element"><a href="#">�ֻ���ֵ</a></li>
    <li class="sliding-element"><a href="#">����տ���</a></li>
    <li class="sliding-element"><a href="#">Link 5</a></li>
	<li class="sliding-element"><a href="#">Link 5</a></li>
	<li class="sliding-element"><a href="#">Link 5</a></li>
    <li class="sliding-element"><a href="#">Link 5</a></li>
    <li class="sliding-element"><a href="#">Link 5</a></li>
  </ul>
					
					</div>
					<div class="rili">����</div>
				</div>
				<div class="mainright">
	<font color="black" >�����ɹ�</font><br>				
				</div>
				<div class="maintest">you</div>

			</div>
    </div>

</body>
</html>
