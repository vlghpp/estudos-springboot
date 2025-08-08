package med.voll.api.patient.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.doctors.enums.Specialty;
import med.voll.api.patient.dto.PatientDTO;
import med.voll.api.utils.entity.Adress;


@Table(name = "patients")
@Entity(name = "Patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String fone;
    String cpf;
    @Embedded
    Adress adress;

    public Patient(PatientDTO dados) {
        this.name = dados.name();
        this.email = dados.email();
        this.fone = dados.fone();
        this.cpf = dados.cpf();
        this.adress = new Adress(dados.adress());
    }
}
