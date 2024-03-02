package com.uce.edu.avanzada.efinal2_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.IEstudianteRepo;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.IMateriaRepo;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.IMatriculaRepo;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Matricula;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaControllerDTO;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaQueryDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private IMatriculaRepo iMatriculaRepo;

    @Override
    @Transactional(value = Transactional.TxType.REQUIRED)
    public void guardar(Matricula matricula) {
        matricula.setHilo(Thread.currentThread().getName().toString());
        matricula.setFechaRegistro(LocalDate.now());
        this.iMatriculaRepo.insertar(matricula);
    }

    @Override
    @Transactional(value = Transactional.TxType.NOT_SUPPORTED)
    public List<MatriculaQueryDTO> buscarTodas() {
        return this.iMatriculaRepo.selectReport();
    }

}
