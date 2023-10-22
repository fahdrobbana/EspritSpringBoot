package tn.esprit.projet1.Services;

import tn.esprit.projet1.Repositories.UniversiteRepo;
import tn.esprit.projet1.entity.Universite;

import java.util.List;

public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepo universiteRepo;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepo.findAll() ;
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return universiteRepo.findById(idUniversity).orElse(null);
    }
}
