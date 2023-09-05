package sk.sepa.object.banka;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="banka")
public class Banka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ime_banke;
    String vbdi_banke;
    Boolean sts_banke;
    Date date;
    BigDecimal iznos_naknade;
    int vrsta_naknade;

    public Banka(Long id, String ime_banke, String vbdi_banke, Boolean sts_banke, Date date, BigDecimal iznos_naknade, int vrsta_naknade) {
        this.id = id;
        this.ime_banke = ime_banke;
        this.vbdi_banke = vbdi_banke;
        this.sts_banke = sts_banke;
        this.date = date;
        this.iznos_naknade = iznos_naknade;
        this.vrsta_naknade = vrsta_naknade;
    }

    public Banka() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme_banke() {
        return ime_banke;
    }

    public void setIme_banke(String ime_banke) {
        this.ime_banke = ime_banke;
    }

    public String getVbdi_banke() {
        return vbdi_banke;
    }

    public void setVbdi_banke(String vbdi_banke) {
        this.vbdi_banke = vbdi_banke;
    }

    public Boolean getSts_banke() {
        return sts_banke;
    }

    public void setSts_banke(Boolean sts_banke) {
        this.sts_banke = sts_banke;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getIznos_naknade() {
        return iznos_naknade;
    }

    public void setIznos_naknade(BigDecimal iznos_naknade) {
        this.iznos_naknade = iznos_naknade;
    }

    public int getVrsta_naknade() {
        return vrsta_naknade;
    }

    public void setVrsta_naknade(int vrsta_naknade) {
        this.vrsta_naknade = vrsta_naknade;
    }
}
