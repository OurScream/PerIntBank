<%@ page pageEncoding="UTF-8" %>
<html>
	<head><title>登录处理</title></head>
	
	<body>

		<%
			String getuserid = request.getParameter("userid"); 		//
			out.println("getuserid="+getuserid);
			
			
			if (getuserid != null) 
			{
				Cookie usercookie = new Cookie("PerIntBankUserId", getuserid); 
				usercookie.setMaxAge(900); 			 				//900s=15min
				response.addCookie(usercookie); 					//保存cookie到客户端
				session.setAttribute("PerIntBankUserId", getuserid); 			//将用户名存到session范围内用于权限检查。
				out.println("PerIntBankUserId = " + usercookie.getValue());
				response.sendRedirect("main.html");
			}
		 %>
	</body>
</html>