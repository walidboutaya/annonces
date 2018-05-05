package dz.mantouri.annonces.controller;

import dz.mantouri.annonces.model.Annonce;
import dz.mantouri.annonces.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequestMapping("/annonces")
public class AnnonceController {

    @Autowired
    private AnnonceService annonceService;

    @PostMapping
    public void saveAnnonce(@RequestBody Annonce annonce) {
        this.annonceService.save(annonce);
    }

    @DeleteMapping
    public void deleteAnnonce(String id) {
        this.annonceService.deleteById(id);
    }

    @GetMapping("/{identifiant}")
    public Annonce getAnnonce(@PathVariable(name = "identifiant") String id) {
        return this.annonceService.findById(id);
    }

    @GetMapping
    public List<Annonce> getAll() {
        return this.annonceService.findAll();
    }

    public List<Annonce> filter() {
        return null;
    }
}
