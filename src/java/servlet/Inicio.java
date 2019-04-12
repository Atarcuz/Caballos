/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Clases.Jugador;
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
    
    private final int NUMERO_JUGADORES = 4;
    private final Jugador[] jugadores = new Jugador[NUMERO_JUGADORES];;
    
    
    /**
     * Manda la respuesta usual: Los jugadores.
     */
    private void response(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        request.setAttribute("jugadores", jugadores);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }
    
    /**
     * Manejaremos un error en caso de que el valor de una apuesta sea inválida, que no vaya a ser que 
     * alguien con poco dinero apueste la fortuna que no tiene.
     * Para esto, mandaremos el mensaje y el detalle (Como qué jugador fue).
     * @param request
     * @param response
     * @param errDetails
     * @throws ServletException
     * @throws IOException 
     */
    private void responseWithError(HttpServletRequest request, HttpServletResponse response, String errDetails)
            throws ServletException, IOException{
        request.setAttribute("jugadores", jugadores);
        request.setAttribute("error", "Error de apuesta: " + errDetails);

        request.getRequestDispatcher("main.jsp").forward(request, response);
    }
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
        inicializarJuego();
        response(request, response);
    }
    
    /**
     * Maneja el método POST del servlet para hacer las operaciones a la hora de apostar.
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
        for (int i = 0; i < NUMERO_JUGADORES; i++){
            //A el jugador en la posición i le valos a asignar un valor de apuesta.
            //Este valor de apuesta viene en el cuerpo de la petición con un ID en formato "apuesta-jugador#"
            //El tipo de dato de este valor es un String, por lo que debemos parsearlo a Double para poder utilizarlo en nuestra función.
            String apuesta = request.getParameter("apuesta-jugador" + (i + 1));
            jugadores[i].setCantidadApostar(Double.parseDouble(apuesta));
            if(!jugadores[i].puedeApostar()){
                String err = String.format(
                        "El jugador %s no tiene dinero suficiente para apostar. Dinero actual: %.2f. Dinero apostado: %.2f", 
                        jugadores[i].getNombre(), 
                        jugadores[i].getSaldo(), 
                        jugadores[i].getCantidadApostar());
                System.out.println(err);
                responseWithError(request, response, err);
                break;
            }
        }
        
        for (Jugador j : jugadores){
            j.aplicarApuesta();
        }
        response(request, response);
    }

    
    /**
     * Crea los 4 jugadores y les asigna el valor inicial
     */
    private void inicializarJuego(){
        jugadores[0] = new Jugador("Santiago", 1000);
        jugadores[1] = new Jugador("Sebastián", 1000);
        jugadores[2] = new Jugador("Felipe", 1000);
        jugadores[3] = new Jugador("Daniel", 1000);
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
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
