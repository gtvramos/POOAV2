package View;
import java.awt.BorderLayout;
import Model.Estoque;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Controller.EstoqueController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

public class CriarEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtQTD;
	private JLabel lblEstoque;
	private JTextField txtFileira;
	private JTextField txtCodigo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarEstoque frame = new CriarEstoque();
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
	public CriarEstoque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do produto:");
		lblNomeDoProduto.setFont(new Font("Calibri", Font.BOLD, 14));
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		txtQTD = new JTextField();
		txtQTD.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Calibri", Font.BOLD, 14));
		
		lblEstoque = new JLabel("ESTOQUE");
		lblEstoque.setFont(new Font("Calibri", Font.BOLD, 25));
		
		JButton btnEnviar = new JButton("Adicionar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EstoqueController controller = new EstoqueController();
				if(controller.criar(txtCodigo,txtNome,txtQTD,txtFileira)==1)JOptionPane.showMessageDialog(null,"Adicionado com Sucesso!");
				else {
					JOptionPane.showMessageDialog(null,"Erro ao adicionar!");
				}
			dispose();
			}
		});
		
		JLabel lblFileira = new JLabel("Fileira:");
		lblFileira.setFont(new Font("Calibri", Font.BOLD, 14));
		
		txtFileira = new JTextField();
		txtFileira.setColumns(10);
		
		JLabel lblCodigoDoProduto = new JLabel("Código do produto:");
		lblCodigoDoProduto.setFont(new Font("Calibri", Font.BOLD, 14));
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(199, Short.MAX_VALUE)
					.addComponent(btnEnviar)
					.addGap(138))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(170, Short.MAX_VALUE)
					.addComponent(lblEstoque)
					.addGap(154))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNomeDoProduto)
						.addComponent(lblCodigoDoProduto)
						.addComponent(lblQuantidade)
						.addComponent(lblFileira))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtFileira, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQTD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(166, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEstoque)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodigoDoProduto)
						.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeDoProduto)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtQTD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQuantidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtFileira, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFileira))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(btnEnviar)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
