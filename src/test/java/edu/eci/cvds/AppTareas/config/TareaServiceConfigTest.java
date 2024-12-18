package edu.eci.cvds.AppTareas.config;

import edu.eci.cvds.AppTareas.repository.TareaPersistence;
import edu.eci.cvds.AppTareas.repository.mongo.MongoTareaRepository;
import edu.eci.cvds.AppTareas.repository.mysql.MySQLTareaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TareaServiceConfigTest {

    private TareaServiceConfig tareaServiceConfig;

    @Mock
    private MongoTareaRepository mongoTareaRepository;

    @Mock
    private MySQLTareaRepository mySQLTareaRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTareaServicePersistenceWithMongoDB() {
        tareaServiceConfig = new TareaServiceConfig("mongoDB", mongoTareaRepository, mySQLTareaRepository);
        TareaPersistence result = tareaServiceConfig.tareaServicePersistence();
        assertEquals(mongoTareaRepository, result);
    }

    @Test
    public void testTareaServicePersistenceWithMySQL() {
        tareaServiceConfig = new TareaServiceConfig("mysql", mongoTareaRepository, mySQLTareaRepository);
        TareaPersistence result = tareaServiceConfig.tareaServicePersistence();
        assertEquals(mySQLTareaRepository, result);
    }

    @Test
    public void testTareaServicePersistenceWithInvalidType() {
        tareaServiceConfig = new TareaServiceConfig("invalidType", mongoTareaRepository, mySQLTareaRepository);
        assertThrows(IllegalArgumentException.class, () -> {
            tareaServiceConfig.tareaServicePersistence();
        });
    }
}