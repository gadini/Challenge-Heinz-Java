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

import com.github.gadini.challenge_heinz.controller.dto.FormConsumo;
import com.github.gadini.challenge_heinz.model.Consumo;
import com.github.gadini.challenge_heinz.repository.ConsumoRepository;

@Controller
@RequestMapping("consumos")
public class ConsumoController {
	
	@Autowired
	private ConsumoRepository consumoRepository;

	@GetMapping("list")
	public String list(Model model) {
		List<Consumo> consumos = 
				consumoRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
		model.addAttribute("consumos", consumos);
		return "consumo/list";
	}
	
	@GetMapping()
	public String create(Model model) {
		model.addAttribute("consumo", new FormConsumo());
		return "consumo/form";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute FormConsumo consumo) {		
		Consumo entity = consumo.toModel();
		
		consumoRepository.save(entity);
		return "redirect:/consumos";
	}

	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Consumo entity = consumoRepository.findById(id).orElse(new Consumo());
		
		FormConsumo consumo = new FormConsumo().toForm(entity);
		
		model.addAttribute("consumo", consumo);
		return "consumo/form";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		consumoRepository.deleteById(id);
		return "redirect:/consumos";
	}

}
