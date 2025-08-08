package med.voll.api.doctors.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.doctors.dto.DoctorInRegisterDTO;
import med.voll.api.doctors.dto.DoctorInUpdateDTO;
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

    public Doctor(DoctorInRegisterDTO dados) {
        this.name = dados.name();
        this.email = dados.email();
        this.fone = dados.fone();
        this.crm = dados.crm();
        this.specialty = dados.specialty();
        this.adress = new Adress(dados.adress());
    }

    public void updateRegister(DoctorInUpdateDTO body) {
        if (body.name() != null) this.name = body.name();
        if (body.adress() != null) this.adress.updateRegister(body.adress());
        if (body.fone() != null) this.fone = body.fone();
    }
}
