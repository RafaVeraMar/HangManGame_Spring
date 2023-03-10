package com.HangMan.HangManGame.Models;

import java.util.List;

public class Palabra {
    private String valor;
    private List<Character> letrasAdivinadas;

    public Palabra(String valor) {
        this.valor = valor;
    }

    public Palabra(List<Character> letrasAdivinadas) {
        this.letrasAdivinadas = letrasAdivinadas;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<Character> getLetrasAdivinadas() {
        return letrasAdivinadas;
    }

    public void setLetrasAdivinadas(List<Character> letrasAdivinadas) {
        this.letrasAdivinadas = letrasAdivinadas;
    }

    public Object getPalabra() {
        return null;
    }

   }
