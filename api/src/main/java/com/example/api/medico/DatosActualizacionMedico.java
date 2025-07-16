package com.example.api.medico;

import com.example.api.direccion.DatosDireccion;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizacionMedico(
       @NotNull Long id,
        String nombre,
        String telefono,
        DatosDireccion direccion
) {
}
