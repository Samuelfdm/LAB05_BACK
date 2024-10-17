package edu.eci.cvds.AppTareas.repository.mongo;

import edu.eci.cvds.AppTareas.model.usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("mongoDB")
public interface MongoUsuarioRepository extends MongoRepository<usuario, String> {
}

