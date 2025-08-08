package med.voll.api.doctors.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctors.dto.DoctorInRegisterDTO;
import med.voll.api.doctors.dto.DoctorInUpdateDTO;
import med.voll.api.doctors.dto.DoctorOutDTO;
import med.voll.api.doctors.entity.Doctor;
import med.voll.api.doctors.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @GetMapping
    public Page<DoctorOutDTO> getAllDoctors(Pageable pageble){
        return repository.findAll(pageble).map(DoctorOutDTO::new);
    }

    @PostMapping("/register")
    @Transactional
    public void registerDoctor(@RequestBody @Valid DoctorInRegisterDTO body){
        repository.save(new Doctor(body));
    }

    @PutMapping("/update")
    @Transactional
    public void updateDoctor(@RequestBody @Valid DoctorInUpdateDTO body){
        Doctor doctorBeforeUpdate = repository.getReferenceById(body.id());
        doctorBeforeUpdate.updateRegister(body);
    }

    @DeleteMapping()
    public String deleteDoctor(@RequestParam long id){
        return "Doctor delete sucessfull";
    }
}
