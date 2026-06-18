package br.com.bancoleais.Controller;

import br.com.bancoleais.Model.Factory.Builder;
import br.com.bancoleais.Model.entidades.Cliente;
import br.com.bancoleais.Services.Validador;

import java.util.Scanner;

public class GUI {
    static Scanner leia = new Scanner(System.in);

    public static String menu() {
        System.out.println("BANCO DIGITAL");
        System.out.println("1 -> Criar Conta");
        System.out.println("2 -> Acessar Conta");
        System.out.println("3 -> Editar Dados da Conta");
        System.out.println("4 -> Excluir Conta");
        System.out.println("0 -> Sair");
        System.out.println();

        System.out.print(">>>Escolha uma opção: ");
        var escolhaDoUsuario = leia.nextLine();

        var isValid = Validador.validadorMenu(escolhaDoUsuario);
        while (!isValid) {
            escolhaDoUsuario = Validador.validarEntrada();
            isValid = Validador.validadorMenu(escolhaDoUsuario);
        }
        return escolhaDoUsuario;
    }

    public static Cliente getConta() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║          CADASTRO DE CLIENTE           ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  Preencha os dados abaixo com atenção. ║");
        System.out.println("╚════════════════════════════════════════╝");

        System.out.print("\n  ► Nome completo : ");
        String nome = leia.nextLine().trim();

        System.out.print("  ► CPF           : ");
        String cpf = leia.nextLine().trim();

        System.out.print("  ► Contato       : ");
        String contato = leia.nextLine().trim();

        System.out.print("  ► Email         : ");
        String email = leia.nextLine().trim();

        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║  ✔  Dados coletados com sucesso!                       ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");

        Cliente cliente = Builder.getCliente(nome, cpf, contato, email);
        cliente.getEndereco();

        return cliente;
    }
}
