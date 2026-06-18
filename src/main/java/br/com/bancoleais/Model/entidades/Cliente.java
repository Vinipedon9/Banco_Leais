package br.com.bancoleais.Model.entidades;

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

    public void getEndereco() {
        //endereço com numero ou S/N
        //CEP
    }

    public void getSexo() {
        //Lista de sexo
    }
}
