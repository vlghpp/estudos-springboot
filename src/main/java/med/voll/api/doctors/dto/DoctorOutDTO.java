package med.voll.api.doctors.dto;

import med.voll.api.doctors.entity.Doctor;
import med.voll.api.doctors.enums.Specialty;

public record DoctorOutDTO(
        Long id,
        String name,
        String email,
        String crm,
        Specialty specialty
) {
    public DoctorOutDTO(Doctor doctor){
        this(doctor.getId(),doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}
