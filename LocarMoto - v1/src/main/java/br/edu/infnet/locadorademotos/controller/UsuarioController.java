package br.edu.infnet.locadorademotos.controller;

import br.edu.infnet.locadorademotos.model.repository.CustomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.locadorademotos.model.domain.Usuario;
import br.edu.infnet.locadorademotos.model.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@GetMapping(value = "/usuario")
	public String paginaCadastro() {
		return "usuario/cadastro";
	}
	@GetMapping(value = "/lista")
	public String paginaLista(Model model) {
		model.addAttribute("usuarios", UsuarioRepository.obterLista());
		return "usuario/lista";
	}
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		UsuarioRepository.incluir(usuario);
		return "redirect:/";
	}
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		Usuario usuario = UsuarioRepository.excluir(id);
		return "redirect:/usuario/lista";
	}
}