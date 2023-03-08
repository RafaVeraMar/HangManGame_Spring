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
    public void obtenerPalabras() {
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

//* import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class GeneradorPalabras {
//    public static void main(String[] args) {
//        List<String> palabras = new ArrayList<>();
//        palabras.add("manzana");
//        palabras.add("pera");
//        palabras.add("platano");
//        palabras.add("sandia");
//        palabras.add("naranja");
//        palabras.add("limon");
//        palabras.add("fresa");
//        palabras.add("uva");
//        palabras.add("piña");
//        palabras.add("melon");
//
//        Random random = new Random();
//        List<String> palabrasAleatorias = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            int index = random.nextInt(palabras.size());
//            palabrasAleatorias.add(palabras.get(index));
//            palabras.remove(index);
//        }
//
//        // Imprime las palabras aleatorias
//        for (String palabra : palabrasAleatorias) {
//            System.out.println(palabra);
//        }
//    }
//}/*/