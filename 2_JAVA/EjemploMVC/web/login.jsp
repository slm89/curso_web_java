<%@include file = "head.jsp" %>

<html>
    <%= head() %>
    
    <body>
        <%@include file = "header.jsp" %>
        <h1>Login</h1>
        <form name = "form1" method = "post" action="./usuarios.do">
            <table border = "1">
                <tr><td>Contraseña: </td><td>
                        <input type = "password" name = "password" id = "password" size = "25" value ="1234" required="required"/> </td></tr>
                <tr><td>Email: </td><td>
                    <input type = "email" name = "email" id = "email" size = "25" value ="email@valido.com" required="required"/> </td></tr>
            </table>
            <input type="hidden" name="accion" id="accion" value="login"/>
            <input type = "submit" value = "Enviar"/>
        </form>
</html>
