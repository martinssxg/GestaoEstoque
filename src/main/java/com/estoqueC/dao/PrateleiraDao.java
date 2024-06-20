/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.dao;
import com.estoqueC.modelo.Prateleira;
import com.estoqueC.modelo.Produto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author kayqu
 */
public class PrateleiraDao {

    public boolean inserir(Produto produto) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        EstoqueDao estoqueDao = new EstoqueDao();
        
        String query = "INSERT INTO Prateleira (Nome, Descricao, QuantidadePrateleira, Preco) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setInt(3, produto.getQuantidadePrateleira());
            stmt.setDouble(4, produto.getPreco());
            stmt.executeUpdate();
           
           
            produto = estoqueDao.consultarQuantidade(connection, produto); // select quantidade from estoque where nome = produto.getNome()
            
            // Atualizar a quantidade
            int quantidade = produto.getQuantidade() - produto.getQuantidadePrateleira();
            estoqueDao.atualizarQuantidade(connection, quantidade, produto.getNome()); // update estoque set quantidade = ? where nome = ?
                    
            return true;
        } catch (SQLException ex) {
            System.out.print(ex);
            return false;
        } finally {
            conexao.desconectar(connection);
        }
    }
    
    // mostra todos os dados da tabela prateleira em uma tabela no view - marley
    public ArrayList<Prateleira> exibir() throws SQLException {
    ArrayList<Prateleira> listPrateleira = new ArrayList<Prateleira>();

    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    String query = "SELECT * FROM prateleira";
    Statement statement = connection.createStatement();
    ResultSet retorno = statement.executeQuery(query);

    while (retorno.next()) {
        Prateleira prateleiraRetorno = new Prateleira();
        
        prateleiraRetorno.setNome(retorno.getString("Nome"));
        prateleiraRetorno.setDescricao(retorno.getString("Descricao"));
        prateleiraRetorno.setQuantidadePrateleira(retorno.getInt("QuantidadePrateleira"));
        prateleiraRetorno.setPreco(retorno.getDouble("Preco"));
        listPrateleira.add(prateleiraRetorno);
    }

    return listPrateleira;
}
    // exclui um produto da prateleira - marley
    public boolean excluir(Prateleira prateleira) throws SQLException { 
    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    boolean retorno = false;
    
    String query = "DELETE FROM prateleira WHERE nome = ?";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, prateleira.getNome());

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
    
    public Produto consultarNome(Produto produto) throws SQLException {
    Produto produtoRetorno = new Produto();   
    Conexao conexao = new Conexao();
    Connection connection = conexao.conectar();
    String query = "SELECT * FROM prateleira WHERE nome like '" + produto.getNome() + "'";
    
    try (PreparedStatement statement = connection.prepareStatement(query)) {
       
        ResultSet retorno = statement.executeQuery();
        
        while (retorno.next()) {
            produtoRetorno.setNome(retorno.getString("Nome"));
            produtoRetorno.setDescricao(retorno.getString("Descricao"));
            produtoRetorno.setQuantidadePrateleira(retorno.getInt("QuantidadePrateleira"));
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
    
    
     
     public ArrayList<Prateleira> consultar(Prateleira prateleira) throws SQLException {
        ArrayList<Prateleira> listPrateleira = new ArrayList<Prateleira>();
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM prateleira where nome like '" + prateleira.getNome() + "%'";
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);

        
          
        while (retorno.next()){
            Prateleira prateleiraRetorno = new Prateleira();  
                prateleiraRetorno.setCodigo(retorno.getInt("Codigo"));
                prateleiraRetorno.setNome(retorno.getString("Nome"));
                prateleiraRetorno.setDescricao(retorno.getString("Descricao"));
                prateleiraRetorno.setQuantidadePrateleira(retorno.getInt("QuantidadePrateleira"));
                prateleiraRetorno.setPreco(retorno.getDouble("Preco"));
                listPrateleira.add(prateleiraRetorno);
        }
        
        return listPrateleira;
    }
     
     
}


