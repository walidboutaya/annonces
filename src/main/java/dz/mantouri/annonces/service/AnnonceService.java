package dz.mantouri.annonces.service;

import dz.mantouri.annonces.model.Annonce;
import dz.mantouri.annonces.model.SubCategory;
import dz.mantouri.annonces.repository.AnnonceRepository;
import dz.mantouri.annonces.repository.AnnounceSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static java.time.LocalDateTime.now;
import static java.util.Objects.nonNull;

@Service
public class AnnonceService {

    @Autowired
    private AnnonceRepository annonceRepository;

    @Autowired
    private AnnounceSearchRepository announceSearchRepository;

    public void save(Annonce annonce) {
        annonce.setDate(now());
        this.annonceRepository.save(annonce);
    }

    public void deleteById(String id) {
        this.annonceRepository.deleteById(id);
    }

    public Annonce findById(String id) {
        return this.annonceRepository.findById(id).orElse(null);
    }

    public List<Annonce> findAll(String title, String wilaya, Double minPrice, Double maxPrice, SubCategory subCategory) {
        return announceSearchRepository.findAll(title, wilaya, minPrice, maxPrice, subCategory);
    }
}
