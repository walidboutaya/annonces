package dz.mantouri.annonces.security;

import dz.mantouri.annonces.model.AnnoncesUserDetails;
import dz.mantouri.annonces.repository.AnnonceUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AnnoncesUserDetailsFinder implements UserDetailsService {

    @Autowired
    private AnnonceUserDetailsRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AnnoncesUserDetails userDetails = userRepository.findById(username).orElse(null);
        return userDetails;
    }
}
