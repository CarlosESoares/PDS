package br.com.assistec.controle;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.loja.assitec.model.LoginDAO;
import br.com.loja.assitec.model.Usuario;


public class LoginController {

	public LoginController() {

	}

	// Método para verificar se o banco está online
	public Boolean verificarBancoOnline() {
		LoginDAO dao = new LoginDAO();
		return dao.bancoOnline();
	}

	// Método que faz autenticação
	public ArrayList<String> autenticar(String login, String senha) throws SQLException {
		ArrayList<String> listaDados = new ArrayList<>();
		LoginDAO dao = new LoginDAO();
		Usuario user = dao.autenticar(login, senha);
		listaDados.add(0, user.getNome());
		listaDados.add(1, user.getPerfil());
		return listaDados;
	}

}