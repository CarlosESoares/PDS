 package br.com.loja.assistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtLogin;
	public JPasswordField Senhafield;
	public JButton btnLogin;
	public JLabel lblStatys;
	/**
	 * Create the frame.
	 */
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][][]", "[][][][][][][][][]"));
		
		JLabel lblLogin = new JLabel("Login");
		contentPane.add(lblLogin, "cell 1 1");
		
		txtLogin = new JTextField();
		contentPane.add(txtLogin, "cell 1 2,growx");
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		contentPane.add(lblSenha, "cell 1 3");
		
		Senhafield = new JPasswordField();
		contentPane.add(Senhafield, "cell 1 4,growx");
		
		btnLogin = new JButton("Logar");
		contentPane.add(btnLogin, "cell 1 6");
		
		lblStatys = new JLabel("");
		
		contentPane.add(lblStatys, "cell 1 8");
		
	}

}
