package de.befrie.dvega.repository;

import de.befrie.dvega.domain.Actor;
import de.befrie.dvega.domain.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRecpository extends JpaRepository<Director, Long> {
}
