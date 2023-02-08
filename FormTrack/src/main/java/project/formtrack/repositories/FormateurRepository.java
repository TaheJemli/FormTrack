package project.formtrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.formtrack.entities.Formateur;

public interface FormateurRepository extends JpaRepository<Formateur, Integer> {
}
