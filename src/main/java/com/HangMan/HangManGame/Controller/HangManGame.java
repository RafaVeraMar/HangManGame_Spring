package com.HangMan.HangManGame.Controller;

import com.HangMan.HangManGame.Models.Palabra;
import com.HangMan.HangManGame.Service.HangManGameService;
import org.springframework.beans.factory.annotation.Autowired;


public class HangManGame {
    @Autowired
    private HangManGameService HangManGameService;


    public Palabra iniciarJuego() {
        return HangManGameService.iniciarJuego();
    }


    public Palabra jugarLetra(Palabra palabra, char letra) {
        return HangManGameService.jugarLetra(palabra, letra);
    }


    public Palabra jugarPalabra( Palabra palabra, String palabraUsuario) {
        return HangManGameService.jugarPalabra(palabra, palabraUsuario);
    }
}
