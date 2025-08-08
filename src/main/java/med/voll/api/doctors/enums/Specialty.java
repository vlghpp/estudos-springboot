package med.voll.api.doctors.enums;

import lombok.Getter;

@Getter
public enum Specialty {
    ORTHOPEDICS("Orthopedics"),
    CARDIOLOGY("Cardiology"),
    GYNECOLOGY("Gynecology"),
    DERMATOLOGY("Dermatology");

    private final String displayName;

    Specialty(String displayName) {
        this.displayName = displayName;
    }

}
