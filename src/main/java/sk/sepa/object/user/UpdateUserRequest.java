package sk.sepa.object.user;

public class UpdateUserRequest {
    private String email;
    private User updatedUserData;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUpdatedUserData() {
        return updatedUserData;
    }

    public void setUpdatedUserData(User updatedUserData) {
        this.updatedUserData = updatedUserData;
    }
}

