package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto;

import java.time.LocalDate;

public class MatriculaQueryDTO {
    private String cedulaEstudiante;
    private String codigoMateria;
    private LocalDate fechaMatricula;
    private String hilo;

    //cosntructor///////////////////////////////

    public MatriculaQueryDTO() {
    }

    public MatriculaQueryDTO(String cedulaEstudiante, String codigoMateria, LocalDate fechaMatricula, String hilo) {
        this.cedulaEstudiante = cedulaEstudiante;
        this.codigoMateria = codigoMateria;
        this.fechaMatricula = fechaMatricula;
        this.hilo = hilo;
    }
    //toString/////////////////////////////////////////

    @Override
    public String toString() {
        return "MatriculaDTO{" +
                "cedulaEstudiante='" + cedulaEstudiante + '\'' +
                ", codigoMateria='" + codigoMateria + '\'' +
                ", fechaMatricula=" + fechaMatricula +
                ", hilo='" + hilo + '\'' +
                '}';
    }
    //gettters&setters///////////////////////////////////////////

    public String getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    public void setCedulaEstudiante(String cedulaEstudiante) {
        this.cedulaEstudiante = cedulaEstudiante;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getHilo() {
        return hilo;
    }

    public void setHilo(String hilo) {
        this.hilo = hilo;
    }
}
