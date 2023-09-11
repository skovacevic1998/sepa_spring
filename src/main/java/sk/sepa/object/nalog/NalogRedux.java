package sk.sepa.object.nalog;

import java.math.BigDecimal;
import java.util.Date;

public class NalogRedux {
    private Long id;
    private String brRac;
    private BigDecimal iznUpl;
    private BigDecimal iznIspl;
    private String date;
    private String pnb;
    private BigDecimal naknada;
    private int sifOpisPlac;
    private String sifNamjene;
    private String status;

    public NalogRedux(Long id, String brRac, BigDecimal iznUpl, BigDecimal iznIspl, String date, String pnb, BigDecimal naknada, int sifOpisPlac, String sifNamjene, String status) {
        this.id = id;
        this.brRac = brRac;
        this.iznUpl = iznUpl;
        this.iznIspl = iznIspl;
        this.date = date;
        this.pnb = pnb;
        this.naknada = naknada;
        this.sifOpisPlac = sifOpisPlac;
        this.sifNamjene = sifNamjene;
        this.status = status;
    }

    public NalogRedux() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrRac() {
        return brRac;
    }

    public void setBrRac(String brRac) {
        this.brRac = brRac;
    }

    public BigDecimal getIznUpl() {
        return iznUpl;
    }

    public void setIznUpl(BigDecimal iznUpl) {
        this.iznUpl = iznUpl;
    }

    public BigDecimal getIznIspl() {
        return iznIspl;
    }

    public void setIznIspl(BigDecimal iznIspl) {
        this.iznIspl = iznIspl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPnb() {
        return pnb;
    }

    public void setPnb(String pnb) {
        this.pnb = pnb;
    }

    public BigDecimal getNaknada() {
        return naknada;
    }

    public void setNaknada(BigDecimal naknada) {
        this.naknada = naknada;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
