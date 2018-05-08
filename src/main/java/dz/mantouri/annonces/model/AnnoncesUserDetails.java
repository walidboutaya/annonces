package dz.mantouri.annonces.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Document(language = "fr")
public class AnnoncesUserDetails implements UserDetails {

    @Id
    @Setter
    @NotNull
    private String username;
    @Setter
    @NotNull
    private String password;
    @Setter
    @NotNull
    private Boolean enabled = true;

    @Getter
    @Setter
    @NotNull
    private String firstName;
    @Getter
    @Setter
    @NotNull
    private String lastName;
    @Getter
    @Setter
    @NotNull
    private String phone;

    @Setter
    private List<AnnoncesGrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return "{noop}" + this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
