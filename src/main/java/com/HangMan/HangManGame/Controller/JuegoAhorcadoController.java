package com.HangMan.HangManGame.Controller;

import com.HangMan.HangManGame.Models.Palabra;
import com.HangMan.HangManGame.Service.Impl.JuegoAhorcadoService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/juego-ahorcado")
public class JuegoAhorcadoController {
    @Autowired
    private JuegoAhorcadoService juegoAhorcadoService;

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
