package com.uce.edu.avanzada.efinal2_pa2_p5_ev.controller;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Estudiante;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/estudiantes")
public class EstudianteController {

    @Autowired
    private IEstudianteService iEstudianteService;

    @PostMapping("/insertar")
    public String insertar(Estudiante estudiante){
        this.iEstudianteService.guardar(estudiante);
        return "redirect:/estudiantes/nuevoEstudiante";
    }
    //http://localhost:8080/estudiantes/nuevoEstudiante
    @GetMapping("/nuevoEstudiante")
    public String mostrarNuevoEstudiante(Model model ) {
        model.addAttribute("estudiante", new Estudiante());
        return "vistaNuevoEstudiante";
    }

}
