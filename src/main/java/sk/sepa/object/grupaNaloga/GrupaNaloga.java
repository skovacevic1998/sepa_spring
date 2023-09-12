package sk.sepa.object.grupaNaloga;

import jakarta.persistence.*;

@Entity
@Table(name="grupaNaloga")
public class GrupaNaloga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_user;
    private String sts_grupe;
    private String date;

    public GrupaNaloga(Long id, Long id_user, String sts_grupe, String date) {
        this.id = id;
        this.id_user = id_user;
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

    public String getSts_grupe() {
        return sts_grupe;
    }

    public void setSts_grupe(String sts_grupe) {
        this.sts_grupe = sts_grupe;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
