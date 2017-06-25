package com.server.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.server.banco.dao.UsuarioDAO;
import com.server.model.Usuario;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(139, 124, 103, 23);
		contentPane.add(btnNewButton);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(93, 42, 231, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Entrar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				
				Usuario usuario = new Usuario();
				
				usuario = usuarioDAO.acesso(textFieldEmail.getText(), passwordField.getText());

				String email = textFieldEmail.getText();
				String senha = passwordField.getText();
				
				if (email.isEmpty()){
					JOptionPane.showMessageDialog(null, "Campo email deve ser preenchido.");
				}
				else if (senha.isEmpty()){
					JOptionPane.showMessageDialog(null, "Campo senha deve ser preenchido.");
				}

				else if (UsuarioDAO.acesso) {
					JOptionPane.showMessageDialog(null, "Usuario Logado: " + usuario.getEmail());
					
					TelaJogo jogo = new TelaJogo();
					jogo.show();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Email e/ou Senha Incorretos");
				}
			}
		});
		btnNewButton_1.setBounds(10, 124, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				TelaCadastro cadastro = new TelaCadastro();
				cadastro.show();
				dispose();
			
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrar.setBounds(267, 124, 103, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(36, 43, 63, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(36, 80, 63, 14);
		contentPane.add(lblSenha);
		
		JLabel lblRecordesDoMs = new JLabel("Recordes do M\u00EAs");
		lblRecordesDoMs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRecordesDoMs.setBounds(130, 165, 127, 14);
		contentPane.add(lblRecordesDoMs);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(118, 190, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblVitrias = new JLabel("Vit\u00F3rias");
		lblVitrias.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVitrias.setBounds(221, 191, 46, 14);
		contentPane.add(lblVitrias);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setBounds(118, 215, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setBounds(118, 236, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("-");
		lblNewLabel_2.setBounds(118, 257, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setBounds(221, 216, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("-");
		lblNewLabel_4.setBounds(221, 236, 63, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("-");
		lblNewLabel_5.setBounds(221, 257, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(93, 79, 231, 20);
		contentPane.add(passwordField);
	}
}
