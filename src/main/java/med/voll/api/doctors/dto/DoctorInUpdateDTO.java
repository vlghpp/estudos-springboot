package med.voll.api.doctors.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.utils.entity.Adress;

public record DoctorInUpdateDTO(
        @NotNull
        Long id,
        String name,
        String fone,
        Adress adress
) {
}
