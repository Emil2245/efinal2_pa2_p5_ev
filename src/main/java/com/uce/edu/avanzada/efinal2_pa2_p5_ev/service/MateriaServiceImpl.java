package com.uce.edu.avanzada.efinal2_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.IMateriaRepo;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Materia;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaServiceImpl implements IMateriaService {

    @Autowired
    private IMateriaRepo iMateriaRepo;

    @Override
    public Materia buscarMateriaPorCodigo(String codigo) {
        return this.iMateriaRepo.selectMateriaPorCodigo(codigo);
    }

    @Override
    @Transactional(value = Transactional.TxType.REQUIRED)
    public void guardar(Materia materia) {
        this.iMateriaRepo.insertar(materia);
    }
}
