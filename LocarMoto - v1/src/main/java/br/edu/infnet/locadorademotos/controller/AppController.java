package br.edu.infnet.locadorademotos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping(value = "/")
	public String paginaIndex() {
		return "index";
	}
	@GetMapping(value = "/custom")
	public String paginaCustom() {
		return "produtos/cadastro/custom";
	}
	@GetMapping(value = "/trail")
	public String paginaTrail() {
		return "produtos/cadastro/trail";
	}
	@GetMapping(value = "/street")
	public String paginaStreet() {
		return "produtos/cadastro/street";
	}


}