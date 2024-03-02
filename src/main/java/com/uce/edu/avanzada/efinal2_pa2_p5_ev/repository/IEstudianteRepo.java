package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Estudiante;

public interface IEstudianteRepo {
    void insertar(Estudiante estudiante);
    Estudiante selectEstudiantePorCedula(String cedula);
}
