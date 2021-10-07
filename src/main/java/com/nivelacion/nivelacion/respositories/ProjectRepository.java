package com.nivelacion.nivelacion.respositories;

import com.nivelacion.nivelacion.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProjectRepository extends MongoRepository<Project, String> {
    List<Project> findByIdUser (String idUser);
}
