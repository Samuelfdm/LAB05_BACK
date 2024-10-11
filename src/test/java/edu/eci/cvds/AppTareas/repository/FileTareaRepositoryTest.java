package edu.eci.cvds.AppTareas.repository;

import edu.eci.cvds.AppTareas.model.Tarea;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException; 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class FileTareaRepositoryTest {

    private FileTareaRepository repository;
    private final String testFilePath = "test_tareas.json"; 

    @BeforeEach
    public void setUp() {
        
        File archivo = new File(testFilePath);
        if (archivo.exists()) {
            archivo.delete();
        }
        
        repository = new FileTareaRepository(); 
    }

    /*
    @Test
    public void testSaveAndFindById() {
        Tarea tarea = new Tarea("1", "Tarea 1", "Descripción de la tarea 1");
        repository.save(tarea);

        Optional<Tarea> foundTarea = repository.findById("1");

        assertTrue(foundTarea.isPresent());
        assertEquals(tarea, foundTarea.get());
    }

    @Test
    public void testUpdateExistingTarea() {
        Tarea tarea = new Tarea("1", "Tarea 1", "Descripción de la tarea 1");
        repository.save(tarea);

        Tarea updatedTarea = new Tarea("1", "Tarea 1 actualizada", "Descripción actualizada");
        repository.save(updatedTarea);

        Optional<Tarea> foundTarea = repository.findById("1");
        assertTrue(foundTarea.isPresent());
        assertEquals(updatedTarea, foundTarea.get());
    }

    @Test
    public void testFindAll() {
        Tarea tarea1 = new Tarea("1", "Tarea 1", "Descripción de la tarea 1");
        Tarea tarea2 = new Tarea("2", "Tarea 2", "Descripción de la tarea 2");
        repository.save(tarea1);
        repository.save(tarea2);

        List<Tarea> tareas = repository.findAll();
        assertEquals(2, tareas.size());
        assertTrue(tareas.contains(tarea1));
        assertTrue(tareas.contains(tarea2));
    }

    @Test
    public void testDeleteById() {
        Tarea tarea = new Tarea("1", "Tarea 1", "Descripción de la tarea 1");
        repository.save(tarea);
        repository.deleteById("1");

        Optional<Tarea> foundTarea = repository.findById("1");
        assertFalse(foundTarea.isPresent());
    }

    @Test
    public void testEmptyFileInitialization() {
        assertTrue(new File(testFilePath).exists());
        List<Tarea> tareas = repository.findAll();
        assertTrue(tareas.isEmpty());
    }
    */

    @AfterEach
    public void tearDown() {
        try {
            Files.deleteIfExists(Paths.get(testFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
