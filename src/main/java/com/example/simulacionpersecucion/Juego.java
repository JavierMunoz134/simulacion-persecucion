package com.example.simulacionpersecucion;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;
import java.util.Scanner;
//Clase que representa el juego
public class Juego {
//método para crear un enemigo
    private static Enemigo createEnemigo(Jugador jugador, ObservableList<Coordinates2D> jugadorMoves) {
        Enemigo enemigo;
        do {
            enemigo = new Enemigo(new Random().nextInt(30), new Random().nextInt(30));
        } while (jugador.getDistance(enemigo) < 5);
        jugadorMoves.addListener(enemigo);
        return enemigo;
    }
//método main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador jugador;
        jugador = new Jugador(new Random().nextInt(30), new Random().nextInt(30));
        ObservableList<Coordinates2D> jugadorMoves = FXCollections.observableArrayList();

        Enemigo enemigo1, enemigo2, enemigo3;
        enemigo1 = createEnemigo(jugador, jugadorMoves);
        enemigo2 = createEnemigo(jugador, jugadorMoves);
        enemigo3 = createEnemigo(jugador, jugadorMoves);

        System.out.println("Move using A W S D");
        int steps = 0;
//mientras el jugador no sea atrapado, se le pide que ingrese una tecla para moverse

        while (jugador.getDistance(enemigo1) != 0 && jugador.getDistance(enemigo2) != 0 && jugador.getDistance(enemigo3) != 0) {
            char movement = Character.toUpperCase(sc.next().charAt(0));
            switch (movement) {
                case 'W' -> {
                    jugador.deltaY(1);
                    System.out.println(jugador);
                    jugadorMoves.add(new Coordinates2D(jugador.getX(), jugador.getY())); // Guarda la posición actual
                }
                case 'D' -> {
                    jugador.deltaX(1);
                    System.out.println(jugador);
                    jugadorMoves.add(new Coordinates2D(jugador.getX(), jugador.getY()));
                }
                case 'S' -> {
                    jugador.deltaY(-1);
                    System.out.println(jugador);
                    jugadorMoves.add(new Coordinates2D(jugador.getX(), jugador.getY()));
                }
                case 'A' -> {
                    jugador.deltaX(-1);
                    System.out.println(jugador);
                    jugadorMoves.add(new Coordinates2D(jugador.getX(), jugador.getY()));
                }
            }
            //si el jugador es atrapado, se imprime el mensaje y se termina el juego
            steps++;
            System.out.println();
        }

        System.out.println("¡Atrapado! Pasos dados sin ser atrapado: " + steps);
    }
}
