package Controller;
import Banco.Conexao;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JTable;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class ProdutoController {
	public int criar(JTextField txtNome,JTextField txtCodigo , JTextField txtPreco)
	{
		try {
			Conexao con = new Conexao();
			String query = "INSERT INTO produto( nome,codigo,preco) VALUES ('" + txtNome.getText() + "','" + Integer.parseInt(txtCodigo.getText()) + "','" + txtPreco.getText() + "')";
			Statement st = con.conexao.createStatement();
			st.executeUpdate(query);
			con.conexao.close();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}
		
	public int editar(JTextField txtNome,JTextField txtPreco)
		{
			try {
				Conexao con = new Conexao();
				Statement st = con.conexao.createStatement();
				String query = "UPDATE produto SET Preco='"+Integer.parseInt(txtPreco.getText())+"' where Nome='" + txtNome.getText()+"'";
				st = con.conexao.createStatement();
				st.executeUpdate(query);
				con.conexao.close();
				return 1;
			} catch (SQLException e) {
				System.out.println("DE");
				e.printStackTrace();
			} 
			return 0;
}
	public int remover(JTextField txtNome)
	{
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			String query = "DELETE FROM produto where Nome='" + txtNome.getText()+"'";
			st = con.conexao.createStatement();
			st.executeUpdate(query);
			con.conexao.close();
			return 1;
		} catch (SQLException e) {
			System.out.println("DR");
			e.printStackTrace();
		} 
		return 0;
	}
	public static void listarProduto() throws Exception{
		Statement st;
		Conexao con = new Conexao();
		st = con.conexao.createStatement();
		ResultSet rs = st.executeQuery("SELECT codigo,nome,preco FROM produto");
		while (rs.next()) {
			JOptionPane.showMessageDialog(null,"Codigo: " +rs.getString(1) + "\nNome: "+ rs.getString(2)+ "\nPreco: " + rs.getString(3) );
			}
		}
}
	
