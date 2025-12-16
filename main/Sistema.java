/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 */
import java.util.ArrayList;
import java.util.Collections;

public class Sistema {
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Veiculo> veiculos;

    public Sistema(Entrada e) {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.gerentes = new ArrayList<>();
        this.veiculos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
    
    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }
    
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public void adicionar(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void adicionar(Gerente gerente){
        this.gerentes.add(gerente);
    }
    
    public void adicionar(Vendedor vendedor){
        this.vendedores.add(vendedor);
    }
    
    public void adicionar(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    public void listarClientes() {
        System.out.println("Clientes cadastrados:");

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
        }
        else {
            for (Cliente c : this.clientes) {
                System.out.println(c);
            }
        }
    }
    
    public void listarVendedores() {
        System.out.println("Vendedores cadastrados:");

        if (vendedores.isEmpty()) {
            System.out.println("Nenhum vendedor cadastrado");
        }
        else {
            for (Vendedor v : this.vendedores) {
                System.out.println(v);
            }
        }
    }
    
    public void listarGerentes() {
        System.out.println("Gerentes cadastrados:");

        if (gerentes.isEmpty()) {
            System.out.println("Nenhum gerente cadastrado");
        }
        else {
            for (Gerente g : this.gerentes) {
                System.out.println(g);
            }
        }
    }
    
    public void listarVeiculos() {
        int c = 1;
        System.out.println("Veiculos cadastrados:");

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo cadastrado");
        }
        else {
            for (Veiculo v : this.veiculos) {
                System.out.println(c + ") " + v);
                c++; //hahaha
            }
        }
    }

    public Cliente localizarCliente(String cpf) {
        for (Cliente c : this.clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public Vendedor localizarVendedor(String cpf) {
        for (Vendedor v : this.vendedores) {
            if (v.getCpf().equals(cpf)) {
                return v;
            }
        }
        return null;
    }
    
    public Gerente localizarGerente(String cpf) {
        for (Gerente g : this.gerentes) {
            if (g.getCpf().equals(cpf)) {
                return g;
            }
        }
        return null;
    }
    
    public void atribuirVendaVendedor(Venda venda, Vendedor vencedor) {
        vencedor.getVendidos().add(venda);
    }
    
    public void relatorio(int mes, int ano){
        double valor = 0;
        for (Vendedor vendedor : this.getVendedores()) {
            for (Venda v : vendedor.getVendidos()) {
                if (v.getData().getMes()==mes && v.getData().getAno()==ano) {
                    System.out.println("Vendedor: " + vendedor + " (Salário neste mês: " + vendedor.getSalario(mes, ano) + ")");
                    System.out.println(v);
                    valor+=v.valor();
                    System.out.println("***************************************");
                }
            }
        }
        System.out.println("Total: R$" + valor);
    } 
    
    public void relatorio(int ano) {
        double valor = 0;
        for (Vendedor vendedor : this.getVendedores()) {
            for (Venda v : vendedor.getVendidos()) {
                if (v.getData().getAno()==ano) {
                    System.out.println("Vendedor: " + vendedor);
                    System.out.println(v);
                    valor+=v.valor();
                    System.out.println("***************************************");
                }
            }
        }
        System.out.println("Total: R$" + valor);
    }
    
    public void relatorio(Vendedor vendedor) {
        System.out.println("Vendas do vendedor " + vendedor.getNome() + " :");
        double valor = 0;
        for (Venda venda : vendedor.getVendidos()) {
            System.out.println(venda);
            valor+=venda.valor();
            System.out.println("***************************************");
        }
        System.out.println("Total: R$" + valor);
    } 
}

