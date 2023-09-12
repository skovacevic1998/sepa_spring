package sk.sepa.object.pregled;

import java.math.BigDecimal;

public class GrNal {
    private String racPrim;
    private String infoRacPrim;
    private String racPlat;
    private String infoRacPlat;
    private int sifOpisPlac;
    private String opisPlac;
    private String sifNamjene;
    private BigDecimal iznosNal;
    private BigDecimal iznosNaknade;
    private String stsNaloga;

    public GrNal(String racPrim, String infoRacPrim, String racPlat, String infoRacPlat, int sifOpisPlac, String opisPlac, String sifNamjene, BigDecimal iznosNal, BigDecimal iznosNaknade, String stsNaloga) {
        this.racPrim = racPrim;
        this.infoRacPrim = infoRacPrim;
        this.racPlat = racPlat;
        this.infoRacPlat = infoRacPlat;
        this.sifOpisPlac = sifOpisPlac;
        this.opisPlac = opisPlac;
        this.sifNamjene = sifNamjene;
        this.iznosNal = iznosNal;
        this.iznosNaknade = iznosNaknade;
        this.stsNaloga = stsNaloga;
    }

    public GrNal() {
        super();
    }

    public String getRacPrim() {
        return racPrim;
    }

    public void setRacPrim(String racPrim) {
        this.racPrim = racPrim;
    }

    public String getInfoRacPrim() {
        return infoRacPrim;
    }

    public void setInfoRacPrim(String infoRacPrim) {
        this.infoRacPrim = infoRacPrim;
    }

    public String getRacPlat() {
        return racPlat;
    }

    public void setRacPlat(String racPlat) {
        this.racPlat = racPlat;
    }

    public String getInfoRacPlat() {
        return infoRacPlat;
    }

    public void setInfoRacPlat(String infoRacPlat) {
        this.infoRacPlat = infoRacPlat;
    }

    public int getSifOpisPlac() {
        return sifOpisPlac;
    }

    public void setSifOpisPlac(int sifOpisPlac) {
        this.sifOpisPlac = sifOpisPlac;
    }

    public String getOpisPlac() {
        return opisPlac;
    }

    public void setOpisPlac(String opisPlac) {
        this.opisPlac = opisPlac;
    }

    public String getSifNamjene() {
        return sifNamjene;
    }

    public void setSifNamjene(String sifNamjene) {
        this.sifNamjene = sifNamjene;
    }

    public BigDecimal getIznosNal() {
        return iznosNal;
    }

    public void setIznosNal(BigDecimal iznosNal) {
        this.iznosNal = iznosNal;
    }

    public BigDecimal getIznosNaknade() {
        return iznosNaknade;
    }

    public void setIznosNaknade(BigDecimal iznosNaknade) {
        this.iznosNaknade = iznosNaknade;
    }

    public String getStsNaloga() {
        return stsNaloga;
    }

    public void setStsNaloga(String stsNaloga) {
        this.stsNaloga = stsNaloga;
    }
}
