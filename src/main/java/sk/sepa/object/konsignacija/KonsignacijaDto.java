package sk.sepa.object.konsignacija;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KonsignacijaDto {
    @JsonProperty("idGrupeNaloga")
    private Long id;

    public KonsignacijaDto(Long id) {
        this.id = id;
    }

    public KonsignacijaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
