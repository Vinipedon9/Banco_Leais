package br.com.bancoleais.Controller;

import br.com.bancoleais.UI.GraphicElements;

import java.sql.SQLException;


public class Main {
    static void main() throws SQLException {
        GraphicElements.BankHeader();
        var escolha = -1;

        while (escolha != 0) {
            escolha = GUI.menu();
        }
    }
}
