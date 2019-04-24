
<%@page import="com.modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.modelo.ServicioUsuarios"%>

<%@include file = "head.jsp" %>

<% ArrayList<Usuario> listaUsu = ServicioUsuarios.getInstancia().listar();%>

<html>
    <%= head() %>
    
    <body>
        <%@include file = "header.jsp" %>
        
            <% for (Usuario usu : listaUsu) { %>
                <form action="usuarios.do" method="post" name="form_<%= usu.getId() %>">
                    <input id="id" name="id" type="text" size="4" readonly="true" value="<%= usu.getId()%>"/>
                    <input id="nombre" name="nombre" type="text" size="20" value="<%= usu.getNombre()%>"/>
                    <input id="edad" name="edad" type="text" size="4" value="<%= usu.getEdad()%>"/>
                    <input id="email" name="email" type="text" size="20" value="<%= usu.getEmail()%>"/>
                    <input id="password" name="password" type="text" size="20" value="<%= usu.getPassword()%>"/>
                    
                    <input class="metodo" id="accion" name="accion" readonly="true" value="***"/>
                    <input type="submit" value="EDIT" onclick="Array.from(document.getElementsByClassName('metodo')).forEach((thisInput) => {thisInput.value='PUT';)}"/>
                   
                </form>
            <% } %>
    </body>
</html>
