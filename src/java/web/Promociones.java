/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.PromocionesDAO;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Promociones", urlPatterns = {"/Promociones"})
public class Promociones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String promocion="3*2 donas Dia";
//        resp.getWriter().print(promocion);
ArrayList resultado= PromocionesDAO.obtener();
resp.getWriter().println(resultado);
    
              
    }

}
