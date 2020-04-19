package driver;


import accounts.AccountStatus;
import accounts.Admin;
import parking.LargeSpot;

public class MainDriver {
    public static void main(String[] args) {
        String userName = "DeathStar333";
        String password = "12characters";
        AccountStatus status = AccountStatus.ACTIVE;
        Admin adminAccount = new Admin(userName, password, status);
        System.out.println(adminAccount.getPassword());
        System.out.println(adminAccount.resetPassword());


        // Parking Spot testing
        LargeSpot spot = new LargeSpot("1234");
        spot.setFree(true);
        System.out.println(spot.isFree());
    }
}
