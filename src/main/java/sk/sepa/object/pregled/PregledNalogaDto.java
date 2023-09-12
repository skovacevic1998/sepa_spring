package sk.sepa.object.pregled;

public class PregledNalogaDto {
    private String username;

    public PregledNalogaDto(String username) {
        this.username = username;
    }

    public PregledNalogaDto() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
