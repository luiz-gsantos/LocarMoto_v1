package br.edu.infnet.locadorademotos.controller;

import org.springframework.stereotype.Controller;
import br.edu.infnet.locadorademotos.model.domain.Custom;
import br.edu.infnet.locadorademotos.model.domain.Street;
import br.edu.infnet.locadorademotos.model.domain.Trail;
import br.edu.infnet.locadorademotos.model.repository.CustomRepository;
import br.edu.infnet.locadorademotos.model.repository.StreetRepository;
import br.edu.infnet.locadorademotos.model.repository.TrailRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutosController {

    @PostMapping(value = "/incluircustom")
    public String incluirCustom(Custom custom) {
        CustomRepository.incluir(custom);
        return "redirect:/";
    }
    @GetMapping(value = "/produtos/{id}/excluircustom")
    public String excluirCustom(@PathVariable Integer id) {
        Custom custom = CustomRepository.excluir(id);
        return "produtos/cadastro/custom";
    }
    @PostMapping(value = "/incluirtrail")
    public String incluirTrail(Trail trail) {
        TrailRepository.incluir(trail);
        return "redirect:/";
    }
    @GetMapping(value = "/produtos/{id}/excluirtrail")
    public String excluirTrail(@PathVariable Integer id) {
        Trail trail = TrailRepository.excluir(id);
        return "produtos/cadastro/trail";
    }
    @PostMapping(value = "/incluirstreet")
    public String incluirStreet(Street street) {
        StreetRepository.incluir(street);
        return "redirect:/";
    }
    @GetMapping(value = "/produtos/{id}/excluirstreet")
    public String excluirStreet(@PathVariable Integer id) {
        Street street = StreetRepository.excluir(id);
        return "produtos/cadastro/street";
    }
    @GetMapping(value = "/customlista")
    public String paginaCustomLista(Model model) {
        model.addAttribute("customs", CustomRepository.chamarLista());
        return "produtos/lista/listacustom";
    }
    @GetMapping(value = "/traillista")
    public String paginaTrailLista(Model model) {
        model.addAttribute("trails", TrailRepository.chamarLista());
        return "produtos/lista/listatrail";
    }
    @GetMapping(value = "/streetlista")
    public String paginaStreetLista(Model model) {
        model.addAttribute("streets", StreetRepository.chamarLista());
        return "produtos/lista/listastreet";
    }
}