package com.uce.edu.avanzada.efinal2_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Materia;

public interface IMateriaService {
    void guardar(Materia materia);
    Materia buscarMateriaPorCodigo(String codigo);

}
