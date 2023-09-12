package sk.sepa.object.konsignacija;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KonsignacijaDto {
    @JsonProperty("idGrupeNaloga")
    private Long id;
    @JsonProperty("statusGrupeNaloga")
    private String statusGrupeNaloga;

    public KonsignacijaDto(Long id, String statusGrupeNaloga) {
        this.id = id;
        this.statusGrupeNaloga = statusGrupeNaloga;
    }

    public KonsignacijaDto() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusGrupeNaloga() {
        return statusGrupeNaloga;
    }

    public void setStatusGrupeNaloga(String statusGrupeNaloga) {
        this.statusGrupeNaloga = statusGrupeNaloga;
    }
}
