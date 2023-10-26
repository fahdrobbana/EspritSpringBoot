package tn.esprit.projet1.RestController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IFoyerService;
import tn.esprit.projet1.entity.Foyer;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService iFoyerService;
@GetMapping("/retrieveallfoyers")
    List<Foyer> retrieveAllFoyers() {
        return iFoyerService.retrieveAllFoyers();
    }

    @PostMapping("/addfoyer")
    Foyer addFoyer(@RequestBody Foyer f) {
        return iFoyerService.addFoyer(f);
    }
@PutMapping("/updatefoyer")
    Foyer updateFoyer(@RequestBody Foyer f) {
        return iFoyerService.updateFoyer(f);
    }

    @GetMapping("/retrievefoyer/{id}")
    Foyer retrieveFoyer(@PathVariable("id") long idFoyer) {
        return iFoyerService.retrieveFoyer(idFoyer);
    }
@DeleteMapping("/deletefoyer/{id}")
    void removeFoyer(@PathVariable("id") long idFoyer) {
        iFoyerService.removeFoyer(idFoyer);
    }


}
