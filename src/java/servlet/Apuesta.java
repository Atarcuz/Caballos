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
 * @author salak401
 */
@WebServlet(name = "Apuesta", urlPatterns = {"/Apuesta"})
public class Apuesta extends HttpServlet {

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
        
        request.setAttribute("jugadores", "xd");
        request.getRequestDispatcher("main.jsp").forward(request, response);
        try (PrintWriter out = response.getWriter()) {
            String nombreJ1,nombreJ2,nombreJ3,nombreJ4;
            double apuesta1,apuesta2,apuesta3,apuesta4;
            /*nombreJ1=request.getParameter("txtJugador1");
            nombreJ2=request.getParameter("txtJugador2");
            nombreJ3=request.getParameter("txtJugador3");
            nombreJ4=request.getParameter("txtJugador4");
            //https://www.todoexpertos.com/categorias/tecnologia-e-internet/programacion/java/respuestas/151038/paso-de-parametros-en-servlets
            //http://www.forosdelweb.com/f45/como-paso-objetos-servlet-jsp-289033/
            apuesta1=Double.parseDouble(request.getParameter("txtApuesta1"));
            apuesta2=Double.parseDouble(request.getParameter("txtApuesta2"));
            apuesta3=Double.parseDouble(request.getParameter("txtApuesta3"));
            apuesta4=Double.parseDouble (request.getParameter("txtApuesta4"));*/
//            ///XDDD
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Apuesta</title>");            
//            out.println("</head>");
//            out.println("<body>");
//                out.println("<center>");
//                    out.println("<h1>HORSE GAME</h1><br><br>");
//                    out.println("<table>");
//                        out.println("<tr>");
//                            out.println("<td><h2>Numero caballo:</h2></td> \n" +
//                        "                <td><h2><center>1</center></h2></td>\n" +
//                        "                <td><h2><center>2</center></h2></td>\n" +
//                        "                <td><h2><center>3</center></h2></td>\n" +
//                        "                <td><h2><center>4</center></h2></td>");
//                        out.println("</tr>");
//                        out.println("<tr>");
//                        out.println("<td><h2>Presentacion:</h2></td>\n" +
//                                    "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
//                                    "  width=200 height=150 /></td>\n" +
//                                    "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
//                                    "  width=200 height=150 /></td>\n" +
//                                    "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
//                                    "  width=200 height=150 /></td>\n" +
//                                    "<td><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Palomino_Horse.jpg/220px-Palomino_Horse.jpg\" \n" +
//                                    "  width=200 height=150 /></td>");
//                        out.println("</tr>");
//                        out.println("<tr>");
//                        out.println("<td><h2>Nombre:</h2></td>\n" +
//                "                   <td>Zeus</td>\n" +
//                "                   <td>Bucéfalos</td>\n" +
//                "                   <td>Millonario</td>\n" +
//                "                   <td>Relámpago</td>");
//                        out.println("</tr>");
//                    out.println("</table><br>");
//                out.println("</center>");
//            out.println("</body>");
//            out.println("</html>");
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
