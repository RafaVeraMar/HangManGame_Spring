package com.HangMan.HangManGame.Service.Impl;

public interface JuegoAhorcadoService {
    Palabra iniciarJuego();
    Palabra jugarLetra(Palabra palabra, char letra);
    Palabra jugarPalabra(Palabra palabra, String palabraUsuario);
}
