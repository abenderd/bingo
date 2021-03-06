package com.server.banco.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.server.banco.database.Conexao;
import com.server.banco.database.MeuResultSet;
import com.server.banco.dbo.CadastroDBO;

public class CadastroDAO {

	public void cadastro(CadastroDBO dbos) throws Exception {
		
		String dataAtual = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
	    if(dbos==null)
	        throw new Exception ("Cadastro nulo");

		try {
			String sql = "INSERT INTO tbl_jogador (email, senha, dataCadastro, qtdeVitorias) VALUES (?,?,?,?)";

            Conexao.conexao.prepareStatement (sql);
            Conexao.conexao.setString(1, dbos.getEmail());
            Conexao.conexao.setString(2, dbos.getSenha());
            Conexao.conexao.setString(3, dataAtual);
            Conexao.conexao.setString(4, "0");
            Conexao.conexao.executeUpdate ();
            Conexao.conexao.commit        ();
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
		}
		catch(SQLException e) {
        JOptionPane.showMessageDialog(null,"Erro ao realizar cadastro." + e);
        }
	}
	
	public boolean validaEmail(String email) {
		{
	        boolean isEmailIdValid = false;
	        if (email != null && email.length() > 0) {
	            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	            Matcher matcher = pattern.matcher(email);
	            if (matcher.matches()) {
	                isEmailIdValid = true;
	            }
	        }
	        return isEmailIdValid;
	    }
	}
	
	public CadastroDBO getEmail (String usuario) throws SQLException, Exception {
		CadastroDBO cadastroDBO = null;
	    String sql;

	    try {
	    	sql = "SELECT * " +
	    			"FROM tbl_jogador " +
	                  "WHERE email = ?";

	            Conexao.conexao.prepareStatement (sql);

	            Conexao.conexao.setString (1, usuario);

	            MeuResultSet resultado = (MeuResultSet)Conexao.conexao.executeQuery();

	            if (!resultado.first())
	                throw new Exception ("Usuario nao cadastrado.");

	            cadastroDBO = new CadastroDBO (resultado.getString("email"),
	                                    resultado.getString("senha"));
	                             
	        }
	       catch (Exception e) {
	             e.printStackTrace();
	        }

	        return cadastroDBO;

	}
	
}
