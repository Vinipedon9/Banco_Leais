package br.com.bancoleais.Services;

import static br.com.bancoleais.Services.Validador.*;

public class ValidarEntradas {

    public static String validarNome(String nome) {
        boolean validado = isAlphabetic(nome);
        while (!validado) {
            System.out.println("╔══════════════════════════════════════════════════════════╗");
            System.out.println("║  ✘  Nome inválido! Use apenas letras do alfabeto.        ║");
            System.out.println("╚══════════════════════════════════════════════════════════╝");

            System.out.print("\n  ► Nome completo : ");
            nome = leia.nextLine();
            validado = isAlphabetic(nome);
        }
        return nome;
    }

    public static String validarCpf(String cpf) {
        cpf = validarFormatoCpf(cpf);
        while (cpf.equals("none")) {
            System.out.println("╔══════════════════════════════════════════════════════════╗");
            System.out.println("║  ✘  CPF inválido! Use o formato: 000.000.000-00          ║");
            System.out.println("╚══════════════════════════════════════════════════════════╝");
            System.out.print("  ► CPF           : ");
            cpf = validarFormatoCpf(leia.nextLine());
        }
        return cpf;
    }

    public static String validarEntradaAoMenu() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║  ✘  Entrada inválida! Digite apenas valores de 1 a 4.    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.print(">>>Escolha uma opção: ");
        return leia.nextLine();
    }
}
