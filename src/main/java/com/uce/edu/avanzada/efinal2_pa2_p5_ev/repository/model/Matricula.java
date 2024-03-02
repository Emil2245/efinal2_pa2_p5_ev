package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "matricula")
public class Matricula {
    @Id
    @SequenceGenerator(name = "generator_matricula", allocationSize = 1,sequenceName = "seq_matricula_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_matricula")
    @Column(name = "matr_id")
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "matr_id_ materia")
    private Materia materia;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "matr_id_ estudiante")
    private Estudiante estudiante;
    @Column(name = "matr_hilo")
    private String hilo;
    @Column(name = "matr_fecha_registro")
    private LocalDate fechaRegistro;

    ////////////////////////////////////////////////////

    ////////////////////////////////////////////////////

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getHilo() {
        return hilo;
    }

    public void setHilo(String hilo) {
        this.hilo = hilo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
