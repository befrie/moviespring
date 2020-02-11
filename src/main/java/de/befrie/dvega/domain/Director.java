package de.befrie.dvega.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Director extends Auditable{

    @Id
    @GeneratedValue
    Long director_id;

    @NonNull
    private String lastName;
    private String firstName;
    private Year yearOfBirth;
    private Year yearOfDeath;

    @ManyToMany(mappedBy="directors")
    private List<Movie> movies = new ArrayList<>();
}
