package com.Alura.ChallengeAPI.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Boolean status;
    private String autor;
    private String curso;

    public Topico(@Valid DatosRegistroTopico datos) {
        this.autor = datos.autor();
        this.curso = datos.curso();
        this.fechaCreacion = LocalDateTime.now();
        this.mensaje = datos.mensaje();
        this.status = true;
        this.titulo = datos.titulo();
    }

    public void actualizarInformaciones(@Valid DatosActualizacionTopico datos) {
       if (datos.titulo() != null) {
           this.titulo = datos.titulo();
       }
       if (datos.mensaje() != null) {
           this.mensaje = datos.mensaje();
       }
        if (datos.status() != null) {
            this.status = datos.status();
        }
        if (datos.curso() != null) {
            this.curso = datos.curso();
        }
    }
}

