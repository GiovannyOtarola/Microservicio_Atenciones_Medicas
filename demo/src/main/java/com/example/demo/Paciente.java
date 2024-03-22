package com.example.demo;
import java.util.List;

public class Paciente {
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    private List<AtencionMedica> atencionMedica;


    public Paciente(int id, String rut, String nombre, String apellido,int edad, List<AtencionMedica> atencionMedica){
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.atencionMedica = atencionMedica;
    }

    // getters

    public int getId(){
        return id;
    }

    public String getRut(){
        return rut;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public List <AtencionMedica> getAtencionMedica(){
        return atencionMedica;
    }


}
