package sk.sepa.object.nalog;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="nalog")
public class Nalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long id_grupe_naloga;
    Long id_user;
    Long id_banke;
    String tip_naloga;
    String valuta_placanja;
    BigDecimal iznos;
    String ime_plat;
    String adresa_plat;
    String mjesto_plat;
    String ime_prim;
    String adresa_prim;
    String mjesto_prim;
    int sif_opis_plac;
    String sif_namjene;
    Date dat_izvrsenja;
    Date dat_podnosenja;
    String drzava_plat;
    String kontrolni_broj_plat;
    String iban_plat;
    String model_plat;
    String pnb_plat;
    String drzava_prim;
    String kontrolni_broj_prim;
    String iban_prim;
    String model_prim;
    String pnb_prim;
    String opis_plac;
    int br_blagajne;
    int vr_naknade;
    BigDecimal iznos_naknade;

    public Nalog(Long id, Long id_grupe_naloga, Long id_user, Long id_banke, String tip_naloga, String valuta_placanja, BigDecimal iznos, String ime_plat, String adresa_plat, String mjesto_plat, String ime_prim, String adresa_prim, String mjesto_prim, int sif_opis_plac, String sif_namjene, Date dat_izvrsenja, Date dat_podnosenja, String drzava_plat, String kontrolni_broj_plat, String iban_plat, String model_plat, String pnb_plat, String drzava_prim, String kontrolni_broj_prim, String iban_prim, String model_prim, String pnb_prim, String opis_plac, int br_blagajne, int vr_naknade, BigDecimal iznos_naknade) {
        this.id = id;
        this.id_grupe_naloga = id_grupe_naloga;
        this.id_user = id_user;
        this.id_banke = id_banke;
        this.tip_naloga = tip_naloga;
        this.valuta_placanja = valuta_placanja;
        this.iznos = iznos;
        this.ime_plat = ime_plat;
        this.adresa_plat = adresa_plat;
        this.mjesto_plat = mjesto_plat;
        this.ime_prim = ime_prim;
        this.adresa_prim = adresa_prim;
        this.mjesto_prim = mjesto_prim;
        this.sif_opis_plac = sif_opis_plac;
        this.sif_namjene = sif_namjene;
        this.dat_izvrsenja = dat_izvrsenja;
        this.dat_podnosenja = dat_podnosenja;
        this.drzava_plat = drzava_plat;
        this.kontrolni_broj_plat = kontrolni_broj_plat;
        this.iban_plat = iban_plat;
        this.model_plat = model_plat;
        this.pnb_plat = pnb_plat;
        this.drzava_prim = drzava_prim;
        this.kontrolni_broj_prim = kontrolni_broj_prim;
        this.iban_prim = iban_prim;
        this.model_prim = model_prim;
        this.pnb_prim = pnb_prim;
        this.opis_plac = opis_plac;
        this.br_blagajne = br_blagajne;
        this.vr_naknade = vr_naknade;
        this.iznos_naknade = iznos_naknade;
    }

    public Nalog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_grupe_naloga() {
        return id_grupe_naloga;
    }

    public void setId_grupe_naloga(Long id_grupe_naloga) {
        this.id_grupe_naloga = id_grupe_naloga;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_banke() {
        return id_banke;
    }

    public void setId_banke(Long id_banke) {
        this.id_banke = id_banke;
    }

    public String getTip_naloga() {
        return tip_naloga;
    }

    public void setTip_naloga(String tip_naloga) {
        this.tip_naloga = tip_naloga;
    }

    public String getValuta_placanja() {
        return valuta_placanja;
    }

    public void setValuta_placanja(String valuta_placanja) {
        this.valuta_placanja = valuta_placanja;
    }

    public BigDecimal getIznos() {
        return iznos;
    }

    public void setIznos(BigDecimal iznos) {
        this.iznos = iznos;
    }

    public String getIme_plat() {
        return ime_plat;
    }

    public void setIme_plat(String ime_plat) {
        this.ime_plat = ime_plat;
    }

    public String getAdresa_plat() {
        return adresa_plat;
    }

    public void setAdresa_plat(String adresa_plat) {
        this.adresa_plat = adresa_plat;
    }

    public String getMjesto_plat() {
        return mjesto_plat;
    }

    public void setMjesto_plat(String mjesto_plat) {
        this.mjesto_plat = mjesto_plat;
    }

    public String getIme_prim() {
        return ime_prim;
    }

    public void setIme_prim(String ime_prim) {
        this.ime_prim = ime_prim;
    }

    public String getAdresa_prim() {
        return adresa_prim;
    }

    public void setAdresa_prim(String adresa_prim) {
        this.adresa_prim = adresa_prim;
    }

    public String getMjesto_prim() {
        return mjesto_prim;
    }

    public void setMjesto_prim(String mjesto_prim) {
        this.mjesto_prim = mjesto_prim;
    }

    public int getSif_opis_plac() {
        return sif_opis_plac;
    }

    public void setSif_opis_plac(int sif_opis_plac) {
        this.sif_opis_plac = sif_opis_plac;
    }

    public String getSif_namjene() {
        return sif_namjene;
    }

    public void setSif_namjene(String sif_namjene) {
        this.sif_namjene = sif_namjene;
    }

    public Date getDat_izvrsenja() {
        return dat_izvrsenja;
    }

    public void setDat_izvrsenja(Date dat_izvrsenja) {
        this.dat_izvrsenja = dat_izvrsenja;
    }

    public Date getDat_podnosenja() {
        return dat_podnosenja;
    }

    public void setDat_podnosenja(Date dat_podnosenja) {
        this.dat_podnosenja = dat_podnosenja;
    }

    public String getDrzava_plat() {
        return drzava_plat;
    }

    public void setDrzava_plat(String drzava_plat) {
        this.drzava_plat = drzava_plat;
    }

    public String getKontrolni_broj_plat() {
        return kontrolni_broj_plat;
    }

    public void setKontrolni_broj_plat(String kontrolni_broj_plat) {
        this.kontrolni_broj_plat = kontrolni_broj_plat;
    }

    public String getIban_plat() {
        return iban_plat;
    }

    public void setIban_plat(String iban_plat) {
        this.iban_plat = iban_plat;
    }

    public String getModel_plat() {
        return model_plat;
    }

    public void setModel_plat(String model_plat) {
        this.model_plat = model_plat;
    }

    public String getPnb_plat() {
        return pnb_plat;
    }

    public void setPnb_plat(String pnb_plat) {
        this.pnb_plat = pnb_plat;
    }

    public String getDrzava_prim() {
        return drzava_prim;
    }

    public void setDrzava_prim(String drzava_prim) {
        this.drzava_prim = drzava_prim;
    }

    public String getKontrolni_broj_prim() {
        return kontrolni_broj_prim;
    }

    public void setKontrolni_broj_prim(String kontrolni_broj_prim) {
        this.kontrolni_broj_prim = kontrolni_broj_prim;
    }

    public String getIban_prim() {
        return iban_prim;
    }

    public void setIban_prim(String iban_prim) {
        this.iban_prim = iban_prim;
    }

    public String getModel_prim() {
        return model_prim;
    }

    public void setModel_prim(String model_prim) {
        this.model_prim = model_prim;
    }

    public String getPnb_prim() {
        return pnb_prim;
    }

    public void setPnb_prim(String pnb_prim) {
        this.pnb_prim = pnb_prim;
    }

    public String getOpis_plac() {
        return opis_plac;
    }

    public void setOpis_plac(String opis_plac) {
        this.opis_plac = opis_plac;
    }

    public int getBr_blagajne() {
        return br_blagajne;
    }

    public void setBr_blagajne(int br_blagajne) {
        this.br_blagajne = br_blagajne;
    }

    public int getVr_naknade() {
        return vr_naknade;
    }

    public void setVr_naknade(int vr_naknade) {
        this.vr_naknade = vr_naknade;
    }

    public BigDecimal getIznos_naknade() {
        return iznos_naknade;
    }

    public void setIznos_naknade(BigDecimal iznos_naknade) {
        this.iznos_naknade = iznos_naknade;
    }
}
