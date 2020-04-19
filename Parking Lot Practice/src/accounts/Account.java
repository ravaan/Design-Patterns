package accounts;

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;

    public Account() {
        this.userName = "userName";
        this.password = "password";
        this.status = AccountStatus.ACTIVE;
    }

    Account(String userName, String password, AccountStatus status) {
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public abstract boolean resetPassword();
}
