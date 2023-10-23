package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
}
