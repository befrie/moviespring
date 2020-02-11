package de.befrie.dvega.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class MovieActorId implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long movie;
    private Long actor;
}
