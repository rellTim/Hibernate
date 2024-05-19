package my.project.hibernate.repository;

import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import my.project.hibernate.entity.Persons;

import java.util.List;

@Repository
@AllArgsConstructor
public class DAORepository {
    private EntityManager manager;

    public List<Persons> getPersonsByCity(String city){
        return manager.createQuery("SELECT p FROM Persons p WHERE p.cityOfLiving = :city", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }
}