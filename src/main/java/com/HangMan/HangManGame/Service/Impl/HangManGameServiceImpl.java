package com.HangMan.HangManGame.Service.Impl;

import com.HangMan.HangManGame.Models.Palabra;
import com.HangMan.HangManGame.Repository.PalabraRepository;
import com.HangMan.HangManGame.Service.HangManGameService;
import com.HangMan.HangManGame.Service.Partida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class HangManGameServiceImpl implements HangManGameService {

    @Autowired
    private PalabraRepository palabraRepository;

    private static final int NUMERO_INTENTOS = 8;

    @Override
    public Partida nuevaPartida() {
        List<Palabra> palabras = palabraRepository.obtenerPalabras();
        Random rand = new Random();
        Palabra palabraSeleccionada = palabras.get(rand.nextInt(palabras.size()));
        return new Partida();
    }

    @Override
    public Partida intentarLetra(Partida partida, char letra) {
        String palabra = partida.getPalabraOculta();
        String palabraOculta = partida.getPalabraOculta();
        boolean acierto = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                palabraOculta = palabraOculta.substring(0, i) + letra + palabraOculta.substring(i + 1);
                acierto = true;
            }
        }
        if (acierto) {
            partida.setPalabraOculta(palabraOculta);
            if (!palabraOculta.contains("_")) {
                partida.setGanada(true);
            }
        } else {
            partida.setIntentosRestantes(partida.getIntentosRestantes() - 1);
            if (partida.getIntentosRestantes() == 0) {
                partida.setPerdida(true);
            }
        }
        return partida;
    }

    @Override
    public Partida intentarPalabra(Partida partida, String palabra) {
        if (partida.getPalabra().equals(palabra)) {
            partida.setGanada(true);
            partida.setPalabraOculta(palabra);
        } else {
            partida.setIntentosRestantes(partida.getIntentosRestantes() - 1);
            if (partida.getIntentosRestantes() == 0) {
                partida.setPerdida(true);
            }
        }
        return partida;
    }

    @Override
    public List<Character> obtenerLetrasDisponibles(Partida partida) {
        String palabra = partida.getPalabra().toString();
        String palabraOculta = partida.getPalabraOculta();
        List<Character> letrasDisponibles = new ArrayList<>();
        for (int i = 0; i < palabraOculta.length(); i++) {
            if (palabraOculta.charAt(i) == '_') {
                char letra = palabra.charAt(i);
                if (!letrasDisponibles.contains(letra)) {
                    letrasDisponibles.add(letra);
                }
            }
        }
        return letrasDisponibles;
    }

    @Override
    public Palabra iniciarJuego() {
        return null;
    }

    @Override
    public Palabra jugarLetra(Palabra palabra, char letra) {
        return null;
    }

    @Override
    public Palabra jugarPalabra(Palabra palabra, String palabraUsuario) {
        return null;
    }
}
