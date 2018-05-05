package dz.mantouri.annonces.repository;

import dz.mantouri.annonces.model.AnnoncesUserDetails;
import org.springframework.data.repository.CrudRepository;

public interface AnnonceUserDetailsRepository extends CrudRepository<AnnoncesUserDetails, String> {
}
