
<%@page import="com.modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.modelo.ServicioUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file = "head.jsp" %>

<% ArrayList<Usuario> listaUsu = ServicioUsuarios.getInstancia().listar();%>

<html>
    <%= head() %>
    
    <body>
        <%@include file = "header.jsp" %>
       
        <table>
            <thead>
            <th>Nombre<<<<<<------------------------->>>>>></th>
            <th>Email</th>
        </thead>
        <tbody>
            <%
                for (Usuario usu : listaUsu) {
            %>
            <tr>
                <td><% out.println(usu.getNombre());%> </td>
                <td><%=usu.getEmail()%></td>
            </tr>
            <%
                }
            %>

        </tbody>
        </table>
    </body>
</html>
