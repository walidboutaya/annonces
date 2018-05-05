package dz.mantouri.annonces.repository;

import dz.mantouri.annonces.model.Annonce;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnnonceRepository extends CrudRepository<Annonce, String> {

    List<Annonce> findAll();
}
