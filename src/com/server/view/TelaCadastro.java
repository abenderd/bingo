package com.server.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.server.banco.dao.CadastroDAO;
import com.server.banco.database.Conexao;
import com.server.banco.dbo.CadastroDBO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 189);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(28, 37, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(28, 66, 51, 14);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmaoDeSenha = new JLabel("Confirma\u00E7\u00E3o:");
		lblConfirmaoDeSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConfirmaoDeSenha.setBounds(236, 66, 99, 14);
		contentPane.add(lblConfirmaoDeSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				CadastroDAO cadastroDao = new CadastroDAO();
				
				String email = textFieldEmail.getText();
				String senha = passwordField.getText();
				String confirmacaoSenha = passwordField_1.getText();
				
				if (email.isEmpty()){
					JOptionPane.showMessageDialog(null, "Campo email deve ser preenchido.");
					limparCampos();
				}
				else if (cadastroDao.validaEmail(email) == false){
					JOptionPane.showMessageDialog(null, "Email invalido");
					limparCampos();
				}
				else if (senha.isEmpty()){
					JOptionPane.showMessageDialog(null, "Campo senha deve ser preenchido.");
					limparCampos();
				}
				else if (confirmacaoSenha.isEmpty()){
					JOptionPane.showMessageDialog(null, "Campo confirmação de senha deve ser preenchido.");
					limparCampos();
				}
				else if (senha.equals(confirmacaoSenha)){
			
					CadastroDBO dbos = new CadastroDBO(email, senha);
					
					try {
						Conexao.cadastroDao.cadastro(dbos);
					}
					catch (Exception erro ) {
						System.out.println(erro);
					}
					
					TelaLogin login = new TelaLogin();
					login.show();
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha e confirmação de senha não conferem.");
					limparCampos();
				}
				
				
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrar.setBounds(114, 110, 103, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin login = new TelaLogin();
				login.show();
				dispose();
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(278, 110, 103, 23);
		contentPane.add(btnCancelar);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(89, 34, 384, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(89, 65, 137, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(336, 65, 137, 20);
		contentPane.add(passwordField_1);
	}
	
	public void limparCampos() {
		textFieldEmail.setText("");
		passwordField.setText("");
		passwordField_1.setText("");
	}
}
