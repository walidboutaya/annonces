package dz.mantouri.annonces.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.mantouri.annonces.model.Annonce;
import dz.mantouri.annonces.repository.AnnonceRepository;

import java.util.List;

@Service
public class AnnonceService {

    @Autowired
    private AnnonceRepository annonceRepository;

    public void save(Annonce annonce) {
        this.annonceRepository.save(annonce);
    }

    public void deleteById(String id) {
        this.annonceRepository.deleteById(id);
    }

    public Annonce findById(String id) {
        return this.annonceRepository.findById(id).orElse(null);
    }

    public List<Annonce> findAll() {
        return this.annonceRepository.findAll();
    }

    public List<Annonce> filter() {
        return null;
    }
}
