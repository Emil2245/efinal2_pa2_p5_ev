package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Estudiante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional(value = Transactional.TxType.MANDATORY)
    public void insertar(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    @Transactional(value = Transactional.TxType.NOT_SUPPORTED)
    public Estudiante selectEstudiantePorCedula(String cedula) {
        return this.entityManager.createQuery("select e from Estudiante e where e.cedula=:cedula", Estudiante.class)
                .setParameter("cedula",cedula).getResultList().get(0);
    }
}
