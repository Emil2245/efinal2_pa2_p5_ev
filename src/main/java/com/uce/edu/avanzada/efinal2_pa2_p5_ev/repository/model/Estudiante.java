package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @SequenceGenerator(name = "generator_estudiante", allocationSize = 1,sequenceName = "seq_estudiante_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_estudiante")
    @Column(name = "estu_id")
    private Integer id;
    @Column(name = "estu_nombre")
    private String nombre;
    @Column(name = "estu_apellido")
    private String apellido;
    @Column(name = "estu_cedula")
    private String cedula;
    @Column(name = "estu_direccion")
    private String direccion;
    @Column(name = "estu_telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "estudiante")
    private List<Matricula> matriculas;

    /////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
