package dz.mantouri.annonces.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(language = "fr")
public class Annonce {

    @Id
    private String id;
    @Indexed
    @NotNull
    private String title;
    @NotNull
    private String details;
    @NotNull
    private Double price;
    @NotEmpty
    private List<String> photos;
    private Announcer announcer;
    private LocalDateTime date;
    @Indexed
    @NotNull
    private SubCategory subCategory;
    @NotNull
    private Address address;
}
