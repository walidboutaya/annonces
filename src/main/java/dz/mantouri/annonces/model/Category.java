package dz.mantouri.annonces.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
public class Category {

    @Indexed
    private String category;
    @Indexed
    private SubCategory subCategory;
}
