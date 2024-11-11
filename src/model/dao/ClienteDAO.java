/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import com.mysql.cj.jdbc.Blob;
import connection.ConnectionFactory;
//import java.awt.List;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cliente;

public class ClienteDAO {
    public void create(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement("Insert into dados_clientes (nome, cpf_cnpj,email,telefone,imagem,rua,numero,complemento,cep,observacao)values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getEmail());
            pst.setString(4, c.getTelefone());
            pst.setString(6, c.getRua());
            pst.setString(7, c.getNumero());
            pst.setString(8, c.getComplemento());
            pst.setString(9, c.getCep());
            pst.setString(10, c.getObservacao());
            
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        } catch (SQLException e) {
            //Logger.getLogger(ClienteDAO.class.getNam()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+e);
        }
        finally{
            ConnectionFactory.closeConnection(con, pst);
        }
    }
    public void read(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = con.prepareStatement("select * from dado_cliente");
            rs = pst.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf_cnpj"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setImagem((Blob) rs.getBlob("imagem"));
                cliente.setRua(rs.getString("rua"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setCep(rs.getString("cep"));
                cliente.setObservacao(rs.getString("observacao"));
            }
        } catch (SQLException e) {
              Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
              
        } finally {
            return;
        }
    }
    public void update (Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement("update dados_clientes set nome = ?, email = ?, telefone = ?, imagem = ?, rua = ?, numero = ?, complemento = ?, cep = ?, observacao = ? where id = ? ");
            pst.setString(1, c.getNome());
            pst.setString(2, c.getEmail());
            pst.setString(3, c.getTelefone());
            pst.setBlob(4, c.getImagem());
            pst.setString(5, c.getRua());
            pst.setString(6, c.getNumero());
            pst.setString(7, c.getComplemento());
            pst.setString(8, c.getCep());
            pst.setString(9, c.getObservacao());
            
            pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException e) {
            //Logger.getLogger(ClienteDAO.class.getNam()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar"+e);
        }
        finally{
            ConnectionFactory.closeConnection(con, pst);
        }
    }
    public void delete (Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement("delete from dados_cliente where id =? ");
            pst.setInt(1, c.getId());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException e) {
            //Logger.getLogger(ClienteDAO.class.getNam()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+e);
        } finally {
            ConnectionFactory.closeConnection(con, pst);
        }
    }
}
