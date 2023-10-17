package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank @Email
        String email,
        @NotBlank
        String documentoIdentidad,
        @NotBlank
        String telefono,
        @NotNull @Valid
        DatosDireccion direccion) {
}