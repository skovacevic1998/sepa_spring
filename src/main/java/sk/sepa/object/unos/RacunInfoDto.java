package sk.sepa.object.unos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RacunInfoDto {
    @JsonProperty("drzavaRac")
    private String drzavaRac; // Update the field name

    @JsonProperty("kontrolniBrojRac")
    private String kontrolniBrojRac; // Update the field name

    @JsonProperty("ibanRac")
    private String ibanRac; // Update the field name

    public RacunInfoDto(String drzavaRac, String kontrolniBrojRac, String ibanRac) {
        this.drzavaRac = drzavaRac;
        this.kontrolniBrojRac = kontrolniBrojRac;
        this.ibanRac = ibanRac;
    }

    public RacunInfoDto() {
        super();
    }

    public String getDrzava() {
        return drzavaRac;
    }

    public void setDrzava(String drzavaRac) {
        this.drzavaRac = drzavaRac;
    }

    public String getKontrolniBroj() {
        return kontrolniBrojRac;
    }

    public void setKontrolniBroj(String kontrolniBrojRac) {
        this.kontrolniBrojRac = kontrolniBrojRac;
    }

    public String getIban() {
        return ibanRac;
    }

    public void setIban(String ibanRac) {
        this.ibanRac = ibanRac;
    }
}
