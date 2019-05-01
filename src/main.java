import AccountManager.AccountManager;
import Accounts.Account;
import Accounts.ClericalWorker.*;
import Accounts.MedicalPersonnel.*;

import java.util.Scanner;

public class main {

    //static Admin admin = new Admin("admin", "password");
    static AccountManager accountManager = new AccountManager();

    public static void main(String[] args) {
        accountManager.createUser(Account.AccountType.Admin, "admin", "password");
        Scanner scan = new Scanner(System.in);
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("==================================");
            System.out.println("          Login to MIMS           ");
            System.out.println("==================================");
            String username = "";
            String password = "";
            System.out.println("Enter your username (case sensitive): ");
            username = scan.nextLine();
            System.out.println("Enter your password (case sensitive): ");
            password = scan.nextLine();
            if (accountManager.verifyCredentials(username, password) == true) {
                loggedIn = true;
                System.out.println("Logging you in...");
            } else {
                System.out.println("Incorrect credentials, please try again... ");
            }
        }
        while (loggedIn) {
            System.out.println("===================");
            System.out.println("        MIMS       ");
            System.out.println("===================");
            // check user's account type using instanceOf(currentUser), then print appropriate menu
            switch(accountManager.currentUser.accountType) {
                //might need different inputs for each user type?
                //below general account options, should be implemented for all accounts besides admin/receptionist
                //	1-> View Patient List
                //	2-> View Chart
                //	3-> Check Inbox
                //	4-> Send Message

                //display appropriate options for each user type (check use case list) -> call appropriate method in case
                // put logout at the end and just change bool loggedin back to false
                case Admin:
                    int input = 0;
                    switch (input) {
                        // 1 -> create account
                        // 2 -> delete account
                        // 3 -> logout
                    }
                    break;
                case LabTech:
                    break;
                case Pharmacist:
                    //pharm's menu
                    break;
                case Radiologist:
                    //radio's menu
                    break;
                case Doctor:
                    //doctor's menu
                    break;
                case Receptionist:
                    //recept's menu
                    break;
                case Nurse:
                    //nurse's menu
                    break;
                default:
                    // should never reach here
                    loggedIn = false;
            }
        }
        // this is going to loop infinitely -> shouldn't do this when menu is built since it will be waiting for input
    }
}

