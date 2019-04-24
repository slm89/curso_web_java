<%@page import="com.modelo.Usuario" %>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
    <h1>Pagina principal Aplicacion Servlet</h1>
</header>

<nav>
    <a href="index.jsp"> Inicio </a>
    <c:catch var="exception">
        <%--JSP
        <% Usuario usuario = (Usuario) session.getAttribute("usuario"):%>
        --%>

        <%--Con JSPL --%>
        <jsp:useBean id="usuario" type="com.modelo.Usuario" scope="session">
            <jsp:getProperty property="*" name="usuario"/>
            <jsp:getProperty property="id" name="usuario"/>
            <jsp:getProperty property="email" name="usuario"/>
        </jsp:useBean>
        <a href="listar.jsp">Listado</a>
    </c:catch>
    <c:if test="${ not empty exception}">
        <a href="login.jsp">Login</a>
        <a href="registro.jsp">Formulario Registro</a>
    </c:if>
</nav>

<c:if test="${sessionScope.msj_error != null}">
    <h3 style="color: orange"> ${sessionScope.msj_error} </h3>
    <c:remove var="msj_error" scope="session"/>
    <!-- request.getSession().removeAtributte("msj_error");-->
</c:if>





<%--EJEMPLO DE JSP Y JSLT
<%-- Así en JSP

<% if (5 == 5){ %>
    5 es igual a 5
<% } %>


<%-- Así en Jslt
<c:if test="${5 == 5}">
    5 es igual a 5
</c:if>

<%-- O así en Jslt
<c:if test="${5 eq 5}">
    5 es igual a 5
</c:if>--%>

    
   
