<%@page contentType="text/html; charset=UTF-8" import="perinfo.*" %>
<html>
	<head><title>xxxxxxxxxxxxxxxxx</title></head>
	<body>
   <table>
  <%
             
		person p3=(person)request.getAttribute("son");		
		if(p3==null){
		System.out.println("NNNNNNNNNNNNooooooooooooooooooooo");}
	
	 %>
   
		 	<tr>
		 	<th>1</th>
		 	<th>2</th>
		 	<th>3</th>
		 	<th>4</th>
		 	<th>5</th>
		 	<th>6</th>
		 	<th>7</th>
		 	<th>8</th>
		 	<th>9</th>
		 	<th>10</th>
		 	<th>11</th>
		 	<th>12</th>
		 	<th>13</th>
		 	<th>14</th>
		 	<th>15</th>
		 	
		 		 	
		 	</tr>
		 
		
		 	<tr>
		 	<td><%= p3.getZjid() %></td>
		 	<td><%= p3.getKhdlmm() %></td>
		 	<td><%= p3.getKhxm() %></td>
		 	<td><%= p3.getCsrq() %></td>
		 	<td><%= p3.getHyzk() %></td>
		    <td><%= p3.getSsmz() %></td>
		    <td><%= p3.getZjlx() %></td>
		    <td><%= p3.getZjqsrq() %></td>
		    <td><%= p3.getZjjzrq() %></td>
		    <td><%= p3.getKhxb() %></td>
		    <td><%= p3.getKhgj() %></td>
		    <td><%= p3.getYddh() %></td>
		    <td><%= p3.getGddh() %></td>
		    <td><%= p3.getJtdz() %></td>
		    <td><%= p3.getJtyb() %></td>
		             
		 	</tr>
		 	
		 	
    </table>
	</body>
</html>
