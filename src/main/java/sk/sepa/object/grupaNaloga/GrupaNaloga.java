package sk.sepa.object.grupaNaloga;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="grupaNaloga")
public class GrupaNaloga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long id_user;
    BigDecimal iznos_grupe;
    Boolean sts_grupe;
    Date date;

    public GrupaNaloga(Long id, Long id_user, BigDecimal iznos_grupe, Boolean sts_grupe, Date date) {
        this.id = id;
        this.id_user = id_user;
        this.iznos_grupe = iznos_grupe;
        this.sts_grupe = sts_grupe;
        this.date = date;
    }

    public GrupaNaloga(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public BigDecimal getIznos_grupe() {
        return iznos_grupe;
    }

    public void setIznos_grupe(BigDecimal iznos_grupe) {
        this.iznos_grupe = iznos_grupe;
    }

    public Boolean getSts_grupe() {
        return sts_grupe;
    }

    public void setSts_grupe(Boolean sts_grupe) {
        this.sts_grupe = sts_grupe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
