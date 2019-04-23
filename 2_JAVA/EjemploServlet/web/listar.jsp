<%-- 
    Document   : listar
    Created on : 23-abr-2019, 15:47:26
    Author     : Formacion
--%>

<%@page import="com.modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.modelo.ServicioUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file = "header.jsp" %>

        <%
            ArrayList<Usuario> listaUsu = ServicioUsuarios.getInstancia().listar();
        %>
        <table>
            <thead>
            <th>Nombre</th>
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
