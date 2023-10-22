package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IBlocService;
import tn.esprit.projet1.entity.Bloc;
import tn.esprit.projet1.entity.Foyer;


import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("/retrieve/{id}")
    Bloc retrieveBlocs(@PathVariable("id") long idBloc) {
        return iBlocService.retrieveBloc(idBloc);
    }
@PutMapping("/update")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return iBlocService.updateBloc(bloc);
    }
}
