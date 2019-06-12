package View;
import Controller.ProdutoController;
import Controller.EstoqueController;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class PaginaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicial frame = new PaginaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaginaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 250, 354, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEstoque = new JLabel("Estoque");
		lblEstoque.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JButton btnEstoqueCriar = new JButton("Criar");
		btnEstoqueCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CriarEstoque view = new CriarEstoque();
				view.setVisible(true);
				dispose();
			}
		});
		
		JButton btnEstoqueEditar = new JButton("Editar");
		btnEstoqueEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditarEstoque view = new EditarEstoque();
				view.setVisible(true);
				dispose();
			}
		});
		
		JButton btnEstoqueRemover = new JButton("Remover");
		btnEstoqueRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RemoverEstoque view = new RemoverEstoque();
				view.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JButton btnProdutoCriar = new JButton("Criar");
		btnProdutoCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CriarProduto view = new CriarProduto();
				view.setVisible(true);
				dispose();
			}
		});
		
		JButton btnProdutoEditar = new JButton("Editar");
		btnProdutoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditarProduto view = new EditarProduto();
				view.setVisible(true);
				dispose();
			}
		});
		
		JButton btnProdutoRemover = new JButton("Remover");
		btnProdutoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RemoverProduto view = new RemoverProduto();
				view.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblPginaInicial = DefaultComponentFactory.getInstance().createTitle("P\u00E1gina Inicial");
		lblPginaInicial.setFont(new Font("Calibri", Font.BOLD, 25));
		
		JButton btnEstoqueListar = new JButton("Listar");
		btnEstoqueListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EstoqueController controller = new EstoqueController();
					controller.listarEstoque();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JButton btnProdutoListar = new JButton("Listar");
		btnProdutoListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProdutoController controller = new ProdutoController();
					controller.listarProduto();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(96)
							.addComponent(lblPginaInicial))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(btnEstoqueEditar, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
							.addComponent(btnProdutoEditar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnEstoqueListar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnEstoqueRemover, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnProdutoListar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnProdutoRemover, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addComponent(lblEstoque)
					.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
					.addComponent(lblProduto)
					.addGap(33))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(btnEstoqueCriar, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addComponent(btnProdutoCriar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblPginaInicial)
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEstoque)
						.addComponent(lblProduto))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEstoqueCriar)
						.addComponent(btnProdutoCriar))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEstoqueEditar)
						.addComponent(btnProdutoEditar))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEstoqueRemover)
						.addComponent(btnProdutoRemover))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEstoqueListar)
						.addComponent(btnProdutoListar))
					.addGap(7))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
