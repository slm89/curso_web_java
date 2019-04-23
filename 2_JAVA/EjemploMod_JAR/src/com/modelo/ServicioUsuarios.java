
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
        //listaUsuarios = new ArrayList<>();
        this.bdUsu = new DerbyDBUsuario();
        this.listaUsuarios = bdUsu.listar();
    }
    
    //Unica manera de obtener un objeto en esta clase
    public static ServicioUsuarios getInstancia(){
        if(instancia == null)
            instancia = new ServicioUsuarios();
        return instancia;
    }
    
    //Código de la clase
    private DerbyDBUsuario bdUsu;
    private final ArrayList<Usuario> listaUsuarios;

   
    public boolean addUsuario(String nom, int edad, String email, String password){
        Usuario nuevoUsu = new Usuario(nom, edad, email, password);
        this.listaUsuarios.add(nuevoUsu);
        this.bdUsu.crear(nuevoUsu);
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
    
    
    public boolean borrarUsuarios (String nom, int edad, String email, String password){
        Usuario nuevoUsu = new Usuario(nom, edad, email, password);
        this.bdUsu.borrar(nuevoUsu);
        return true;
    }
    
    public boolean modifyUser(String nom, String passwd, int edad, String email){
        Usuario nuevoUsu = new Usuario(nom, edad, email, passwd);
        this.bdUsu.modificar(nuevoUsu);
        return true;
    }
    
  
     public ArrayList<Usuario> listar (){
         return this.listaUsuarios;
     }
   
}
 