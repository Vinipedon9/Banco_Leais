package br.com.bancoleais.Services;

import java.util.Scanner;


public class Validador{

    static Scanner leia = new Scanner(System.in);

    public static boolean validadorMenu(String escolhaDoUsuario) {
        escolhaDoUsuario = escolhaDoUsuario.replace(" ", "");
        if (!escolhaDoUsuario.equals("1") &&
             !escolhaDoUsuario.equals("2") &&
             !escolhaDoUsuario.equals("3") &&
             !escolhaDoUsuario.equals("4") &&
             !escolhaDoUsuario.equals("0")){

            return false;
        }
        return true;
    }
    public static String validarEntrada() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║  ✘  Entrada inválida! Digite apenas valores de 1 a 4.    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.print(">>>Escolha uma opção: ");
        return leia.nextLine();
    }
}
