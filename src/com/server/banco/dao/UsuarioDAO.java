package com.server.banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.server.model.Usuario;

public class UsuarioDAO {

	public static boolean acesso;

	public Usuario acesso(String email, String senha) {
		
		Usuario user = new Usuario();
		
		Connection conn = null;
		Statement consulta = null;
		ResultSet tabela = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_aula", "root", "");
			consulta = (Statement) conn.createStatement();
		
			tabela = consulta.executeQuery(
					"SELECT idUsuario, email, senha, dataCadastro, qtdeVitorias from tbl_jogador WHERE email='"
							+ email + "'and senha='" + senha + "'");

			if (tabela.next()) {
				user.setIdUsuario(tabela.getInt("idUsuario"));
				user.setEmail(tabela.getString("email"));
				user.setSenha(tabela.getString("senha"));
				user.setDataEntrada(tabela.getString("dataCadastro"));
				user.setQtdeVitorias(tabela.getString("qtdeVitorias"));
				
				acesso = true;
			} else {
				
				acesso = false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
		return user;

	}
	
}
