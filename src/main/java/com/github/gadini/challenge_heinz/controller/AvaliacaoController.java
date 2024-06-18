package com.github.gadini.challenge_heinz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.gadini.challenge_heinz.controller.dto.FormAvaliacao;
import com.github.gadini.challenge_heinz.model.Avaliacao;
import com.github.gadini.challenge_heinz.repository.AvaliacaoRepository;

@Controller
@RequestMapping("avaliacoes")
public class AvaliacaoController {
	
	@Autowired
	private AvaliacaoRepository avaliacaoRepository;

	@GetMapping("list")
	public String list(Model model) {
		List<Avaliacao> avaliacoes = 
				avaliacaoRepository.findAll(Sort.by(Sort.Direction.ASC, "nomeUsuario"));
		model.addAttribute("avaliacoes", avaliacoes);
		return "avaliacao/list";
	}
	
	@GetMapping()
	public String create(Model model) {
		model.addAttribute("avaliacao", new FormAvaliacao());
		return "avaliacao/form";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute FormAvaliacao avaliacao) {		
		Avaliacao entity = avaliacao.toModel();
		
		avaliacaoRepository.save(entity);
		return "redirect:/avaliacoes";
	}

	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Avaliacao entity = avaliacaoRepository.findById(id).orElse(new Avaliacao());
		
		FormAvaliacao avaliacao = new FormAvaliacao().toForm(entity);
		
		model.addAttribute("avaliacao", avaliacao);
		return "avaliacao/form";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		avaliacaoRepository.deleteById(id);
		return "redirect:/avaliacoes";
	}

}
