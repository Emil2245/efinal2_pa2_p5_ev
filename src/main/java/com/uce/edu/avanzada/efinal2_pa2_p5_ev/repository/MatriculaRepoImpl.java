package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Estudiante;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Materia;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Matricula;
import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaQueryDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(value = Transactional.TxType.MANDATORY)
    public void insertar(Matricula matricula) {
        matricula.setEstudiante(this.entityManager.find(Estudiante.class,matricula.getEstudiante().getId()));
        matricula.setMateria(this.entityManager.find(Materia.class,matricula.getMateria().getId()));
        this.entityManager.persist(matricula);
    }

    @Override
    @Transactional(value = Transactional.TxType.NOT_SUPPORTED)
    public List<MatriculaQueryDTO> selectReport() {
        return this.entityManager
                .createQuery("SELECT NEW com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto.MatriculaQueryDTO(e.cedula, m.codigo,matricula.fechaRegistro, matricula.hilo) FROM Materia m, Estudiante e, Matricula matricula",
                MatriculaQueryDTO.class).getResultList();
    }
}
