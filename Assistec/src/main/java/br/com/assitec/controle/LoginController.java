package br.com.assitec.controle;

import javax.swing.JOptionPane;

import br.com.loja.assistec.view.LoginView;
import br.com.loja.assitec.model.UsuarioModel;

public class LoginController {

	
	private LoginView view;
	
	private UsuarioModel model;
	
	public LoginController(LoginView view) {
		this.view = view;
		this.model = new UsuarioModel();
		
		if(model.conexao != null) {
			System.out.println("Conectado no banco");
			view.lblStatys.setText("Conectado");
			
		}else {
			view.lblStatys.setText("Nao conectado no banco");
			System.out.println("nao conectado");
		}
		this.view.btnLogin.addActionListener(e -> logar());
	}
	
	public void logar() {
		String Login = view.txtLogin.getText();
		String senha = new  String(view.Senhafield.getPassword());
		String perfil = model.autenticar(Login,senha);
		
		if(perfil != null) {
			JOptionPane.showMessageDialog(null, "Usuario pode assecar o sistema");
		}else {
			JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos ou os 2");
		}
		
	}
	
}
