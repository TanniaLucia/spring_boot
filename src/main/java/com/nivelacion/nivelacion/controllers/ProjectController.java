package com.nivelacion.nivelacion.controllers;


import com.nivelacion.nivelacion.models.Project;
import com.nivelacion.nivelacion.models.Users;
import com.nivelacion.nivelacion.respositories.ProjectRepository;
import com.nivelacion.nivelacion.respositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ProjectController {


    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;

    public ProjectController(UserRepository userRepository, ProjectRepository projectRepository) {
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
    }

    @PostMapping("/project")
    Project newProject(@RequestBody Project project){
        Users UserId = userRepository.findById(project.getIdUser()).orElse(null);

        UserId.setRol(UserId.getRol());
        UserId.setEstado(UserId.getEstado());
        UserId.setEdad(UserId.getEdad());
        userRepository.save(UserId);

        project.setFechaInicio(new Date());
        return projectRepository.save(project);

    }

    @GetMapping("/project/{userId}")
    List<Project> userProject(@PathVariable String userId){
        List<Project> projectUser = projectRepository.findByIdUser(userId);
        return projectUser;
    }

}
