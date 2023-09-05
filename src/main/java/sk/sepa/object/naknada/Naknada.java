package sk.sepa.object.naknada;

import java.math.BigDecimal;

public class Naknada {
    int vrstaNaknade;
    BigDecimal iznosNaknade;

    public Naknada(int vrstaNaknade, BigDecimal iznosNaknade) {
        this.vrstaNaknade = vrstaNaknade;
        this.iznosNaknade = iznosNaknade;
    }

    public Naknada() {
        super();
    }

    public int getVrstaNaknade() {
        return vrstaNaknade;
    }

    public void setVrstaNaknade(int vrstaNaknade) {
        this.vrstaNaknade = vrstaNaknade;
    }

    public BigDecimal getIznosNaknade() {
        return iznosNaknade;
    }

    public void setIznosNaknade(BigDecimal iznosNaknade) {
        this.iznosNaknade = iznosNaknade;
    }
}
