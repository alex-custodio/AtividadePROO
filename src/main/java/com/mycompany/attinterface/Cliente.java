package com.mycompany.attinterface;

/**
 *
 * @author Alex da Silva Custódio
 * Turma: 912
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco; // Rua, cep, cidade
    private String dataNascimento; 
    private String escolaridade;
    private String sexo;
    @Override
    public String toString() {
        return "\nNome: " + this.nome + ", \nCPF: " + this.cpf + ", \nEndereço: " + this.endereco.toString() + ", \nData de Nascimento: " + this.dataNascimento + ", \nEscolaridade: " + this.escolaridade + ", \nSexo: " + this.sexo;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEscolaridade() {
        return this.escolaridade;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Cliente(String nome, String cpf, Endereco endereco, String dataNascimento, String escolaridade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
        this.sexo = sexo;
    }
}
