package telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TFUsuario;
	private JTextField TFSenha;
	
	private String user = "heitor";
	private String senha = "123";
	private Usuario usuario;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setResizable(false); // proibe de expandir a tela
		
		setLocationRelativeTo(null); // abre a tela centralizada no monitor
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setBounds(108, 76, 60, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(108, 122, 46, 14);
		contentPane.add(lblSenha);
		
		TFUsuario = new JTextField();
		TFUsuario.setBounds(185, 73, 107, 20);
		contentPane.add(TFUsuario);
		TFUsuario.setColumns(10);
		
		TFSenha = new JTextField();
		TFSenha.setBounds(185, 119, 107, 20);
		contentPane.add(TFSenha);
		TFSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario = new Usuario(TFUsuario.getText(), TFSenha.getText()); //criando o objeto usuario passando user e senha
				
				if(usuario.getUsuario().equals(user) && usuario.getSenha().equals(senha)){ //verifica se o que foi digitado é igual as classes
					JOptionPane.showMessageDialog(null, "Login autorizado");
					JOptionPane.showMessageDialog(null, usuario.getMsg());
				} else {
					JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos");
				}
				
			}
		});
		btnEntrar.setBounds(150, 190, 89, 23);
		contentPane.add(btnEntrar);
	}
}
