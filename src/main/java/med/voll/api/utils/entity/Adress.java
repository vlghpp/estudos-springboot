package med.voll.api.utils.entity;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.utils.dto.AdressDTO;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;


    public Adress(AdressDTO data) {
        this.street = data.street();             // logradouro
        this.neighborhood = data.neighborhood(); // bairro
        this.zipCode = data.zipCode();           // cep
        this.state = data.state();               // uf (Unidade Federativa)
        this.city = data.city();                 // cidade
        this.number = data.number();             // número
        this.complement = data.complement();     // complemento
    }

}
