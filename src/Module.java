public class Module {
    private int id;
    private String libelle;
    private int vh; // Volume Horaire
    private String frequence;

    // Constructeur pour initialiser les données
    public Module(int id, String libelle, int vh, String frequence) {
        this.id = id;
        this.libelle = libelle;
        this.vh = vh;
        this.frequence = frequence;
    }
}