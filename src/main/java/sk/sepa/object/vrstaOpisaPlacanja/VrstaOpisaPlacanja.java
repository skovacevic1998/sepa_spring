package sk.sepa.object.vrstaOpisaPlacanja;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="vrstaOpisaPlacanja")
public class VrstaOpisaPlacanja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int sif_opis_plac;
    private String opis;
    private Date date;

    public VrstaOpisaPlacanja(Long id, int sif_opis_plac, String opis, Date date) {
        this.id = id;
        this.sif_opis_plac = sif_opis_plac;
        this.opis = opis;
        this.date = date;
    }

    public VrstaOpisaPlacanja() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSif_opis_plac() {
        return sif_opis_plac;
    }

    public void setSif_opis_plac(int sif_opis_plac) {
        this.sif_opis_plac = sif_opis_plac;
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
