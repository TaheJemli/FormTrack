package project.formtrack.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Formateur implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idFormateur;

    String nom;

    String prenom;

    Integer tarifHoraire;

    String email;

    @OneToMany(mappedBy = "formateur")
    List<Formation> formations;
}
