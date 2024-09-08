package org.desapegados.controller;

import org.desapegados.model.Carro;
import org.desapegados.model.Cliente;

public class Controller {
    public void someMethod() {
        // Instanciando o objeto da classe Cliente
        Cliente cliente = new Cliente("João", "123.456.789-00");
        Carro carro = new Carro("Toyota", "Supra", 2021, "BRA2232");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        
        System.out.println("Marca do carro: " + carro.getMarca());
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Ano do carro: " + carro.getAno());
        System.out.println("Placa do carro: " + carro.getPlaca());
    }
}
