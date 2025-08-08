package med.voll.api.patient.controller;


import jakarta.validation.Valid;
import med.voll.api.patient.dto.PatientDTO;
import med.voll.api.patient.entity.Patient;
import med.voll.api.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @GetMapping
    public void getAllPatients(){
    }

    @PostMapping("/register")
    public void registerPatient(@RequestBody @Valid PatientDTO body){
        repository.save((new Patient(body)));
    }
}
