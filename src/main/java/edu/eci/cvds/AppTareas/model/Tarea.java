package edu.eci.cvds.AppTareas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "tareas")  // Indica que es un documento de MongoDB
@Entity
@Table(name = "tareas")
@Data
public class Tarea {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private boolean estado;
    private int prioridad;
    private String dificultad;
    private double tiempoPromedio;


    public Tarea(String id, String nombre, String descripcion, boolean estado, int prioridad, String dificultad, double tiempoPromedio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.dificultad = dificultad;
        this.tiempoPromedio = tiempoPromedio;
    }

    public boolean getEstado() {
        return estado;
    }
}