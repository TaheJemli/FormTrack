package project.formtrack.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Formation implements Serializable {
     static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer idFormation;

     String titre;

     @Temporal(TemporalType.DATE)
     Date dateDebut;
     @Temporal(TemporalType.DATE)
     Date dateFin;

     Integer nbrHeures;

     Integer nbrMaxParticipant;

     Integer frais;

     @Enumerated(EnumType.STRING)
     Niveau niveau;

     @ManyToOne
     Formateur formateur;

     @ManyToMany
     List<Apprenant> apprenants;



}
