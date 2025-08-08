package med.voll.api.utils.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AdressDTO(
        @NotBlank
        String street,
        String number,
        String complement,
        @NotBlank
        String neighborhood,
        @NotBlank
        String city,
        @NotBlank
        String state,
        @Pattern(regexp = "\\d{8}")
        String zipCode


) {
}
