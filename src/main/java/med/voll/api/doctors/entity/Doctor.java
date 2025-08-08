package med.voll.api.doctors.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.doctors.dto.RegisterDoctorJSONRecord;
import med.voll.api.doctors.enums.Specialty;
import med.voll.api.utils.entity.Adress;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String fone;
    String crm;
    @Enumerated(EnumType.STRING)
    Specialty specialty;
    @Embedded
    Adress adress;

    public Doctor(RegisterDoctorJSONRecord dados) {
        this.name = dados.name();
        this.email = dados.email();
        this.fone = dados.fone();
        this.crm = dados.crm();
        this.specialty = dados.specialty();
        this.adress = new Adress(dados.adress());
    }
}
