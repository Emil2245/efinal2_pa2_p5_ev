package com.uce.edu.avanzada.efinal2_pa2_p5_ev.repository.model.dto;

public class MatriculaControllerDTO {
    private String cedulaEstudiante;
    private String codigoMateria1;
    private String codigoMateria2;
    private String codigoMateria3;
    private String codigoMateria4;
    //cosntructor///////////////////////////////

    public MatriculaControllerDTO(String cedulaEstudiante, String codigoMateria1, String codigoMateria2, String codigoMateria3, String codigoMateria4) {
        this.cedulaEstudiante = cedulaEstudiante;
        this.codigoMateria1 = codigoMateria1;
        this.codigoMateria2 = codigoMateria2;
        this.codigoMateria3 = codigoMateria3;
        this.codigoMateria4 = codigoMateria4;
    }

    public MatriculaControllerDTO() {
    }

    //toString/////////////////////////////////////////

    //gettters&setters///////////////////////////////////////////


    public String getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    public void setCedulaEstudiante(String cedulaEstudiante) {
        this.cedulaEstudiante = cedulaEstudiante;
    }

    public String getCodigoMateria1() {
        return codigoMateria1;
    }

    public void setCodigoMateria1(String codigoMateria1) {
        this.codigoMateria1 = codigoMateria1;
    }

    public String getCodigoMateria2() {
        return codigoMateria2;
    }

    public void setCodigoMateria2(String codigoMateria2) {
        this.codigoMateria2 = codigoMateria2;
    }

    public String getCodigoMateria3() {
        return codigoMateria3;
    }

    public void setCodigoMateria3(String codigoMateria3) {
        this.codigoMateria3 = codigoMateria3;
    }

    public String getCodigoMateria4() {
        return codigoMateria4;
    }

    public void setCodigoMateria4(String codigoMateria4) {
        this.codigoMateria4 = codigoMateria4;
    }
}
