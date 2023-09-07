package sk.sepa.object.pregled;

import java.util.List;

public class PregledNaloga {
    private Long idGrNal;
    private String tip;
    private String datum;
    private String stsGrupe;
    private List<GrNal> grNal;

    public PregledNaloga(Long idGrNal, String tip, String datum, String stsGrupe, List<GrNal> grNal) {
        this.idGrNal = idGrNal;
        this.tip = tip;
        this.datum = datum;
        this.stsGrupe = stsGrupe;
        this.grNal = grNal;
    }

    public PregledNaloga() {
        super();
    }

    public Long getIdGrNal() {
        return idGrNal;
    }

    public void setIdGrNal(Long idGrNal) {
        this.idGrNal = idGrNal;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getStsGrupe() {
        return stsGrupe;
    }

    public void setStsGrupe(String stsGrupe) {
        this.stsGrupe = stsGrupe;
    }

    public List<GrNal> getGrNal() {
        return grNal;
    }

    public void setGrNal(List<GrNal> grNal) {
        this.grNal = grNal;
    }
}
