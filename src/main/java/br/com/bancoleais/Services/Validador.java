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

    public static boolean isAlphabetic(String palavra) {
        char[] alphabet = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'
        };

        String palavraSemEspacamentos = palavra.replace(" ", "").toLowerCase();

        if (palavraSemEspacamentos.isEmpty()) return false;

        for (int i = 0; i < palavraSemEspacamentos.length(); i++) {
            char caractere = palavraSemEspacamentos.charAt(i);
            boolean found = false;

            for (int j = 0; j < alphabet.length; j++) {
                if (caractere == alphabet[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) return false;
        }

        return true;
    }

    public static String validarFormatoCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) return "none";

        String cpfSemEspacamento = cpf.replace(" ", "");

        if (cpfSemEspacamento.length() < 13 || cpfSemEspacamento.length() > 14) return "none";

        for (int i = 0; i < cpfSemEspacamento.length(); i++) {
            char c = cpfSemEspacamento.charAt(i);

            if (i == 3 || i == 7) {
                if (c != '.') return "none";
            } else if (i == 11) {
                if (c != '-') return "none";
            } else {
                if (!Character.isDigit(c)) return "none";
            }
        }

        return cpfSemEspacamento;
    }

    public static String validarFormatoContato(String contato) {
        if (contato == null || contato.trim().isEmpty()) return "none";

        String telefone = contato.replace(" ", "");

        if (telefone.length() != 14) return "none";

        for (int i = 0; i < telefone.length(); i++) {
            char caractere = telefone.charAt(i);

            if (i == 0) { if (caractere != '(') return "none"; }
            else if (i == 3) { if (caractere != ')') return "none"; }
            else if (i == 9) { if (caractere != '-') return "none"; }
            else { if (!Character.isDigit(caractere)) return "none"; }
        }

        return telefone;
    }

    public static String validarFormatoEmail(String email) {

        if (email == null || email.trim().isEmpty()) return "none";

        String emailSemEspacamento = email.replace(" ", "").toLowerCase();

        boolean temArroba = false;
        for (int i = 0; i < emailSemEspacamento.length(); i++) {
            if (emailSemEspacamento.charAt(i) == '@') {
                temArroba = true;
                break;
            }
        }
        if (!temArroba) return "none";
        return emailSemEspacamento;

    }

}
