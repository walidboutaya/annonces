package dz.mantouri.annonces.model;

import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

public class AnnoncesGrantedAuthority implements GrantedAuthority {

    @Setter
    private String authority;

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
