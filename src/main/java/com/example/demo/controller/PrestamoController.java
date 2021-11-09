package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import com.example.demo.entity.Prestamo;
import com.example.demo.service.ClienteService;
import com.example.demo.service.LibroService;
import com.example.demo.service.PrestamoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prestamos")
public class PrestamoController {
    
    @Autowired
    private PrestamoService prestamoService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private LibroService libroService;

    @RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", prestamoService.getAll());
		return "prestamos";
	}

    @GetMapping("/prestamo-from/{id}")
    public String showSave(@PathVariable("id") String id, Model model){
        model.addAttribute("listaLibros", libroService.getAll());
        model.addAttribute("listaClientes", clienteService.getAll());

        
        char [] num_id = id.toCharArray();
		String id_num = "";
		for (int i = 0; i < 8; i++) {
			if (Character.isDigit(num_id[i])) {
				id_num=id_num+num_id[i];
			}
		}

		Long idn = Long.valueOf(id_num);

		if(idn != 0) {
			model.addAttribute("prestamo", prestamoService.get(id));
		}else {
			model.addAttribute("prestamo", new Prestamo());	
		}
		return "prestamo-from";
    }

    @PostMapping("/prestamo-from")
    public String save(Prestamo prestamo, ModelMap model){
        model.addAttribute("listaLibros", libroService.getAll());
        model.addAttribute("listaClientes", clienteService.getAll());
        
        prestamo.setFechaPrestamo(prestamoService.obtenerFecha());

        if (prestamoService.validarId(prestamo)) {
            if (prestamoService.validarFecha(prestamo.getFechaDevolucion())) {
                prestamoService.save(prestamo);
                model.put("exito", "Prestamo modificado");
                return "prestamo-from";
            }else{
                model.put("error", "Error la fecha de devolucion es menor o igual a la fecha de emision");
                return "prestamo-from";
            }
            
        } else {
            prestamo.setFechaPrestamo(prestamoService.obtenerFecha());
            if (prestamoService.validarFecha(prestamo.getFechaDevolucion())) {
                prestamoService.save(prestamo);
                model.put("exito", "Prestamo guardado");
                return "prestamo-from";    
            }else{
                model.put("error", "Error la fecha de devolucion es menor o igual a la fecha de emision");
                return "prestamo-from";
            }
        }
    }

    @GetMapping("/prestamo-delete/{id}")
    public String delete (@PathVariable("id") String id, Model mole){
        prestamoService.delete(id);
        return "redirect:/";
    }

}
