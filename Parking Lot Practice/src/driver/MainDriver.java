package driver;


import users.AccountStatus;
import users.Admin;

public class MainDriver {
    public static void main(String[] args) {
        String userName = "DeathStar333";
        String password = "12characters";
        AccountStatus status = AccountStatus.ACTIVE;
        Admin adminAccount = new Admin(userName, password, status);
        System.out.println(adminAccount.getPassword());
        System.out.println(adminAccount.resetPassword());
    }
}
