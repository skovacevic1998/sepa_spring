package sk.sepa.object.racun;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="racun")
public class Racun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String drzava_rac;
    private String kontrolni_broj_rac;
    private String iban_rac;
    private String ime_rac;
    private String adresa_rac;
    private String mjesto_rac;
    private Boolean sts_rac;
    private Date date;
    private String vbdi_rac;
    private Long id_banke;

    public Racun(Long id, String drzava_rac, String kontrolni_broj_rac, String iban_rac, String ime_rac, String adresa_rac, String mjesto_rac, Boolean sts_rac, Date date, String vbdi_rac, Long id_banke) {
        this.id = id;
        this.drzava_rac = drzava_rac;
        this.kontrolni_broj_rac = kontrolni_broj_rac;
        this.iban_rac = iban_rac;
        this.ime_rac = ime_rac;
        this.adresa_rac = adresa_rac;
        this.mjesto_rac = mjesto_rac;
        this.sts_rac = sts_rac;
        this.date = date;
        this.vbdi_rac = vbdi_rac;
        this.id_banke = id_banke;
    }

    public Racun() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrzava_rac() {
        return drzava_rac;
    }

    public void setDrzava_rac(String drzava_rac) {
        this.drzava_rac = drzava_rac;
    }

    public String getKontr_br() {
        return kontrolni_broj_rac;
    }

    public void setKontr_br(String kontrolni_broj_rac) {
        this.kontrolni_broj_rac = kontrolni_broj_rac;
    }

    public String getIban_rac() {
        return iban_rac;
    }

    public void setIban_rac(String iban_rac) {
        this.iban_rac = iban_rac;
    }

    public String getIme_rac() {
        return ime_rac;
    }

    public void setIme_rac(String ime_rac) {
        this.ime_rac = ime_rac;
    }

    public String getAdresa_rac() {
        return adresa_rac;
    }

    public void setAdresa_rac(String adresa_rac) {
        this.adresa_rac = adresa_rac;
    }

    public String getMjesto_rac() {
        return mjesto_rac;
    }

    public void setMjesto_rac(String mjesto_rac) {
        this.mjesto_rac = mjesto_rac;
    }

    public Boolean getSts_rac() {
        return sts_rac;
    }

    public void setSts_rac(Boolean sts_rac) {
        this.sts_rac = sts_rac;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVbdi_rac() {
        return vbdi_rac;
    }

    public void setVbdi_rac(String vbdi_rac) {
        this.vbdi_rac = vbdi_rac;
    }

    public Long getId_banke() {
        return id_banke;
    }

    public void setId_banke(Long id_banke) {
        this.id_banke = id_banke;
    }
}
