package dz.mantouri.annonces.security;

import dz.mantouri.annonces.model.AnnoncesUserDetails;
import dz.mantouri.annonces.repository.AnnonceUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceUserDetailsService {

    @Autowired
    private AnnonceUserDetailsRepository userRepository;


    public void createUser(AnnoncesUserDetails user) {
        this.userRepository.save(user);
    }
}
