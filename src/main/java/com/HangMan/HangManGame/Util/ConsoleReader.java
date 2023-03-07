package com.HangMan.HangManGame.Util;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {
    private final Scanner scanner = new Scanner(System.in);

    public char leerLetra() {
        System.out.print("Introduce una letra: ");
        String input = scanner.nextLine().trim().toLowerCase();
        while (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.print("Entrada no válida. Introduce una letra: ");
            input = scanner.nextLine().trim().toLowerCase();
        }
        return input.charAt(0);
    }

    public String leerPalabra() {
        System.out.print("Introduce una palabra: ");
        String input = scanner.nextLine().trim().toLowerCase();
        while (input.length() == 0) {
            System.out.print("Entrada no válida. Introduce una palabra: ");
            input = scanner.nextLine().trim().toLowerCase();
        }
        return input;
    }
}

