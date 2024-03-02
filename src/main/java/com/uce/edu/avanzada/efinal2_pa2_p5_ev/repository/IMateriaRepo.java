package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Materia;

public interface IMateriaRepo {
    void insertar(Materia materia);
    Materia selectMateriaPorCodigo(String codigo);
}
