package dz.mantouri.annonces.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

public class Address {

    @Indexed
    @Getter
    @Setter
    private String wilaya;
    @Indexed
    @Getter
    @Setter
    private String ville;
    @Indexed
    @Getter
    @Setter
    private String quartier;
}
