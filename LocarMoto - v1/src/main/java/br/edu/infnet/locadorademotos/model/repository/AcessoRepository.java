package br.edu.infnet.locadorademotos.model.repository;

import br.edu.infnet.locadorademotos.model.domain.Usuario;

public class AcessoRepository {

	public static Usuario autenticar(Usuario usuario) {
		if(usuario.getEmail().equalsIgnoreCase(usuario.getSenha())) {
			return new Usuario("Gerente", usuario.getEmail(), usuario.getSenha());
		}
		return null;
	}
}
