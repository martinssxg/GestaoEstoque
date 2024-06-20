/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.modelo;
/**
 *
 * @author user
 */
public class Produto {
     private int codigo;
    private String nome;
    private String descricao;
    private int quantidade;
    private int quantidadePrateleira;
    private double preco;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int id) {
        this.codigo = id;
    }
    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getQuantidadePrateleira() {
        return quantidadePrateleira;
    }

    public void setQuantidadePrateleira(int quantidadePrateleira) {
        this.quantidadePrateleira = quantidadePrateleira;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
   

    
}