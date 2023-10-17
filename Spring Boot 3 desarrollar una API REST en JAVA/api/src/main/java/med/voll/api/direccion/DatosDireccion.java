package med.voll.api.direccion;

import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record DatosDireccion(
        @NotBlank
        String calle,
        @NotBlank
        String distrito,
        @NotBlank
        String ciudad,
        @Positive
        int numero,
        @NotBlank
        String complemento) {

        public DatosDireccion(Direccion direccion) {
                this(direccion.getCalle(), direccion.getDistrito(), direccion.getCiudad(), direccion.getNumero(), direccion.getComplemento());
        }
}