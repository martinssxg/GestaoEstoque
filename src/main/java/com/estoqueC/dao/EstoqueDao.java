/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.dao;

import com.estoqueC.modelo.Produto;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
/**
 *
 * @author user
 */
public class EstoqueDao {
    public boolean adicionar(Produto produto) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        
        String query = "INSERT INTO Estoque (Nome, Descricao, Quantidade, Preco) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setDouble(4, produto.getPreco());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            conexao.desconectar(connection);
        }
    }

    public Produto consultarNome(Produto produto) throws SQLException {
    Produto produtoRetorno = new Produto();   
    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    String query = "SELECT * FROM estoque WHERE nome like '" + produto.getNome() + "'";
    
    try (PreparedStatement statement = connection.prepareStatement(query)) {
       
        ResultSet retorno = statement.executeQuery();
        
        while (retorno.next()) {
            produtoRetorno.setNome(retorno.getString("Nome"));
            produtoRetorno.setDescricao(retorno.getString("Descricao"));
            produtoRetorno.setQuantidade(retorno.getInt("Quantidade"));
            produtoRetorno.setPreco(retorno.getDouble("Preco"));
        }
    } catch (SQLException e) {
        System.err.println("Erro de SQL: " + e.getMessage());
        throw new SQLException("Erro ao consultar o produto pelo nome", e);
    } finally {
        connection.close();  // Fechar a conexão para evitar vazamento de recursos
    }
    
    return produtoRetorno;
}
    
   

public boolean atualizar(Produto produto) throws SQLException {
    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    boolean retorno = false;
    
    String query = "UPDATE ESTOQUE SET "
                 + "descricao = ?, "
                 + "quantidade = ?, "
                 + "preco = ? "
                 + "WHERE nome = ?";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, produto.getDescricao());
        statement.setInt(2, produto.getQuantidade());
        statement.setDouble(3, produto.getPreco());
        statement.setString(4, produto.getNome());

        int rowsUpdated = statement.executeUpdate();
        retorno = rowsUpdated > 0; // Retorna true se pelo menos uma linha foi atualizada
    } catch (SQLException ex) {
        ex.printStackTrace(); // Imprime o stack trace para ajudar no debug
        retorno = false;
    } finally {
        conexao.desconectar(connection);
    }

    return retorno;
}

public Produto consultarQuantidade(Connection connection, Produto produto) throws SQLException {
    Produto produtoRetorno = null;
    String query = "SELECT quantidade FROM estoque WHERE nome = ?";
    
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, produto.getNome());
        ResultSet retorno = statement.executeQuery();
        
        if (retorno.next()) {
            produtoRetorno = new Produto();
            produtoRetorno.setNome(produto.getNome());
            produtoRetorno.setQuantidade(retorno.getInt("quantidade"));
        }
    }
    
    return produtoRetorno;
}


public boolean atualizarQuantidade(Connection connection, int quantidade, String nome) throws SQLException {
        //Conexao conexao = new Conexao();
        //Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "UPDATE ESTOQUE SET "
                + "quantidade =  "  +    quantidade 
                + " where nome = '" +  nome + "'";
        
        try {
            Statement statement = connection.createStatement();
            retorno =  statement.execute(query);
            retorno = true;
        }catch (SQLException ex) {
            retorno = false;
        } 
        
        return retorno;
    }

public boolean excluir(Produto produto) throws SQLException {
    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    boolean retorno = false;
    
    String query = "DELETE FROM estoque WHERE nome = ?";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, produto.getNome());

        int rowsDeleted = statement.executeUpdate();
        retorno = rowsDeleted > 0; // Retorna true se pelo menos uma linha foi excluída
    } catch (SQLException ex) {
        ex.printStackTrace(); // Imprime o stack trace para ajudar no debug
        retorno = false;
    } finally {
        conexao.desconectar(connection);
    }

    return retorno;
}
//mostra os produtos da tabela estoque - marley
   public ArrayList<Produto> consultar() throws SQLException {
    ArrayList<Produto> listProduto = new ArrayList<Produto>();

    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    String query = "SELECT * FROM estoque";
    Statement statement = connection.createStatement();
    ResultSet retorno = statement.executeQuery(query);

    while (retorno.next()) {
        Produto produtoRetorno = new Produto();
        
        produtoRetorno.setNome(retorno.getString("Nome"));
        produtoRetorno.setDescricao(retorno.getString("Descricao"));
        produtoRetorno.setQuantidade(retorno.getInt("Quantidade"));
        produtoRetorno.setPreco(retorno.getDouble("Preco"));
        listProduto.add(produtoRetorno);
    }

    return listProduto;
}
   
   public Produto consultarProduto(Produto produto) throws SQLException {
    Produto produtoRetorno = new Produto();   
    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    String query = "SELECT * FROM estoque WHERE nome like '" + produto.getNome() + "'";
    
    try (PreparedStatement statement = connection.prepareStatement(query)) {
       
        ResultSet retorno = statement.executeQuery();
        
        while (retorno.next()) {
            produtoRetorno.setNome(retorno.getString("Nome"));
            produtoRetorno.setDescricao(retorno.getString("Descricao"));
            produtoRetorno.setQuantidade(retorno.getInt("Quantidade"));
            produtoRetorno.setPreco(retorno.getDouble("Preco"));
        }
    } catch (SQLException e) {
        System.err.println("Erro de SQL: " + e.getMessage());
        throw new SQLException("Erro ao consultar o produto pelo nome", e);
    } finally {
        connection.close();  // Fechar a conexão para evitar vazamento de recursos
    }
    
    return produtoRetorno;
}
}