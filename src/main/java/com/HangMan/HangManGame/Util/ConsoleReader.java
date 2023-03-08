package com.HangMan.HangManGame.Util;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {
    public Scanner scanner = new Scanner(System.in);
    public void init() {

         System.out.print("Introduce una letra: ");
         String inputLetra = scanner.nextLine().trim().toLowerCase();
         while (inputLetra.length() != 1 || !Character.isLetter(inputLetra.charAt(0))) {
             System.out.print("Entrada no válida. Introduce una letra: ");
             inputLetra = scanner.nextLine().trim().toLowerCase();
            }


         System.out.print("Introduce una palabra: ");
         String inputPalabra = scanner.nextLine().trim().toLowerCase();
         while (inputPalabra.length() == 0) {
             System.out.print("Entrada no válida. Introduce una palabra: ");
             inputPalabra = scanner.nextLine().trim().toLowerCase();
            }


    }
}

