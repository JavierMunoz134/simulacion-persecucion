package com.example.simulacionpersecucion;

// Clase que representa las coordenadas 2D
public class Coordinates2D {
    private int x;
    private int y;

    // Constructor
    public Coordinates2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters y setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Métodos para desplazar las coordenadas en el eje X e Y
    public void deltaX(int x) {
        this.x += x;
    }

    public void deltaY(int y) {
        this.y += y;
    }

    // Método para calcular la distancia entre dos posiciones
    public int getDistance(Coordinates2D position) {
        return Math.abs(position.x - x) + Math.abs(position.y - y);
    }
}