<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
    <h1>Pagina principal Aplicacion Servlet</h1>
</header>

<%-- As� en JSP--%>

<% if (5 == 5){ %>
    5 es igual a 5
<% } %>


<%-- As� en Jslt--%>
<c:if test="${5 == 5}">
    5 es igual a 5
</c:if>

<%-- O as� en Jslt--%>
<c:if test="${5 eq 5}">
    5 es igual a 5
</c:if>
    
<nav>
    <a href="login.jsp">Login --    --</a>
    <a href="registro.jsp">Formulario Registro --    --</a>
    <a href="listar.jsp">Listado</a>
</nav>   
