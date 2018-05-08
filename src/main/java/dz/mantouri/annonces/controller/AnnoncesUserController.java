package dz.mantouri.annonces.controller;

import dz.mantouri.annonces.model.AnnoncesUserDetails;
import dz.mantouri.annonces.security.AnnonceUserDetailsService;
import dz.mantouri.annonces.security.AnnoncesUserDetailsFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class AnnoncesUserController {

    @Autowired
    private AnnonceUserDetailsService userDetailsService;

    @PostMapping("/users")
    public void createUser(@RequestBody @Valid AnnoncesUserDetails userDetails) {
        this.userDetailsService.createUser(userDetails);
    }
}
