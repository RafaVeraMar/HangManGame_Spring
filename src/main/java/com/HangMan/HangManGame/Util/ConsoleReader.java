package com.HangMan.HangManGame.Util;

import com.HangMan.HangManGame.Service.HangManGameService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Component
public class ConsoleReader {

    private HangManGameService hangManGameService;
    public ConsoleReader(HangManGameService hangManGameService){
        this.hangManGameService = hangManGameService;
    }

    @PostConstruct
    public void init() {
         Scanner scanner = new Scanner(System.in);
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

