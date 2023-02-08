package project.formtrack.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.formtrack.entities.Apprenant;
import project.formtrack.entities.Formateur;
import project.formtrack.entities.Formation;
import project.formtrack.services.IFormTrackService;

@RestController
@Api(tags = "Form Track")
@RequestMapping("/formtrack")
public class FormTrackRestController {

    @Autowired
    IFormTrackService formTrackService;

    //http://localhost:9090/formtracks/swagger-ui/index.html

    @ApiOperation(value = "Ajouter un formateur")
    @PostMapping("/add-formateur")
    @ResponseBody
    public void ajouterFormateur(@RequestBody Formateur formateur){
        formTrackService.ajouterFormateur(formateur);
    }

    @ApiOperation(value = "Ajouter un apprenant")
    @PostMapping("/add-apprenant")
    @ResponseBody
    public void ajouterApprenant (@RequestBody Apprenant apprenant){
        formTrackService.ajouterApprenant(apprenant);
    }
    @ApiOperation(value = "Ajouter une formation")
    @PostMapping("/add-formation")
    @ResponseBody
    public void ajouterFormation (@RequestBody Formation formation){
        formTrackService.ajouterFormation(formation);
    }

    @ApiOperation(value = "Ajouter et affecter une formation a formateur")
    @PostMapping("/add-and-affect-formation/{idFormateur}")
    @ResponseBody
    public void ajouterEtAffecterFormationAFormateur (@RequestBody Formation formation,@PathVariable Integer idFormateur){
        formTrackService.ajouterEtAffecterFormationAFormateur(formation,idFormateur);
    }



}
