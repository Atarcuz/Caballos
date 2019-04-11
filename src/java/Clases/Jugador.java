/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Jugador {
    private String nombre;
    private double saldo=10000;
    private double cantidadApostar;
    private double cantidadGanada=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCantidadApostar() {
        return cantidadApostar;
    }

    public void setCantidadApostar(double cantidadApostar) {
        this.cantidadApostar = cantidadApostar;
    }

    public double getCantidadGanada() {
        return cantidadGanada;
    }

    public void setCantidadGanada(double cantidadGanada) {
        this.cantidadGanada = cantidadGanada;
    }
    
}
