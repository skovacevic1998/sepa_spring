package sk.sepa.object.nalog;

public class NalogReduxDto {
    private Long userId;
    private Long idGrupeNaloga;

    public NalogReduxDto(Long userId, Long idGrupeNaloga) {
        this.userId = userId;
        this.idGrupeNaloga = idGrupeNaloga;
    }

    public NalogReduxDto() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getIdGrupeNaloga() {
        return idGrupeNaloga;
    }

    public void setIdGrupeNaloga(Long idGrupeNaloga) {
        this.idGrupeNaloga = idGrupeNaloga;
    }
}
