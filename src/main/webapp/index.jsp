<%@ page import="com.mycompany.app.ParCalc" %>
<%@ page import="com.mycompany.app.LangSet" %>
<%@ page import="com.mycompany.app.RadiusFormatException" %>
<html>
<body>

<%
String zen = request.getParameter("name");
LangSet ls = new LangSet();
String zen2 = request.getParameter("lanid");
try{
ls.setLan(Integer.parseInt(zen2));
} catch (Exception e){ls.setLan(0);}
ParCalc pc = new ParCalc();
%>
<h2><b>Hello Dani!!!</b></h2>
<h2> <%= ls.s0 %> </h2>
<form>
<textarea id="txt" rows="1" cols="60" name="val" onChange="updateLink()"></textarea>
<a id='link' href=""> ok </a>
</form>
<%
try{
pc.parseRadius(zen);
%>
<h2><b><%= ls.s1 %><%= pc.getRadius() %></b></h2>
<h2><b><%= ls.s2 %><%= pc.getArea() %></b></h2>
<h2><b><%= ls.s3 %><%= pc.getGirth() %></b></h2>
<%
} catch (NumberFormatException rfe){
%>
<h2><b><%= ls.se %></b></h2>
<%
} catch (NullPointerException npe){}
%>

<script>
function updateLink(){
value = document.getElementById('txt').value;
document.getElementById('link').href = 'http://localhost:8080/hw/index.jsp?name='+value+'&lanid='+getURLParameter('lanid');
}
</script>

<h3><a id='link2' href=""> EN </a>   <a id='link3' href=""> HU </a></h3>
<script>
function getURLParameter(name) {
  return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search)||[,""])[1].replace(/\+/g, '%20'))||null
}
document.getElementById('link2').href = 'http://localhost:8080/hw/index.jsp?name='+getURLParameter('name')+'&lanid=0';
document.getElementById('link3').href = 'http://localhost:8080/hw/index.jsp?name='+getURLParameter('name')+'&lanid=1';
</script>

</body>
</html>
