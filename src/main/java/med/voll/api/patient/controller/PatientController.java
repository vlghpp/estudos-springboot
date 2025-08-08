package med.voll.api.patient.controller;


import med.voll.api.patient.dto.PatientJSONRecord;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @GetMapping
    public void getAllPatients(){
    }

    @PostMapping("/register")
    public void registerPatient(@RequestBody PatientJSONRecord body){
        System.out.println(body);
    }
}
