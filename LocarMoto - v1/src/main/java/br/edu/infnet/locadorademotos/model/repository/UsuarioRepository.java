package br.edu.infnet.locadorademotos.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.locadorademotos.model.domain.Usuario;

public class UsuarioRepository {
	private static Integer id = 1;
	private static Map<Integer, Usuario> mapaUsuario = new HashMap<Integer, Usuario>();
	public static boolean incluir(Usuario usuario) {
		usuario.setId(id++);
			mapaUsuario.put(usuario.getId(), usuario);
			return true;
	}
	public static Usuario excluir(Integer key) {
		return mapaUsuario.remove(key);
	}
	public static Collection<Usuario> obterLista(){
		return mapaUsuario.values();
	}
}