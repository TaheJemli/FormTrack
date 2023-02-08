package project.formtrack.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.formtrack.entities.Apprenant;
import project.formtrack.entities.Formateur;
import project.formtrack.entities.Formation;
import project.formtrack.repositories.ApprenantRepository;
import project.formtrack.repositories.FormateurRepository;
import project.formtrack.repositories.FormationRepository;

@Service
@Slf4j
public class FormTrackServiceImpl implements IFormTrackService{

    @Autowired
    ApprenantRepository apprenantRepository;

    @Autowired
    FormationRepository formationRepository;

    @Autowired
    FormateurRepository formateurRepository;

    @Override
    public void ajouterFormateur(Formateur formateur) {
        formateurRepository.save(formateur);

    }

    @Override
    public void ajouterApprenant(Apprenant apprenant) {
        apprenantRepository.save(apprenant);

    }

    @Override
    public void ajouterFormation(Formation formation) {
        formationRepository.save(formation);
    }

    @Override
    public void ajouterEtAffecterFormationAFormateur(Formation formation, Integer idFormateur) {
        Formateur formateur = formateurRepository.findById(idFormateur).orElse(null);
        formationRepository.save(formation);
        formation.setFormateur(formateur);
        formationRepository.save(formation);

    }
}
