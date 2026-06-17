package br.com.bancoleais.Controller;

import java.util.Scanner;

public class GUI {
    static Scanner leia = new Scanner(System.in);

    public static int menu() {
        System.out.println("BANCO DIGITAL");
        System.out.println("1 -> Criar Conta");
        System.out.println("2 -> Acessar Conta");
        System.out.println("3 -> Editar Dados da Conta");
        System.out.println("4 -> Excluir Conta");
        System.out.println("0 -> Sair");
        System.out.println();

        System.out.print(">>>Escolha uma opção: ");
        return Integer.parseInt(leia.nextLine());
    }
}
