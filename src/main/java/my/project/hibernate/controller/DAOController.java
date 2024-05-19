package my.project.hibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import my.project.hibernate.entity.Persons;
import my.project.hibernate.repository.DAORepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class DAOController {

    private DAORepository repository;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam("city") String city){
        return repository.getPersonsByCity(city);
    }
}