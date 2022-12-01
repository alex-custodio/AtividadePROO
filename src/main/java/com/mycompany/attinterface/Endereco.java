package com.mycompany.attinterface;

/**
 *
 * @author Alex da Silva Custódio
 * Turma: 912
 */
public class Endereco {
    private String rua;
    private String cep;
    private String cidade;
    @Override
    public String toString() {
        return "Rua: " + this.rua + ", \nCEP: " + this.cep + ", \nCidade: " + this.cidade;
    }
    public String getRua() {
        return this.rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCep() {
        return this.cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Endereco(String rua, String cep, String cidade) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }
}
