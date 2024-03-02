package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Matricula;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaQueryDTO;

import java.util.List;

public interface IMatriculaRepo {
    void insertar(Matricula matricula);

    List<MatriculaQueryDTO> selectReport();
}
