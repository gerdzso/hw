<%@ page import="com.mycompany.app.ParCalc" %>
<html>
<body>

<h2><b>Hello Dani!!!</b></h2>
<h2> Enter the radius of your circle! </h2>

<form>
<textarea id="txt" rows="1" cols="60" name="val" onChange="updateLink()"></textarea>
<a id='link' href=""> ok </a>
</form>

<script>
function updateLink(){
value = document.getElementById('txt').value;
document.getElementById('link').href = 'http://localhost:8080/hello/index.jsp?name='+value;
}
</script>

<%
String zen = request.getParameter("name");
ParCalc pc = new ParCalc();
%>
<h2><b><%= pc.isNumber(zen) %></b></h2>
<%
if (pc.isNumb){
%>
<h2><b><%= pc.params() %></b></h2>
<%
}
%>
</body>
</html>