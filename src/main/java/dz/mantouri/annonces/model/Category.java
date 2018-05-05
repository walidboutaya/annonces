package dz.mantouri.annonces.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

public class Category {

    @Indexed
    @Getter
    @Setter
    private String category;
    @Indexed
    @Getter
    @Setter
    private String subCategory;
}
