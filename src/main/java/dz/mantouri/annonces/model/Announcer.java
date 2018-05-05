package dz.mantouri.annonces.model;

import lombok.Getter;
import lombok.Setter;

public class Announcer {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String phone;
    @Getter
    @Setter
    private Address address;

}
