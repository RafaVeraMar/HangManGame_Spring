package com.HangMan.HangManGame.Repository;

import java.util.ArrayList;
import java.util.Random;

public class Words {

    public static final String[] WORDS = {
            "Zapato", "Cielo", "Ordenador", "Sombrilla", "Lápiz",
            "Teclado", "Ventana", "Pajaro", "Ahorcado", "Persona",

    };

    public static final Random RANDOM = new Random();
    // maximo de errores antes que usuario pierda
    public static final int MAX_ERRORES = 8;
    // palabra a encontrar
    private String wordToFind;
    // palabra enontrada almacenada en un array char para mostrar la progesion del usuario
    private char[] wordFound;
    private int nbErrors;
    // letras introducidas por el usuario
    private ArrayList<String> letras = new ArrayList<String>();

    // Metodo retornando aleatoriamente la siguiente palabra a encontrar
    private String nextWordToFind(){
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    // Metodo para comenzar juego nuevo
    public void nuevoJuego(){
        nbErrors = 0;
        letras.clear();


    }







}
