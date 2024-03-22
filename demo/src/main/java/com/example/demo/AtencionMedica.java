package com.example.demo;

public class AtencionMedica {
    private int id;
    private String fecha;
    private String diagnostico;


    public AtencionMedica(int id, String fecha, String diagnostico){
        this.id = id;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
    }

    //getters
    public int getId(){
        return id;
    }

    public String getFecha(){
        return fecha;
    }

    public String getDiagnostico(){
        return diagnostico;
    }

}
