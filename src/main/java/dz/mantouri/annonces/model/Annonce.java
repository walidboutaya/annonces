package dz.mantouri.annonces.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(language = "fr")
public class Annonce {

    @Id
    @Getter
    @Setter
    private String id;
    @Indexed
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String details;
    @Getter
    @Setter
    private Double price;
    @Getter
    @Setter
    private List<String> photos;
    @Getter
    @Setter
    private Announcer announcer;
    @Getter
    @Setter
    private LocalDateTime date;
    @Getter
    @Setter
    private Category category;
}
