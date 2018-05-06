package dz.mantouri.annonces.model;

public enum SubCategory {

    //emploi
    JOB("Emploi", "Emploi"),
    //Immobilier
    IMMO_SALE("Ventes immobilières", "Immobilier"),
    IMMO_RENTAL("Location immobilière", "Immobilier"),
    IMMO_VACANCY("Locations de vacances", "Immobilier"),
    //Véhicules
    CARS("Voitures", "Véhicules"),
    MOTOS("Motos", "Véhicules"),
    COMMERCIAL_VEHICULES("Utilitaires", "Véhicules"),
    //Multimédia
    COMPUTER("Informatique", "Multimédia"),
    CD_DVD("CD / DVD", "Multimédia"),
    PHONE("Téléphonie", "Multimédia"),
    IMAGE_SOUND("Image et son", "Multimédia"),
    //Méteriel pro
    OFFICE("Bureautique", "Matériel Professionnel"),
    HOTEL_RESTAURANT("Hotelerie / Restauration", "Matériel Professionnel"),
    BUILDING("BTP", "Matériel Professionnel"),
    HEALTH("Médical", "Matériel Professionnel"),
    AGRICULTURAL("Agricole", "Matériel Professionnel"),
    INDUSTRY("Industriel", "Matériel Professionnel"),
    //Loisirs
    SPORTS("Sport", "Loisirs"),
    MUSIC_INSTRU("Instruments de musique", "Loisirs"),
    BOOK("Livre", "Loisirs"),
    ANIMAL("Animaux", "Loisirs"),
    //Maison
    HOME_FURNITURE("Meubles", "Maison"),
    HOME_APPLIANCE("2lectroménager", "Maison"),
    CLOTHING("Vêtements", "Maison"),
    BABY("Bébés", "Maison"),
    JEWELRY("Bijoux", "Maison"),
    DECORATION("Décoration", "Maison"),
    //Autres
    OTHERS("Autres", "Autres")
    ;

    private String label;
    private String category;

    SubCategory(String label, String category) {
        this.label = label;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public String getLabel() {
        return this.label;
    }
}
