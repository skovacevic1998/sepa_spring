package sk.sepa.object.vrstaNamjene;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "vrstaNamjene") // Custom table name specified here
public class VrstaNamjene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sif_namjene;
    private String opis;
    private Date date;

    public VrstaNamjene(Long id, String sif_namjene, String opis, Date date) {
        this.id = id;
        this.sif_namjene = sif_namjene;
        this.opis = opis;
        this.date = date;
    }

    public VrstaNamjene() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSif_namjene() {
        return sif_namjene;
    }

    public void setSif_namjene(String sif_namjene) {
        this.sif_namjene = sif_namjene;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
