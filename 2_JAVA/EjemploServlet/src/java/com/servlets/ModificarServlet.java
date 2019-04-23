/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.modelo.DerbyDBUsuario;
import com.modelo.ServicioUsuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Formacion
 */
public class ModificarServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Formulario para Modificar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario para Modificar Usuarios</h1>");
            
            String nombre = request.getParameter("nom");
            String edad = request.getParameter("eda");
            String email = request.getParameter("ema");
            String pass = request.getParameter("pass");
            
            int iEdad = 0;
            
            boolean camposOK = true;
            
            if(nombre.equals("")){
                camposOK = false;
                out.println("<p style='background-color:red'>Modifique el nombre</p>");
            } else {
                out.println("<p>Te llamas " + nombre + " </p>");
            }
            if(pass.equals("")){
                camposOK = false;
                out.println("<p style='background-color:red'>Modifique el password</p>");
            } else {
                out.println("<p>Tu password es " + pass + "</p>");
            }
            if(edad.equals("")){
                camposOK = false;
                out.println("<p style='background-color:red'>Modifique la edad</p>");
            } else {
                iEdad = Integer.parseInt(edad);
                if(iEdad<18)
                    out.println("<p style='background-color:red'>Tienes menos de 18 años</p>");
                else
                    out.println("<p>Tienes " + edad + " años</p>");
            }
            if(email.equals("")){
                camposOK = false;
                out.println("<p style='background-color:red'>Modifique el email</p>");
            } else {
                out.println("<p>Tu correo es " + email + "</p>");
            }
            
            out.println("</body>");
            out.println("</html>");
            
            if(camposOK == true){
                ServicioUsuarios su = ServicioUsuarios.getInstancia();
                su.modifyUser(nombre, pass, iEdad, email);
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
