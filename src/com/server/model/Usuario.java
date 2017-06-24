package com.server.model;

public class Usuario {

	private Integer idUsuario;
	private String email;
	private String senha;
	private String dataCadastro;
	private String qtdeVitorias;

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDataEntrada() {
		return dataCadastro;
	}

	public void setDataEntrada(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getQtdeVitorias() {
		return qtdeVitorias;
	}

	public void setQtdeVitorias(String qtdeVitorias) {
		this.qtdeVitorias = qtdeVitorias;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((qtdeVitorias == null) ? 0 : qtdeVitorias.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		if (qtdeVitorias == null) {
			if (other.qtdeVitorias != null)
				return false;
		} else if (!qtdeVitorias.equals(other.qtdeVitorias))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", senha=" + senha + ", dataEntrada="
				+ dataCadastro + ", qtdeVitorias=" + qtdeVitorias + "]";
	}

}
