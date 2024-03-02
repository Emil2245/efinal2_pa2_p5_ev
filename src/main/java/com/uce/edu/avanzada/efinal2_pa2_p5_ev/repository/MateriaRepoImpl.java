package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.Materia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class MateriaRepoImpl implements IMateriaRepo{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(value = Transactional.TxType.MANDATORY)
    public void insertar(Materia materia) {
        this.entityManager.persist(materia);
    }
    @Override
    @Transactional(value = Transactional.TxType.NOT_SUPPORTED)
    public Materia selectMateriaPorCodigo(String codigo) {
        return this.entityManager.createQuery("select m from Materia m where m.codigo=:codigo", Materia.class)
                .setParameter("codigo",codigo)
                .getResultList().get(0);
    }
}
