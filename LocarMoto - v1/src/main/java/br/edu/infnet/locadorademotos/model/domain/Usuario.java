package br.edu.infnet.locadorademotos.model.domain;

public class Usuario {

	private Integer id;
	private String nome;
	private String senha;
	private String email;
	private int cnh;
	private int cpf;



	public Usuario() {
	}
	
	public Usuario(String email, String senha) {
		this();
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	public Usuario(String nome, String email, String senha) {
		this(email, senha);
		this.setNome(nome);
	}

	@Override
	public String toString() {

		return String.format(
				"O usuário %s do email %s e %s, tem a CNH %d e o CPF %d.",
				nome,
				email,
				senha,
				cnh,
				cpf
			);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}