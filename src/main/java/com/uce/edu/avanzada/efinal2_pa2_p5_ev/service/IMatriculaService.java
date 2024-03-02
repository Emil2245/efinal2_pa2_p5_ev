package com.uce.edu.avanzada.efinal2_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Matricula;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaControllerDTO;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaQueryDTO;

import java.util.List;

public interface IMatriculaService {
    List<MatriculaQueryDTO> buscarTodas();
    void guardar(Matricula matricula);

}
