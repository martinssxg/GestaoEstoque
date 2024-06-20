/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.modelo;

/**
 *
 * @author pgiov
 */
public class Prateleira {

    private int codigo;
    private String nome;
    private String descricao;
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
    
    public int getQuantidadePrateleira() {
        return quantidadePrateleira;
    }

    public void setQuantidadePrateleira(int quantidadePrateleira) {
        this.quantidadePrateleira = quantidadePrateleira;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
  }