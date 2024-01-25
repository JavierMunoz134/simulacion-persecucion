package com.example.simulacionpersecucion;

import javafx.collections.ListChangeListener;

// Clase Enemigo que implementa ListChangeListener para observar cambios en la lista de movimientos del jugador
public class Enemigo extends Coordinates2D implements ListChangeListener<Coordinates2D> {
    // Constructor
    public Enemigo(int x, int y) {
        super(x, y);
    }

    // Método que se ejecuta cuando hay cambios en la lista de movimientos del jugador
    @Override
    public void onChanged(Change<? extends Coordinates2D> change) {
        while (change.next()) {
            Coordinates2D jugador = change.getAddedSubList().get(0);
            int distance = this.getDistance(jugador);
            int movements = 0;
            while (movements < 2) {
                this.deltaX(1);
                if (this.getDistance(jugador) >= distance) {
                    this.deltaX(-1);
                } else {
                    movements++;
                }

                this.deltaX(-1);
                if (this.getDistance(jugador) >= distance) {
                    this.deltaX(1);
                } else {
                    movements++;
                }

                this.deltaY(1);
                if (this.getDistance(jugador) >= distance) {
                    this.deltaY(-1);
                } else {
                    movements++;
                }

                this.deltaY(-1);
                if (this.getDistance(jugador) >= distance) {
                    this.deltaY(1);
                } else {
                    movements++;
                }
            }
            System.out.println(this);
        }
    }

    // Método toString para imprimir la posición del enemigo
    @Override
    public String toString() {
        return "Enemigo (" + this.getX() + "," + this.getY() + ")";
    }
}