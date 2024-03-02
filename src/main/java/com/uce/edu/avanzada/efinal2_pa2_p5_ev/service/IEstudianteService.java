package com.uce.edu.avanzada.efinal2_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Estudiante;

public interface IEstudianteService {
    void guardar(Estudiante estudiante);
    Estudiante buscarEstudiantePorCedula(String cedula);
}
