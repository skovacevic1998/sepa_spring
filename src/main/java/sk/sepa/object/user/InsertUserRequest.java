package sk.sepa.object.user;

public class InsertUserRequest {
    private String imeRegister;
    private String prezimeRegister;
    private String usernameRegister;
    private String lokacijaRegister;
    private String emailRegister;
    private String passwordRegister;
    private String rePasswordRegister;

    public String getImeRegister() {
        return imeRegister;
    }

    public void setImeRegister(String imeRegister) {
        this.imeRegister = imeRegister;
    }

    public String getPrezimeRegister() {
        return prezimeRegister;
    }

    public void setPrezimeRegister(String prezimeRegister) {
        this.prezimeRegister = prezimeRegister;
    }

    public String getUsernameRegister() {
        return usernameRegister;
    }

    public void setUsernameRegister(String usernameRegister) {
        this.usernameRegister = usernameRegister;
    }

    public String getLokacijaRegister() {
        return lokacijaRegister;
    }

    public void setLokacijaRegister(String lokacijaRegister) {
        this.lokacijaRegister = lokacijaRegister;
    }

    public String getEmailRegister() {
        return emailRegister;
    }

    public void setEmailRegister(String emailRegister) {
        this.emailRegister = emailRegister;
    }

    public String getPasswordRegister() {
        return passwordRegister;
    }

    public void setPasswordRegister(String passwordRegister) {
        this.passwordRegister = passwordRegister;
    }

    public String getRePasswordRegister() {
        return rePasswordRegister;
    }

    public void setRePasswordRegister(String rePasswordRegister) {
        this.rePasswordRegister = rePasswordRegister;
    }
}
