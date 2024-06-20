/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoqueC.service;

import com.estoqueC.dao.PrateleiraDao;
import com.estoqueC.modelo.Prateleira;
import com.estoqueC.modelo.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author kayqu
 */
public class PrateleiraService {
    
      public boolean inserir(Produto produto) throws SQLException{
        PrateleiraDao prateleiraDao = new PrateleiraDao();
        return prateleiraDao.inserir(produto);
    }
      
      public ArrayList<Prateleira> exibir() throws SQLException {
        PrateleiraDao prateleiraDao = new PrateleiraDao();
        return prateleiraDao.exibir();
      }
       public boolean excluir(Prateleira prateleira) throws SQLException{
        PrateleiraDao prateleiraDao = new PrateleiraDao();
        return prateleiraDao.excluir(prateleira);
    }
       public Produto consultarNome(Produto produto) throws SQLException{
        PrateleiraDao prateleiraDao = new PrateleiraDao();
        return prateleiraDao.consultarNome(produto);
    }
   
       public ArrayList<Prateleira> consultar(Prateleira prateleira) throws SQLException{
          PrateleiraDao prateleiraDao = new PrateleiraDao();
          return prateleiraDao.consultar(prateleira);
      }
}
