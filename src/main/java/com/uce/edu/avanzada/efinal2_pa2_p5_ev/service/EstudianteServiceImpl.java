package com.uce.edu.avanzada.efinal2_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.IEstudianteRepo;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Estudiante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteRepo iEstudianteRepo;
    @Override
    @Transactional(value = Transactional.TxType.REQUIRED)
    public void guardar(Estudiante estudiante) {
        this.iEstudianteRepo.insertar(estudiante);
    }

    @Override
    public Estudiante buscarEstudiantePorCedula(String cedula) {
        return this.iEstudianteRepo.selectEstudiantePorCedula(cedula);
    }
}
