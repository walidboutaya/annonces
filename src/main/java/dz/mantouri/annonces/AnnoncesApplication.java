package dz.mantouri.annonces;

import dz.mantouri.annonces.security.AnnoncesUserDetailsFinder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableWebSecurity
public class AnnoncesApplication extends WebSecurityConfigurerAdapter {

    public static void main(String[] args) {
        run(AnnoncesApplication.class, args);
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new AnnoncesUserDetailsFinder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .csrf().disable().authorizeRequests()
                .antMatchers("/users").permitAll()
                //.antMatchers("/**").authenticated()
                .antMatchers("/**").permitAll()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }

}
