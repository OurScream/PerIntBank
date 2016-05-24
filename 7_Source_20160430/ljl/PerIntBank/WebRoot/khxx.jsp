<%@page contentType="text/html; charset=UTF-8" import="perinfo.*" import="java.util.*" %>
<html>
	<head><title>顯示所有學生的頁面</title></head>
	<body>
   <table>
  <%
             
		List<person> persons	=(List<person>)request.getAttribute("per");		 	
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
		 	<% if(persons!=null){
		 	 for(person p:persons){
		 	
		 	%>
		
		 	<tr>
		 	<td><%= p.getZjid() %></td>
		 	<td><%= p.getKhdlmm() %></td>
		 	<td><%= p.getKhxm() %></td>
		 	<td><%= p.getCsrq() %></td>
		 	<td><%= p.getHyzk() %></td>
		    <td><%= p.getSsmz() %></td>
		     <td><%= p.getZjlx() %></td>
		      <td><%= p.getZjqsrq() %></td>
		       <td><%= p.getZjjzrq() %></td>
		        <td><%= p.getKhxb() %></td>
		         <td><%= p.getKhgj() %></td>
		          <td><%= p.getYddh() %></td>
		           <td><%= p. getGddh() %></td>
		            <td><%= p.getJtdz() %></td>
		             <td><%= p.getJtyb() %></td>
		             
		 	</tr>
		 	
		 	<% }}
		 	else{
		 	System.out.println("noooooooooooooooooooooooooooooo");
		 	}
		 
		 	
		 	%> 	
		 	
    </table>
	</body>
</html>

