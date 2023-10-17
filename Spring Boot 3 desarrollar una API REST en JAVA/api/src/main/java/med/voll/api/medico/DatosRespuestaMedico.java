package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String telefono, String documento,
Especialidad especialidad, DatosDireccion direccion ) {
    public DatosRespuestaMedico(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEmail(), medico.getTelefono(), medico.getDocumento(),
                medico.getEspecialidad(), new DatosDireccion(medico.getDireccion()));
    }
}