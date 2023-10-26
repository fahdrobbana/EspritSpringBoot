package tn.esprit.projet1.RestController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IUniversiteService;
import tn.esprit.projet1.entity.Universite;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService iUniversiteService;

    @GetMapping("/retrievealluniversite")
    List<Universite> retrieveAllUniversities() {
        return iUniversiteService.retrieveAllUniversities();
    }
@PostMapping("/adduniversity")
    Universite addUniversity(@RequestBody Universite u) {
        return iUniversiteService.addUniversity(u);
    }

    @PutMapping("/updateuniversity")
    Universite updateUniversity(@RequestBody Universite u) {
        return iUniversiteService.updateUniversity(u);
    }

    @GetMapping("/retrieveuniversity/{id}")
    Universite retrieveUniversity(@PathVariable("id") long idUniversity) {
        return iUniversiteService.retrieveUniversity(idUniversity);
    }


}
