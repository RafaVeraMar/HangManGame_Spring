package com.HangMan.HangManGame.Service;

import com.HangMan.HangManGame.Models.Palabra;

import java.util.List;

public interface HangManGameService {
    Partida nuevaPartida();

    Partida intentarLetra(Partida partida, char letra);

    Partida intentarPalabra(Partida partida, String palabra);

    List<Character> obtenerLetrasDisponibles(Partida partida);

    Palabra iniciarJuego();
    Palabra jugarLetra(Palabra palabra, char letra);
    Palabra jugarPalabra(Palabra palabra, String palabraUsuario);
}
