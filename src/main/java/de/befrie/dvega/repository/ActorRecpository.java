package de.befrie.dvega.repository;

import de.befrie.dvega.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRecpository extends JpaRepository<Actor, Long> {
}
