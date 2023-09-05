package sk.sepa.object.naknada;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class NaknadaDto {
    @JsonProperty("ibanRac")
    String ibanRac;

    public NaknadaDto(String ibanRac) {
        this.ibanRac = ibanRac;
    }

    public NaknadaDto() {
        super();
    }

    public String getIbanRac() {
        return ibanRac;
    }

    public void setIbanRac(String ibanRac) {
        this.ibanRac = ibanRac;
    }
}
