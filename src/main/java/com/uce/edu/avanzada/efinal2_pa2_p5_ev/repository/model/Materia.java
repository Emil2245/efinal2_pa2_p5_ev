package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @SequenceGenerator(name = "generator_materia", allocationSize = 1,sequenceName = "seq_materia_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_materia")
    @Column(name = "mate_id")
    private Integer id;
    private String nombre;
    private String codigo;
    private Integer creditos;
    private String cedulaProfesor;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "materia")
    private List<Matricula> matriculas ;

    /////////////////////////////////////////////


    /////////////////////////////////////////////

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public String getCedulaProfesor() {
        return cedulaProfesor;
    }

    public void setCedulaProfesor(String cedulaProfesor) {
        this.cedulaProfesor = cedulaProfesor;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
