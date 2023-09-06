package sk.sepa.object.nalog;

import sk.sepa.object.grupaNaloga.GrupaNaloga;

public class NalogDtoAndUserIdRequest {
    private NalogDto nalogDto;
    private Long userId;
    private Boolean uplata;
    private Boolean isplata;
    private GrupaNaloga grupaNaloga;

    public Boolean getUplata() {
        return uplata;
    }

    public GrupaNaloga getGrupaNaloga() {
        return grupaNaloga;
    }

    public void setGrupaNaloga(GrupaNaloga grupaNaloga) {
        this.grupaNaloga = grupaNaloga;
    }

    public void setUplata(Boolean upl) {
        uplata = upl;
    }

    public Boolean getIsplata() {
        return isplata;
    }

    public void setIsplata(Boolean ispl) {
        isplata = ispl;
    }

    public NalogDto getNalogDto() {
        return nalogDto;
    }

    public void setNalogDto(NalogDto nalogDto) {
        this.nalogDto = nalogDto;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
