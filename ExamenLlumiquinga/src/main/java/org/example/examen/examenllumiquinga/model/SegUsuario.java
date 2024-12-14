package org.example.examen.examenllumiquinga.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "SEG_USUARIO")
public class SegUsuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_USUARIO", nullable = false)
    private Long codUsuario;

    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", nullable = false)
    @NotNull
    private SegPerfil segPerfil;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    @NotNull
    private String nombre;

    @Column(name = "TELEFONO", length = 10)
    private String telefono;

    @Column(name = "CLAVE", length = 128, nullable = false)
    @NotNull
    private String clave;

    @Column(name = "ESTADO", length = 3, nullable = false)
    @NotNull
    private String estado;

    // Constructor vacío
    public SegUsuario() {}

    // Constructor normal
    public SegUsuario(SegPerfil segPerfil, String nombre, String telefono, String clave, String estado) {
        this.segPerfil = segPerfil;
        this.nombre = nombre;
        this.telefono = telefono;
        this.clave = clave;
        this.estado = estado;
    }

    // Getters y Setters
    public Long getCodUsuario() { return codUsuario; }
    public void setCodUsuario(Long codUsuario) { this.codUsuario = codUsuario; }

    public SegPerfil getSegPerfil() { return segPerfil; }
    public void setSegPerfil(SegPerfil segPerfil) { this.segPerfil = segPerfil; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
