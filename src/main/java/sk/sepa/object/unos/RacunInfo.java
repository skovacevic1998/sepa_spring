package sk.sepa.object.unos;

import jakarta.persistence.*;

@Entity
@Table(name="racun")
public class RacunInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime_rac;
    private String adresa_rac;
    private String mjesto_rac;

    public RacunInfo(Long id, String ime_rac, String adresa_rac, String mjesto_rac) {
        this.id = id;
        this.ime_rac = ime_rac;
        this.adresa_rac = adresa_rac;
        this.mjesto_rac = mjesto_rac;
    }

    public RacunInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime_rac;
    }

    public void setIme(String ime_rac) {
        this.ime_rac = ime_rac;
    }

    public String getAdresa() {
        return adresa_rac;
    }

    public void setAdresa(String adresa_rac) {
        this.adresa_rac = adresa_rac;
    }

    public String getMjesto() {
        return mjesto_rac;
    }

    public void setMjesto(String mjesto_rac) {
        this.mjesto_rac = mjesto_rac;
    }
}
