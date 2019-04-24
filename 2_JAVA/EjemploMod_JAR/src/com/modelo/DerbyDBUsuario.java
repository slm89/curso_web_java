package com.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

/**
 *
 * @author Formacion
 */
public class DerbyDBUsuario {

    public DerbyDBUsuario() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

        } catch (Exception ex) {
            Logger.getLogger(DerbyDBUsuario.class.getName())
                    .log(Level.SEVERE, null, ex);

        }
    }

    public ArrayList<Usuario> listar() {
        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB )) {

            ArrayList<Usuario> listaUsu = new ArrayList<>();
            String consultaSQL = "SELECT id, nombre, edad, password, email FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consultaSQL);
            while (res.next()) { //Obtener cada uno de los registros
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String email = res.getString("email");
                String password = res.getString("password");
                int edad = res.getInt("edad");
                Usuario usu = new Usuario(id, nombre, edad, email, password);
                listaUsu.add(usu);
            }

            //Si todo ha ido bien: 
            return listaUsu;
        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return null;
        }
    }

    public boolean crear(Usuario persona) {

        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)) {

            
            String querySQL = "INSERT INTO USUARIO (NOMBRE, EDAD, EMAIL, PASSWORD) VALUES (?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(querySQL);
            st.setString(1, persona.getNombre());
            st.setInt(2, persona.getEdad());
            st.setString(3, persona.getEmail());
            st.setString(4, persona.getPassword());
            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminar (int id) {

        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)) {
            String sqlDel = "DELETE  FROM USUARIO  WHERE id=?";
            PreparedStatement st = con.prepareStatement(sqlDel);
            st.setInt(1, id);
            st.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return false;
        }
    }
    
    public boolean modificar(Usuario persona){
        try(Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)){
            
            String sqlModify = "UPDATE USUARIO SET NOMBRE = ?, EMAIL = ?, PASSWORD = ?  WHERE id=?"; 
            PreparedStatement st = con.prepareStatement(sqlModify);
            
            st.setString(1, persona.getNombre());
            st.setInt(2, persona.getEdad());
            st.setString(3, persona.getEmail());
            st.setString(4, persona.getPassword());
            st.setInt(5, persona.getId());
            st.executeUpdate();
            return true;
            
        } catch (SQLException ex){
            System.err.println(" >>>>>> " + ex.getMessage());
            return false;
        }
    } 

}
