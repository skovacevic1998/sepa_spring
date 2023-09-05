package sk.sepa.object.nalog;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class NalogDto {
    @JsonProperty("iznos")
    private String iznos;

    @JsonProperty("imePlat")
    private String imePlat;

    @JsonProperty("adresaPlat")
    private String adresaPlat;

    @JsonProperty("mjestoPlat")
    private String mjestoPlat;

    @JsonProperty("imePrim")
    private String imePrim;

    @JsonProperty("adresaPrim")
    private String adresaPrim;

    @JsonProperty("mjestoPrim")
    private String mjestoPrim;

    @JsonProperty("sifOpisPlac")
    private int sifOpisPlac;

    @JsonProperty("sifNamjene")
    private String sifNamjene;

    @JsonProperty("datIzvrsenja")
    private Date datIzvrsenja;

    @JsonProperty("datPodnosenja")
    private Date datPodnosenja;

    @JsonProperty("drzavaRac")
    private String drzavaRac;

    @JsonProperty("ibanPlat")
    private String ibanPlat;

    @JsonProperty("ibanPrim")
    private String ibanPrim;

    @JsonProperty("kontrolniBrojPlat")
    private String kontrolniBrojPlat;

    @JsonProperty("kontrolniBrojPrim")
    private String kontrolniBrojPrim;

    @JsonProperty("modelPlat")
    private String modelPlat;

    @JsonProperty("modelPrim")
    private String modelPrim;

    @JsonProperty("opisPlac")
    private String opisPlac;

    @JsonProperty("pnbPlat")
    private String pnbPlat;

    @JsonProperty("pnbPrim")
    private String pnbPrim;

    @JsonProperty("brBlagajne")
    private int brBlagajne;

    @JsonProperty("vrNaknade")
    private int vrNaknade;

    @JsonProperty("iznosNaknade")
    private BigDecimal iznosNaknade;

    public NalogDto(String iznos, String imePlat, String adresaPlat, String mjestoPlat, String imePrim, String adresaPrim, String mjestoPrim, int sifOpisPlac, String sifNamjene, Date datIzvrsenja, Date datPodnosenja, String drzavaRac, String ibanPlat, String ibanPrim, String kontrolniBrojPlat, String kontrolniBrojPrim, String modelPlat, String modelPrim, String opisPlac, String pnbPlat, String pnbPrim, int brBlagajne, int vrNaknade, BigDecimal iznosNaknade) {
        this.iznos = iznos;
        this.imePlat = imePlat;
        this.adresaPlat = adresaPlat;
        this.mjestoPlat = mjestoPlat;
        this.imePrim = imePrim;
        this.adresaPrim = adresaPrim;
        this.mjestoPrim = mjestoPrim;
        this.sifOpisPlac = sifOpisPlac;
        this.sifNamjene = sifNamjene;
        this.datIzvrsenja = datIzvrsenja;
        this.datPodnosenja = datPodnosenja;
        this.drzavaRac = drzavaRac;
        this.ibanPlat = ibanPlat;
        this.ibanPrim = ibanPrim;
        this.kontrolniBrojPlat = kontrolniBrojPlat;
        this.kontrolniBrojPrim = kontrolniBrojPrim;
        this.modelPlat = modelPlat;
        this.modelPrim = modelPrim;
        this.opisPlac = opisPlac;
        this.pnbPlat = pnbPlat;
        this.pnbPrim = pnbPrim;
        this.brBlagajne = brBlagajne;
        this.vrNaknade = vrNaknade;
        this.iznosNaknade = iznosNaknade;
    }

    public NalogDto() {
        super();
    }

    public String getIznos() {
        return iznos;
    }

    public void setIznos(String iznos) {
        this.iznos = iznos;
    }

    public String getImePlat() {
        return imePlat;
    }

    public void setImePlat(String imePlat) {
        this.imePlat = imePlat;
    }

    public String getAdresaPlat() {
        return adresaPlat;
    }

    public void setAdresaPlat(String adresaPlat) {
        this.adresaPlat = adresaPlat;
    }

    public String getMjestoPlat() {
        return mjestoPlat;
    }

    public void setMjestoPlat(String mjestoPlat) {
        this.mjestoPlat = mjestoPlat;
    }

    public String getImePrim() {
        return imePrim;
    }

    public void setImePrim(String imePrim) {
        this.imePrim = imePrim;
    }

    public String getAdresaPrim() {
        return adresaPrim;
    }

    public void setAdresaPrim(String adresaPrim) {
        this.adresaPrim = adresaPrim;
    }

    public String getMjestoPrim() {
        return mjestoPrim;
    }

    public void setMjestoPrim(String mjestoPrim) {
        this.mjestoPrim = mjestoPrim;
    }

    public int getSifOpisPlac() {
        return sifOpisPlac;
    }

    public void setSifOpisPlac(int sifOpisPlac) {
        this.sifOpisPlac = sifOpisPlac;
    }

    public String getSifNamjene() {
        return sifNamjene;
    }

    public void setSifNamjene(String sifNamjene) {
        this.sifNamjene = sifNamjene;
    }

    public Date getDatIzvrsenja() {
        return datIzvrsenja;
    }

    public void setDatIzvrsenja(Date datIzvrsenja) {
        this.datIzvrsenja = datIzvrsenja;
    }

    public Date getDatPodnosenja() {
        return datPodnosenja;
    }

    public void setDatPodnosenja(Date datPodnosenja) {
        this.datPodnosenja = datPodnosenja;
    }

    public String getDrzavaRac() {
        return drzavaRac;
    }

    public void setDrzavaRac(String drzavaRac) {
        this.drzavaRac = drzavaRac;
    }

    public String getIbanPlat() {
        return ibanPlat;
    }

    public void setIbanPlat(String ibanPlat) {
        this.ibanPlat = ibanPlat;
    }

    public String getIbanPrim() {
        return ibanPrim;
    }

    public void setIbanPrim(String ibanPrim) {
        this.ibanPrim = ibanPrim;
    }

    public String getKontrolniBrojPlat() {
        return kontrolniBrojPlat;
    }

    public void setKontrolniBrojPlat(String kontrolniBrojPlat) {
        this.kontrolniBrojPlat = kontrolniBrojPlat;
    }

    public String getKontrolniBrojPrim() {
        return kontrolniBrojPrim;
    }

    public void setKontrolniBrojPrim(String kontrolniBrojPrim) {
        this.kontrolniBrojPrim = kontrolniBrojPrim;
    }

    public String getModelPlat() {
        return modelPlat;
    }

    public void setModelPlat(String modelPlat) {
        this.modelPlat = modelPlat;
    }

    public String getModelPrim() {
        return modelPrim;
    }

    public void setModelPrim(String modelPrim) {
        this.modelPrim = modelPrim;
    }

    public String getOpisPlac() {
        return opisPlac;
    }

    public void setOpisPlac(String opisPlac) {
        this.opisPlac = opisPlac;
    }

    public String getPnbPlat() {
        return pnbPlat;
    }

    public void setPnbPlat(String pnbPlat) {
        this.pnbPlat = pnbPlat;
    }

    public String getPnbPrim() {
        return pnbPrim;
    }

    public void setPnbPrim(String pnbPrim) {
        this.pnbPrim = pnbPrim;
    }

    public int getBrBlagajne() {
        return brBlagajne;
    }

    public void setBrBlagajne(int brBlagajne) {
        this.brBlagajne = brBlagajne;
    }

    public int getVrNaknade() {
        return vrNaknade;
    }

    public void setVrNaknade(int vrNaknade) {
        this.vrNaknade = vrNaknade;
    }

    public BigDecimal getIznosNaknade() {
        return iznosNaknade;
    }

    public void setIznosNaknade(BigDecimal iznosNaknade) {
        this.iznosNaknade = iznosNaknade;
    }
}
