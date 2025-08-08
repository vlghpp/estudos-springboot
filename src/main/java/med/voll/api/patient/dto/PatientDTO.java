package med.voll.api.patient.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.utils.dto.AdressDTO;

public record PatientDTO(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "^\\(?\\d{2}\\)?[\\s-]?\\d{4,5}[-]?\\d{4}$")
        String fone,
        @NotBlank
        String cpf,
        @NotNull
        @Valid
        AdressDTO adress
) {



}
