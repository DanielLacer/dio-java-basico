package org.desapegados.model;

import java.util.Date;

public class OrdemDeServico {
    private int id;
    private Carro carro;
    private String descricao;
    private Date data;
    private double valor;

    // Construtor
    public OrdemDeServico(int id, Carro carro, String descricao, Date data, double valor) {
        this.id = id;
        this.carro = carro;
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para exibir informações da ordem de serviço
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Descrição: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Valor: " + valor);
    }
}
