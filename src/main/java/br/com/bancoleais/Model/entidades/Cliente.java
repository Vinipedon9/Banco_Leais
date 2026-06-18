package br.com.bancoleais.Model.entidades;

import static br.com.bancoleais.Controller.GUI.leia;

public class Cliente {
    public String nomeCompleto;
    public String cpf;
    public String numeroDeContato;
    public String email;
    public String endereco;
    public String cep;
    public String sexo;

    public Cliente (String nomeCompleto, String cpf, String numeroDeContato, String email){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.numeroDeContato = numeroDeContato;
        this.email = email;
    }

    public void getEndereco(String endereco, String cep) {
        this.endereco = endereco;
        this.cep = cep;
    }

    public void getSexo(String sexo) {
        this.sexo = sexo;
    }
}
