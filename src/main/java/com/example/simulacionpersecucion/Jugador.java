package com.example.simulacionpersecucion;
//Clase que representa el jugador
public class Jugador extends Coordinates2D{
//Constructor
    public Jugador(int x, int y) {
        super(x, y);
    }

    //Método toString para imprimir la posición del jugador
    @Override
    public String toString() {
        return "Jugador (" + this.getX() + "," + this.getY() + ")";
    }

}