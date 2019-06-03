<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Brands
</h1>
<%
List result= (List) request.getAttribute("brands");
if(result!=null){
Iterator it = result.iterator();
}
out.println("hi");
out.println("<br>We have <br><br>");
//while(it != null && it.hasNext()){
//out.println(it.next()+"<br>");
//}
%>
</body>
</html>