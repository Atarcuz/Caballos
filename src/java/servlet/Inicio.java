/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author salak405
 */
@WebServlet(name = "Inicio", urlPatterns = {"/Inicio"})
public class Inicio extends HttpServlet {

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
            out.println("<title>Inicio</title>");            
            out.println("</head>");
            
            out.println("<body>");
            out.println("<center>");
                out.println("<h1>HORSE GAME</h1><br><br>");
                out.println("<table>");
                    out.println("<tr>");
                        out.println("<td><h2>Numero caballo:</h2></td> \n" +
                    "                <td><h2><center>1</center></h2></td>\n" +
                    "                <td><h2><center>2</center></h2></td>\n" +
                    "                <td><h2><center>3</center></h2></td>\n" +
                    "                <td><h2><center>4</center></h2></td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td><h2>Presentacion:</h2></td>\n" +
                                "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
                                "  width=200 height=150 /></td>\n" +
                                "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
                                "  width=200 height=150 /></td>\n" +
                                "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
                                "  width=200 height=150 /></td>\n" +
                                "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
                                "  width=200 height=150 /></td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td><h2>Nombre:</h2></td>\n" +
            "                   <td>Zeus</td>\n" +
            "                   <td>Bucéfalos</td>\n" +
            "                   <td>Millonario</td>\n" +
            "                   <td>Relámpago</td>");
                    out.println("</tr>");
                out.println("</table><br>");
            out.println("</center>");
            
            out.println("<center>");
                out.println("<form action=\"Apuesta\" method=\"get\">");
                    out.println("<table style=\"border: 1px solid black\" size=\"90%\">");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<table>");
                                    out.println("<tr>");
                                    
                                        out.println("<td>");
                                            out.println("Nombre Jugador 1: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtJugador1\" size=\"12\"> <br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Apuesta : ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtApuesta1\" maxlength=\"5\" size=\"3\"><br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Caballo a apostar: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<select name=\"cmbCaballoApostar1\">\n" +
                                                    "  <option value=\"1\">1</option>\n" +
                                                    "  <option value=\"2\">2</option>\n" +
                                                    "  <option value=\"3\">3</option>\n" +
                                                    "  <option value=\"4\">4</option>\n" +
                                                    "</select>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                out.println("</table>");
                            out.println("</td>");
                            
                            out.println("<td>");
                                out.println("<table>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Nombre Jugador 2: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtJugador2\" size=\"12\"> <br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Apuesta : ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtApuesta2\" maxlength=\"5\" size=\"3\"><br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Caballo a apostar: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<select name=\"cmbCaballoApostar2\">\n" +
                                                    "  <option value=\"1\">1</option>\n" +
                                                    "  <option value=\"2\">2</option>\n" +
                                                    "  <option value=\"3\">3</option>\n" +
                                                    "  <option value=\"4\">4</option>\n" +
                                                    "</select>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                out.println("</table>");
                            out.println("</td>");
                        out.println("</tr>");
                        
                        out.println("<tr>");    
                            out.println("<td>");
                                out.println("<table>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Nombre Jugador 3: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtJugador3\" size=\"12\"> <br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Apuesta : ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtApuesta3\" maxlength=\"5\" size=\"3\"><br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Caballo a apostar: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<select name=\"cmbCaballoApostar3\">\n" +
                                                    "  <option value=\"1\">1</option>\n" +
                                                    "  <option value=\"2\">2</option>\n" +
                                                    "  <option value=\"3\">3</option>\n" +
                                                    "  <option value=\"4\">4</option>\n" +
                                                    "</select>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                out.println("</table>");
                            out.println("</td>");
                            
                            out.println("<td>");
                                out.println("<table>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Nombre Jugador 4: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtJugador4\" size=\"12\"> <br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Apuesta : ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<input type=\"text\" name=\"txtApuesta4\" maxlength=\"5\" size=\"3\"><br>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                    out.println("<tr>");
                                        out.println("<td>");
                                            out.println("Caballo a apostar: ");
                                        out.println("</td>");
                                        out.println("<td>");
                                            out.println("<select name=\"cmbCaballoApostar4\">\n" +
                                                    "  <option value=\"1\">1</option>\n" +
                                                    "  <option value=\"2\">2</option>\n" +
                                                    "  <option value=\"3\">3</option>\n" +
                                                    "  <option value=\"4\">4</option>\n" +
                                                    "</select>");
                                        out.println("</td>");
                                    out.println("</tr>");
                                out.println("</table>");
                            out.println("</td>");
                        out.println("</tr>");
                    out.println("</table><br>");
                    out.println("<input type=\"submit\"  value=\"Jugar\" name=\"btnJugar\"><br>");
                out.println("</form>");
            out.println("</center>");
            
            out.println("</body>");
            out.println("</html>");
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
