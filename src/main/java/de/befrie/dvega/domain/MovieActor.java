package de.befrie.dvega.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@IdClass(MovieActorId.class)
public class MovieActor {

        @Id
        @ManyToOne
        @JoinColumn(name="movie_id")
        private Movie movie;
        @Id
        @ManyToOne
        @JoinColumn(name="actor_id")
        private Actor actor;

        private String character;

}

