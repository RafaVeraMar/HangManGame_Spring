package com.HangMan.HangManGame.Repository.Impl;

import com.HangMan.HangManGame.Models.Palabra;
import com.HangMan.HangManGame.Repository.PalabraRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PalabraRepositoryFileImpl implements PalabraRepository {

    @Value("${palabras.archivo}")
    private String archivoPalabras;

    @Override
    public List<Palabra> obtenerPalabras() {
        List<Palabra> palabras = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoPalabras))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabrasLinea = linea.split(";");
                for (String palabra : palabrasLinea) {
                    palabras.add(new Palabra(palabra.trim().toLowerCase()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabras;
    }

}