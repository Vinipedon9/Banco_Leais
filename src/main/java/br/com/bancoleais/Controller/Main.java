package br.com.bancoleais.Controller;

import br.com.bancoleais.UI.GraphicElements;

import java.sql.SQLException;


public class Main {
    static void main() throws SQLException {
        GraphicElements.BankHeader();

        while (true) {
            GUI.menu();
        }
    }
}
