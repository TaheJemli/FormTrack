package project.formtrack.services;

import project.formtrack.entities.Apprenant;
import project.formtrack.entities.Formateur;
import project.formtrack.entities.Formation;

public interface IFormTrackService {

    public void ajouterFormateur(Formateur formateur);

    public void ajouterApprenant (Apprenant apprenant);

    public void ajouterFormation (Formation formation);

    public void ajouterEtAffecterFormationAFormateur (Formation formation, Integer idFormateur);
}
