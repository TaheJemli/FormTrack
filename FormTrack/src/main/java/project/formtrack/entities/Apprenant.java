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
public class Apprenant implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idApprenant;

    String nom;

    String prenom;

    Integer telephone;

    String email;

    @ManyToMany(mappedBy = "apprenants")
    List<Formation> formations;
}
