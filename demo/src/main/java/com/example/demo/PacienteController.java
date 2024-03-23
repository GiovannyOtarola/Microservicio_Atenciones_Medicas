package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {
    private List<Paciente> pacientes = new ArrayList<>();
        
    public PacienteController(){
        List<AtencionMedica> atencionMedicasid1 = new ArrayList<>();
        List<AtencionMedica> atencionMedicasid2 = new ArrayList<>();
        List<AtencionMedica> atencionMedicasid3 = new ArrayList<>();
        List<AtencionMedica> atencionMedicasid4 = new ArrayList<>();
        List<AtencionMedica> atencionMedicasid5 = new ArrayList<>();

        atencionMedicasid1.add(new AtencionMedica(1, "20/03/24", "Dolor de espalda"));
        atencionMedicasid1.add(new AtencionMedica(2, "27/04/25", "Dolor de pecho"));
        pacientes.add(new Paciente(1, "22456782-k", "Pedro", "Fernandes", 33, atencionMedicasid1));

        atencionMedicasid2.add(new AtencionMedica(1, "21/07/22", "Dolor de barriga"));
        atencionMedicasid2.add(new AtencionMedica(2, "28/01/24", "Trauma cabeza"));
        pacientes.add(new Paciente(2, "9205725-0", "Juan", "Peres", 55, atencionMedicasid2));
        
        atencionMedicasid3.add(new AtencionMedica(1, "17/07/22", "Dolor de barriga"));
        atencionMedicasid3.add(new AtencionMedica(2, "09/01/24", "Trauma cabeza"));
        pacientes.add(new Paciente(3, "9205725-0", "Matias", "Gonzalez", 23, atencionMedicasid3));
        
        atencionMedicasid4.add(new AtencionMedica(1, "21/07/22", "Dolor de barriga"));
        atencionMedicasid4.add(new AtencionMedica(2, "28/01/24", "Trauma cabeza"));
        pacientes.add(new Paciente(4, "9205725-0", "Pepe", "Peron", 64, atencionMedicasid4));

        atencionMedicasid5.add(new AtencionMedica(1, "28/09/22", "Dolor de barriga"));
        atencionMedicasid5.add(new AtencionMedica(2, "02/01/24", "Trauma cabeza"));
        atencionMedicasid5.add(new AtencionMedica(3, "08/01/24", "Trauma pierna"));
        pacientes.add(new Paciente(5, "9205725-0", "Diego", "Lopez", 17, atencionMedicasid5));

        
    }

    


 @GetMapping("/Pacientes")
    public List<Paciente> getPacientes() {
        return pacientes;
    }

 @GetMapping("/Pacientes/{id}")
    public ResponseEntity<?> getPacienteById(@PathVariable int id) {
    for (Paciente paciente : pacientes) {
        if (paciente.getId() == id) {
            return ResponseEntity.ok(paciente);
        }
    
    }
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró ningun usuario con el ID proporcionado.");
    }


    
}
