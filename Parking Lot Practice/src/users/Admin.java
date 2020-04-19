package users;

public class Admin extends Account {
    private String adminID;

    public Admin(String userName, String password, AccountStatus status) {
        super(userName, password, status);
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    @Override
    public boolean resetPassword() {
        return false;
    }
}
