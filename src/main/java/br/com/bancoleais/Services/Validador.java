package br.com.bancoleais.Services;

import java.util.Scanner;


public class Validador{

    static Scanner leia = new Scanner(System.in);

    public static boolean isNumeric(String escolhaUsuario) {
        if (escolhaUsuario == null || escolhaUsuario.trim().isEmpty()) return false;

        String trimmed = escolhaUsuario.trim();

        for (int i = 0; i < trimmed.length(); i++) {
            if (i == 0 && trimmed.charAt(i) == '-' && trimmed.length() > 1) continue;
            if (!Character.isDigit(trimmed.charAt(i))) return false;
        }

        return true;
    }

    public static int turnToInteger() {
        var escolhaUsuario = "";
        while (true) {
            System.out.println("╔══════════════════════════════════════════════════════════╗");
            System.out.println("║  ✘  Entrada inválida! Digite apenas números inteiros.    ║");
            System.out.println("╚══════════════════════════════════════════════════════════╝");
            System.out.print(">>>Escolha uma opção: ");
            escolhaUsuario = leia.nextLine();
            if (isNumeric(escolhaUsuario)) {
                break;
            }
        }
        return Integer.parseInt(escolhaUsuario);
    }

     
}
