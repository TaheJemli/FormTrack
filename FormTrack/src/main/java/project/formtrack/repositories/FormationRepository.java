package project.formtrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.formtrack.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Integer> {
}
