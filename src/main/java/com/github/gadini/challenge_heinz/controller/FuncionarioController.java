package com.github.gadini.challenge_heinz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.github.gadini.challenge_heinz.controller.dto.FormFuncionario;
import com.github.gadini.challenge_heinz.model.Funcionario;
import com.github.gadini.challenge_heinz.repository.FuncionarioRepository;

@Controller
@RequestMapping("funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@GetMapping("list")
	public String list(Model model) {
		List<Funcionario> funcionarios = 
				funcionarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
		model.addAttribute("funcionarios", funcionarios);
		return "funcionario/list";
	}
	
	@GetMapping()
	public String create(Model model) {
		model.addAttribute("funcionario", new FormFuncionario());
		return "funcionario/form";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute FormFuncionario funcionario) {		
		Funcionario entity = funcionario.toModel();
		
		funcionarioRepository.save(entity);
		return "redirect:/funcionarios";
	}

	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Funcionario entity = funcionarioRepository.findById(id).orElse(new Funcionario());
		
		FormFuncionario funcionario = new FormFuncionario().toForm(entity);
		
		model.addAttribute("funcionario", funcionario);
		return "funcionario/form";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		funcionarioRepository.deleteById(id);
		return "redirect:/funcionarios";
	}

}
