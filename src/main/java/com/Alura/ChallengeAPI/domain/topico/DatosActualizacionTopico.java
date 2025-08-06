package com.Alura.ChallengeAPI.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizacionTopico(
        String titulo,
        String mensaje,
        Boolean status,
        String curso
) {
}
