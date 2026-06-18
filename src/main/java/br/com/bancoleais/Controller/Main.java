package br.com.bancoleais.Controller;

import br.com.bancoleais.Model.entidades.Cliente;
import br.com.bancoleais.UI.GraphicElements;

import java.sql.SQLException;


public class Main {
    static void main() throws SQLException {
        GraphicElements.BankHeader();

        while (true) {
            var escolhaDoUsuarioValidada = GUI.menu();
            var escolhaDoUsuario = Integer.parseInt(escolhaDoUsuarioValidada);

            if (escolhaDoUsuario == 0) {
                break;
            }
            switch (escolhaDoUsuario) {
                case 1 -> {
                    Cliente cliente = GUI.getConta();
                }
            }

        }
    }
}
