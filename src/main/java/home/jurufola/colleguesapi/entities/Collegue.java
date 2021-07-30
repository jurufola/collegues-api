package home.jurufola.colleguesapi.entities;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Classe representant un collègue
 * @author juruf_000
 */

@Entity
@Table(name = "collegues")
public class Collegue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenoms")
    private String prenoms;

    @Column(name = "email")
    private String email;

    @Column(name = "date_de_naissance")
    private LocalDate dateDeNaissance;


    private String photoUrl;

    /**
     * Constructeur
     * @param matricule
     * @param nom
     * @param prenoms
     * @param email
     * @param dateDeNaissance
     * @param photoUrl
     */
    public Collegue(String matricule, String nom, String prenoms, String email, LocalDate dateDeNaissance,
                    String photoUrl) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenoms = prenoms;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.photoUrl = photoUrl;
    }

    /**
     * Constructeur vide
     */
    public Collegue() {
    }

    /**
     * Getter id
     * @return L'identifiant du collègue
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter id
     * @param id L'identifiant du collègue
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter matricule
     * @return Le matricule du collègue
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Setter matricule
     * @param matricule Le matricule du collègue
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Getter Nom
     * @return Le nom du collègue
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sette nom
     * @param nom Le nom du collègue
     */

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter prenoms
     * @return Les prénoms du collègue
     */
    public String getPrenoms() {
        return prenoms;
    }

    /**
     * Setter prenoms
     * @param prenoms Les prénoms du collègue
     */
    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    /**
     * Getter email
     * @return L'email du collègue
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter email
     * @param email L'email du collègue
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter dateDeNaissance
     * @return La date de naissance su collègue
     */
    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * Setter dateDeNaissance
     * @param dateDeNaissance La date de naissance du collègue
     */
    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    /**
     * Getter photoUrl
     * @return L'url de la photo du collègue
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Setter photoUrl
     * @param photoUrl L'url de la photo du collègue
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
