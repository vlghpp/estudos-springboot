package med.voll.api.patient.dto;

import med.voll.api.utils.dto.AdressDTO;

public record PatientJSONRecord(String name, String email, String fone, String cpf, AdressDTO adressDTO) {
}
