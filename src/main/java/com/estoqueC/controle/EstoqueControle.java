/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.controle;

import com.estoqueC.modelo.Produto;
import com.estoqueC.service.EstoqueService;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class EstoqueControle {
  public boolean adicionar(Produto produto) throws SQLException{
        EstoqueService estoqueService = new EstoqueService();
        return estoqueService.adicionar(produto);
    } 
public Produto consultarNome(Produto produto) throws SQLException {
        EstoqueService estoqueService = new EstoqueService();
        return estoqueService.consultarNome(produto);
    }  
public boolean atualizar(Produto produto) throws SQLException{
        EstoqueService estoqueService = new EstoqueService();
        return estoqueService.atualizar(produto);
    }
public boolean excluir(Produto produto) throws SQLException{
        EstoqueService estoqueService = new EstoqueService();
        return estoqueService.excluir(produto);
    }

 public ArrayList<Produto> consultar() throws SQLException {
         EstoqueService estoqueService = new EstoqueService();
        return estoqueService.consultar();
    }
 public Produto consultarProduto(Produto produto) throws SQLException {
        EstoqueService estoqueService = new EstoqueService();
        return estoqueService.consultarNome(produto);
    }  
}