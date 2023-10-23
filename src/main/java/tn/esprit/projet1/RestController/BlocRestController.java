package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IBlocService;
import tn.esprit.projet1.entity.Bloc;


import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;


@PutMapping("/update")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return iBlocService.updateBloc(bloc);
    }

@PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return iBlocService.addBloc(bloc);
    }

    @GetMapping("/retreives")
    List<Bloc> retrieveBlocs() {
        return iBlocService.retrieveBlocs();
    }

    @DeleteMapping("/deletebloc/{idBloc}")
    void removeBloc(@PathVariable long idBloc) {
        iBlocService.removeBloc(idBloc);
    }


}
