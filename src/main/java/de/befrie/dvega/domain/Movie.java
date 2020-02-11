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
public class Movie extends Auditable{

    @Id
    @GeneratedValue
    Long id;
    @NonNull
    private String title;
    private String imgPath;
    private String description;
    private String countries;
    private Year yearOfPublication;

    @OneToMany(mappedBy = "movie")
    private List<MovieActor> actors = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "movie_director",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private List<Director> directors = new ArrayList<>();


    
}
