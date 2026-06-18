package br.com.bancoleais.Model.Factory;

import br.com.bancoleais.Model.entidades.Cliente;

public class Builder {
    public static Cliente getCliente(String nomeDoCLiente, String cpf, String numero, String email) {
        return new Cliente(nomeDoCLiente, cpf, numero, email);
    }
}
