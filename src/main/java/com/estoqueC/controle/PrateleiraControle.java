/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.controle;
import com.estoqueC.modelo.Prateleira;
import com.estoqueC.modelo.Produto;
import com.estoqueC.service.PrateleiraService;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author kayqu
 */
public class PrateleiraControle {
     public boolean inserir(Produto produto) throws SQLException{
        PrateleiraService prateleiraService = new PrateleiraService();
        return prateleiraService.inserir(produto);
    }
     
     public ArrayList<Prateleira> exibir() throws SQLException {
         PrateleiraService prateleiraService = new PrateleiraService();
        return prateleiraService.exibir();
    }
     public boolean excluir(Prateleira prateleira) throws SQLException{
        PrateleiraService prateleiraService = new PrateleiraService();
        return prateleiraService.excluir(prateleira);
    }
public Produto consultarNome(Produto produto) throws SQLException {
        PrateleiraService prateleiraService = new PrateleiraService();
        return prateleiraService.consultarNome(produto);
    }  

public ArrayList<Prateleira> consultar(Prateleira prateleira) throws SQLException{
        PrateleiraService prateleiraService = new PrateleiraService();
        return prateleiraService.consultar(prateleira);
    }
}
