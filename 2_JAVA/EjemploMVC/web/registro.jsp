<%@include file = "head.jsp" %>

<html>
    <%= head() %>
    
    <body>
        <%@include file = "header.jsp" %>
        <h2>Registro</h2>
        <form name ="form1" method="post" action="./usuarios.do">
            <table border = "1">
                <tr><td>Nombre: </td><td>
                        <input type = "text" name = "nombre" id = "nombre" size = "25" value ="Fulana" required="required"/> </td></tr>
                <tr><td>Contraseña: </td><td>
                        <input type = "password" name = "password" id = "password" size = "25" value ="0000" required="required"/> </td></tr>
                <tr><td>Edad: </td><td>
                    <input type = "number" name = "edad" id = "edad" size = "25" value ="36" required="required"/> </td></tr>
                <tr><td>Email: </td><td>
                    <input type = "email" name = "email" id = "email" size = "25" value ="fulana@valido.com" required="required"/> </td></tr>
            </table>
            <input type="hidden" name="accion" id="accion" value="registro"/>
            <input type = "submit" value = "Enviar"/>
        </form>
</html>
