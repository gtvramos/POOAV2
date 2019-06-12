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


public class EstoqueController {
	public int criar(JTextField txtNome,JTextField txtQTD , JTextField txtFileira)
	{
		try {
			Conexao con = new Conexao();
			String query = "INSERT INTO estoque( nome ,QTD,fileira ) VALUES ('" + txtNome.getText() + "','" + Integer.parseInt(txtQTD.getText()) + "','" + txtFileira.getText() + "')";
			Statement st = con.conexao.createStatement();
			st.executeUpdate(query);
			con.conexao.close();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}
		
	public int editar(JTextField txtNome,JTextField txtQTD)
		{
			try {
				Conexao con = new Conexao();
				Statement st = con.conexao.createStatement();
				String query = "UPDATE estoque SET QTD='"+Integer.parseInt(txtQTD.getText())+"' where Nome='" + txtNome.getText()+"'";
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
			String query = "DELETE FROM estoque where Nome='" + txtNome.getText()+"'";
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
	public static void listarEstoque() throws Exception{
		Statement st;
		Conexao con = new Conexao();
		st = con.conexao.createStatement();
		ResultSet rs = st.executeQuery("SELECT nome, QTD , fileira FROM estoque");
		while (rs.next()) {
			JOptionPane.showMessageDialog(null,"Nome: " +rs.getString(1) + "\nQTD: "+ rs.getString(2)+ "\nFileira: " + rs.getString(3) );
			}
		}
}
	
