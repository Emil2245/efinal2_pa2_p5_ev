package com.uce.edu.avanzada.efinal2_pa2_p5_ev.controller;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Estudiante;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Matricula;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaControllerDTO;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaQueryDTO;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.service.IEstudianteService;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.service.IMateriaService;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private IMatriculaService iMatriculaService;
    @Autowired
    private IEstudianteService iEstudianteService;
    @Autowired
    private IMateriaService iMateriaService;

    @PostMapping("/insertar")
    public String insertar(MatriculaControllerDTO matriculaControllerDTO) {
        Matricula matricula1 = new Matricula();
        Matricula matricula2 = new Matricula();
        Matricula matricula3 = new Matricula();
        Matricula matricula4 = new Matricula();

        List<Matricula> lista = new ArrayList<>();

        Estudiante estudiante = this.iEstudianteService
                .buscarEstudiantePorCedula(matriculaControllerDTO.getCedulaEstudiante());

        lista.add(matricula1);
        lista.add(matricula2);
        lista.add(matricula3);
        lista.add(matricula4);

        matricula1.setMateria(this.iMateriaService.buscarMateriaPorCodigo(matriculaControllerDTO.getCodigoMateria1()));
        matricula2.setMateria(this.iMateriaService.buscarMateriaPorCodigo(matriculaControllerDTO.getCodigoMateria2()));
        matricula3.setMateria(this.iMateriaService.buscarMateriaPorCodigo(matriculaControllerDTO.getCodigoMateria3()));
        matricula4.setMateria(this.iMateriaService.buscarMateriaPorCodigo(matriculaControllerDTO.getCodigoMateria4()));

        lista.parallelStream().forEach(matriculaLista -> {
            matriculaLista.setEstudiante(estudiante);
        });

        lista.parallelStream().forEach(this.iMatriculaService::guardar);

        return "redirect:/matriculas/nuevaMatricula";
    }

    //http://localhost:8080/matriculas/nuevaMatricula
    @GetMapping("/nuevaMatricula")
    public String mostrarNuevaMatricula(Model model) {
        model.addAttribute("matriculaControllerDTO", new MatriculaControllerDTO());
        return "vistaNuevaMatricula";
    }

    //http://localhost:8080/matriculas/buscarTodos
    @GetMapping("/buscarTodos")
    public String buscarTodos(Model model) {
        List<MatriculaQueryDTO> lista = this.iMatriculaService.buscarTodas();
        model.addAttribute("matriculasDTO", lista);
        return "vistaListaMatriculas";
    }

}
