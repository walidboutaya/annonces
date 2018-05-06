package dz.mantouri.annonces.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.NotNull;

@Data
public class Address {

    @Indexed
    @NotNull
    private String wilaya;
    @Indexed
    @NotNull
    private String ville;
    @Indexed
    private String quartier;
}
