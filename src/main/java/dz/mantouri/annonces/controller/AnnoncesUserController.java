package dz.mantouri.annonces.controller;

import dz.mantouri.annonces.model.AnnoncesUserDetails;
import dz.mantouri.annonces.security.AnnonceUserDetailsService;
import dz.mantouri.annonces.security.AnnoncesUserDetailsFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnoncesUserController {

    @Autowired
    private AnnonceUserDetailsService userDetailsService;

    @PostMapping("/users")
    public void createUser(@RequestBody AnnoncesUserDetails userDetails) {
        this.userDetailsService.createUser(userDetails);
    }
}
