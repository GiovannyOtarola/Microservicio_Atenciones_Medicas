package com.example.demo;

public class AtencionMedica {
    private int numeroAtencion;
    private String fecha;
    private String diagnostico;


    public AtencionMedica(int numeroAtencion, String fecha, String diagnostico){
        this.numeroAtencion = numeroAtencion;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
    }

    //getters
    public int getNumeroAtencion(){
        return numeroAtencion;
    }

    public String getFecha(){
        return fecha;
    }

    public String getDiagnostico(){
        return diagnostico;
    }

}
