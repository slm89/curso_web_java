
package com.modelo;

import java.util.ArrayList;

/**
 *
 * @author Formacion
 */
public class ServicioUsuarios {
    
    //Implementando Singleton
    
    private static ServicioUsuarios instancia = null;
    
    
    //Nadie puede hacer new salvo esta misma clase
    private ServicioUsuarios() {
        listaUsuarios = new ArrayList<>();
    }
    
    //Unica manera de obtener un objeto en esta clase
    public static ServicioUsuarios getInstancia(){
        if(instancia == null)
            instancia = new ServicioUsuarios();
        return instancia;
    }
    
    //Código de la clase
    private final ArrayList<Usuario> listaUsuarios;

   
    public boolean addUsuario(String nom, int edad, String email, String password){
        Usuario nuevoUsu = new Usuario(nom, edad, email, password);
        this.listaUsuarios.add(nuevoUsu);
        return true;
    }
    
    public boolean validacionPasswd(String email, String passwd){
        for(Usuario usu : listaUsuarios){
            if (usu.getEmail().equals(email) && usu.getPassword().equals(passwd)){
                return true;
            }
        }return false;
    }
    
    public int cantidadUsuarios(){
        return listaUsuarios.size();
    }
}
 