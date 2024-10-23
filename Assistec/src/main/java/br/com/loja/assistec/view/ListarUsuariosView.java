package br.com.loja.assistec.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

import br.com.loja.assitec.model.Usuario;
import br.com.loja.assitec.model.UsuarioTableModel;

public class ListarUsuariosView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtLocalizar;
	private JTable table;
	private ArrayList<Usuario> usuariosList;
	private ListarUsuariosView listarUsarioView;
	private UsuarioTableModel usuarioTableModel;
	private TableRowSorter<UsuarioTableModel> rowSorter;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarUsuariosView frame = new ListarUsuariosView();
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
	public ListarUsuariosView() {
		this.listarUsarioView = this;
		usuarioList = new ArrayList<>();
		
		
		setTitle("Listagem de usuários");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarUsuariosView cadUser = 
						new CadastrarUsuariosView();
				cadUser.setLocationRelativeTo(cadUser);
				cadUser.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				cadUser.setVisible(true);
			}
		});
		btnCadastrar.setBounds(10, 38, 117, 23);
		getContentPane().add(btnCadastrar);
		
		txtLocalizar = new JTextField();
		txtLocalizar.setBounds(139, 39, 252, 20);
		getContentPane().add(txtLocalizar);
		txtLocalizar.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(189, 216, 89, 23);
		getContentPane().add(btnFechar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 72, 371, 133);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}