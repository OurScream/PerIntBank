<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>  
  
 <body>
         <form action="UpD" method="post">
         <table>
         <tr>
         <th>ID<input type="text" name="zjid"></th>
         <tr>
         <th>旧密码<input type="text" name="jmm">
         </th>
         </tr>
         <tr>
         <th>新密码<input type="text" name="khdlmm">
         </th>
         </tr>
         <tr>
         <th>密码确认<input type="text" name="khdlmm1">
         </th>
         </tr>
         <tr>
         <td><input type="submit" value="OK ">
         </td>
         </tr>
         </table>
         <a href="javascript:history.back(-2)">返回上一页</a>
         </form>
  </body>
</html>
