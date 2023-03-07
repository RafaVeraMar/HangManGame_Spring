package com.HangMan.HangManGame.Controller;

import com.HangMan.HangManGame.Models.Palabra;
import com.HangMan.HangManGame.Service.HangManGameService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/HangManGame")
public class HangManGame {
    @Autowired
    private HangManGameService juegoAhorcadoService;

    @GetMapping("/iniciar")
    public Palabra iniciarJuego() {
        return juegoAhorcadoService.iniciarJuego();
    }

    @PostMapping("/jugar-letra")
    public Palabra jugarLetra(@RequestBody Palabra palabra, @RequestParam char letra) {
        return juegoAhorcadoService.jugarLetra(palabra, letra);
    }

    @PostMapping("/jugar-palabra")
    public Palabra jugarPalabra(@RequestBody Palabra palabra, @RequestParam String palabraUsuario) {
        return juegoAhorcadoService.jugarPalabra(palabra, palabraUsuario);
    }
}
