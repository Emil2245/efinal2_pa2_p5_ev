package com.uce.edu.avanzada.efinal2_pa2_p5_ev.controller;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Materia;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/materias")
public class MateriaController {

    @Autowired
    private IMateriaService iMateriaService;

    @PostMapping("/insertar")
    public String insertar(Materia materia){
        this.iMateriaService.guardar(materia);
        return "redirect:/materias/nuevaMateria";
    }
    //http://localhost:8080/materias/nuevaMateria
    @GetMapping("/nuevaMateria")
    public String mostraruevaMateria(Model model) {
        model.addAttribute("materia", new Materia());
        return "vistaNuevaMateria";
    }

}
