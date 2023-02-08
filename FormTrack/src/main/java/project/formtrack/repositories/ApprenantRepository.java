package project.formtrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.formtrack.entities.Apprenant;

public interface ApprenantRepository extends JpaRepository<Apprenant, Integer> {
}
