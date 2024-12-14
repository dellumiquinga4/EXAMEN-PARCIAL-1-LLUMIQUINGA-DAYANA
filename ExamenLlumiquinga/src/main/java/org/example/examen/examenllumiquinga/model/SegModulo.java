package org.example.examen.examenllumiquinga.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "SEG_MODULO")
public class SegModulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_MODULO", nullable = false)
    private Long codModulo;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    @NotNull
    private String nombre;

    @Column(name = "ESTADO", length = 3, nullable = false)
    @NotNull
    private String estado;

    @Column(name = "VERSION", nullable = false)
    @NotNull
    private Integer version;

    // Constructor vacío
    public SegModulo() {}

    // Constructor normal
    public SegModulo(String nombre, String estado, Integer version) {
        this.nombre = nombre;
        this.estado = estado;
        this.version = version;
    }

    // Getters y Setters
    public Long getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(Long codModulo) {
        this.codModulo = codModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    // Métodos hashCode, equals y toString (opcional, pero recomendados)
    @Override
    public int hashCode() {
        return codModulo != null ? codModulo.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SegModulo segModulo = (SegModulo) obj;
        return codModulo != null ? codModulo.equals(segModulo.codModulo) : segModulo.codModulo == null;
    }

    @Override
    public String toString() {
        return "SegModulo{" +
                "codModulo=" + codModulo +
                ", nombre='" + nombre + '\'' +
                ", estado='" + estado + '\'' +
                ", version=" + version +
                '}';
    }
}