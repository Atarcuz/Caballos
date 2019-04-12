/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Jugador {
    //Atributos
    private String nombre;
    private double saldo=10000;
    private double cantidadApostar;
    private double cantidadGanada=0;

    
    public Jugador(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    /**
     * Obtener nombre del jugador
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignar nombre del jugador
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtener saldo del jugador
     * @return double saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Asignar saldo del jugador
     * @param saldo double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void reducirSaldo(double saldo){
        this.setSaldo(this.getSaldo() - saldo);
    }
    
    /**
     * Obtiene la cantidad a apostar del jugador
     * @return double
     */
    public double getCantidadApostar() {
        return cantidadApostar;
    }
    
    /**
     * Asigna un valor a la cantidad a apostar del jugador
     * @param cantidadApostar 
     */
    public void setCantidadApostar(double cantidadApostar) {
        this.cantidadApostar = cantidadApostar;
    }
    
    /**
     * Retorna @true si el jugador puede apostar.
     * @false en caso contrario.
     */
    public boolean puedeApostar(){
        return this.saldo - this.cantidadApostar >= 0;
    }
    
    /**
     * Aplica el valor de la apuesta del jugador
     */
    public void aplicarApuesta(){
        this.saldo = this.saldo - this.cantidadApostar;
    }
    
    public double getCantidadGanada() {
        return cantidadGanada;
    }

    public void setCantidadGanada(double cantidadGanada) {
        this.cantidadGanada = cantidadGanada;
    }
    
}
