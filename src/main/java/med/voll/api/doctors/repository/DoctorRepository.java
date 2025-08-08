package med.voll.api.doctors.repository;

import med.voll.api.doctors.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
