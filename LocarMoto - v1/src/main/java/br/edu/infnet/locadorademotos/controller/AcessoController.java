package br.edu.infnet.locadorademotos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.locadorademotos.model.domain.Usuario;
import br.edu.infnet.locadorademotos.model.repository.AcessoRepository;

@Controller
@SessionAttributes("usuario")
public class AcessoController {

	@GetMapping(value = "/login")
	public String paginaLogin() {
		return "login";
	}
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		Usuario user = new Usuario(email, senha);
		user = AcessoRepository.autenticar(user);
		if(user != null) {
			model.addAttribute("usuario", user);
			return "redirect:/";
		}
		model.addAttribute("mensagem", "Verifique as informações e tente novamente.");
		return paginaLogin();
	}
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("usuario");
		return "redirect:/";
	}
}
