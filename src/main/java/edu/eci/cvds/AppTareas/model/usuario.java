package edu.eci.cvds.AppTareas.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "tareas")
@Entity
@Table(name = "tareas")
@Data
public class usuario {
    @Id
    private String id;
    private String nombre;
    private String contraseña;

    public usuario(String contraseña, String nombre, String id) {
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.id = id;
    }
}
