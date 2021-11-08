package com.example.demo.controller;

import com.example.demo.entity.Cliente;
import com.example.demo.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", clienteService.getAll());
		return "clientes";
	}

	@GetMapping("/cliente-from/{id}")
	public String showSave(@PathVariable("id") String id, Model model){
		char [] num_id = id.toCharArray();
		String id_num = "";
		for (int i = 0; i < 8; i++) {
			if (Character.isDigit(num_id[i])) {
				id_num=id_num+num_id[i];
			}
		}

		Long idn = Long.valueOf(id_num);

		if(idn != 0) {
			model.addAttribute("cliente", clienteService.get(id));
		}else {
			model.addAttribute("cliente", new Cliente());	
		}
		return "cliente-from";
	}

	@PostMapping("/cliente-from")
	public String save (Cliente cliente, ModelMap model){
		if (!clienteService.validarId(cliente)) {
			if (!clienteService.validarDni(cliente)) {
				model.put("exito", "Cliente Guardado");
				clienteService.save(cliente);
				return "cliente-from";
			}else{
				model.put("error", "El Cliente ya se encuentra cargado");
				return "cliente-from";
			}
		} else {
			model.put("exito", "Cliente modificado");
			clienteService.save(cliente);
			return "cliente-from";
		}
	}

	@GetMapping("/cliente-delete/{id}")
	public String delete(@PathVariable("id") String id, Model model){
		clienteService.delete(id);
		return "redirect:/";
	}

}
