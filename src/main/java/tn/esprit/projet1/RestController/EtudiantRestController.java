package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IEtudiantService;
import tn.esprit.projet1.entity.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    @GetMapping("/retrieveall")
    List<Etudiant> retrieveAllEtudiants() {
        return iEtudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/ajouteretudiant")
    List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        return iEtudiantService.addEtudiants(etudiants);
    }
@PutMapping("/updatestudent")
    Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return iEtudiantService.updateEtudiant(e);
    }
@GetMapping("/retrievestudent/{id}")
    Etudiant retrieveEtudiant(@PathVariable("id") long idEtudiant ) {
        return iEtudiantService.retrieveEtudiant(idEtudiant);
    }

    void removeEtudiant(long idEtudiant) {
        iEtudiantService.removeEtudiant(idEtudiant);
    }



}
