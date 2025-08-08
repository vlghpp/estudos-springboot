package med.voll.api.doctors.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctors.dto.RegisterDoctorJSONRecord;
import med.voll.api.doctors.entity.Doctor;
import med.voll.api.doctors.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")

public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @GetMapping
    public String getAllDoctors(){
        return "Retornando todos os médicos!";
    }

    @PostMapping("/register")
    @Transactional
    public void registerDoctor(@RequestBody @Valid RegisterDoctorJSONRecord body){
        repository.save(new Doctor(body));
    }
}
