package de.befrie.dvega.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Actor extends Auditable{

    @Id
    @GeneratedValue
    Long director_id;

    @NonNull
    private String lastName;

    private String firstName;
    private Year yearOfBirth;
    private Year yearOfDeath;

    @OneToMany(mappedBy = "actor")
    private List<MovieActor> movies;
}
