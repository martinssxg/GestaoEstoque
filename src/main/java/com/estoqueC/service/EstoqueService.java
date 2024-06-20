/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.service;

import com.estoqueC.dao.EstoqueDao;
import com.estoqueC.modelo.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class EstoqueService {
    public boolean adicionar(Produto produto) throws SQLException{
        EstoqueDao estoqueDao = new EstoqueDao();
        return estoqueDao.adicionar(produto);
    }
    public Produto consultarNome(Produto produto) throws SQLException{
        EstoqueDao estoqueDao = new EstoqueDao();
        return estoqueDao.consultarNome(produto);
    }
     public boolean atualizar(Produto produto) throws SQLException{
        EstoqueDao estoqueDao = new EstoqueDao();
        return estoqueDao.atualizar(produto);
    }
      public boolean excluir(Produto produto) throws SQLException{
        EstoqueDao estoqueDao = new EstoqueDao();
        return estoqueDao.excluir(produto);
    }
     public ArrayList<Produto> consultar() throws SQLException {
        EstoqueDao estoqueDao = new EstoqueDao();
        return estoqueDao.consultar();
      }
     public Produto consultarProduto(Produto produto) throws SQLException{
        EstoqueDao estoqueDao = new EstoqueDao();
        return estoqueDao.consultarNome(produto);
    }
}

