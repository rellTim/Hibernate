package my.project.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "persons")
@AllArgsConstructor
@NoArgsConstructor
public class Persons {

    @EmbeddedId
    private PersonsKey personsKey;

    @Column(nullable = false)
    private int phoneNumber;

    @Column(nullable = false)
    private String cityOfLiving;
}