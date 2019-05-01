package AccountManager;
import java.util.ArrayList;
import Accounts.*;
import Accounts.ClericalWorker.*;
import Accounts.MedicalPersonnel.*;


public class AccountManager {

    private ArrayList<Account> accountArray = new ArrayList<Account>();
    public Account currentUser;

    public boolean sendMessage() {
        return true;
    }

    public boolean createUser(Account.AccountType aT, String username, String password) {
        //Account user = null;
        switch (aT) {
            case Admin:
                Admin userA = new Admin(username, password);
                accountArray.add(userA);
                return true;
            case LabTech:
                LabTech userB = new LabTech(username, password);
                accountArray.add(userB);
                return true;
            case Pharmacist:
                Pharmacist userC = new Pharmacist(username, password);
                accountArray.add(userC);
                return true;
            case Radiologist:
                Radiologist userD = new Radiologist(username, password);
                accountArray.add(userD);
                return true;
            case Doctor:
                Doctor userE = new Doctor(username, password);
                accountArray.add(userE);
                return true;
            case Receptionist:
                Receptionist userF = new Receptionist(username, password);
                accountArray.add(userF);
                return true;
            case Nurse:
                Nurse userG = new Nurse(username, password);
                accountArray.add(userG);
                return true;
            default:
                return false;
        }
    }

    public boolean addRequest() {
        return true;
    }

    public boolean delete(Account acc) {
        for (Account a : accountArray){
            if (a == acc) {
                accountArray.remove(a);
                return true;
            }
        }
        return false;
    }

    public boolean verifyCredentials(String un, String pw) {
      for (int i = 0; i < accountArray.size(); i++) {
          if (accountArray.get(i).username.equals(un) && accountArray.get(i).password.equals(pw)) {
              currentUser = accountArray.get(i);
              return true;
          }
          else {
              return false;
          }
      }
      return false;
    }

    public void getInbox(Account acc) {

    }

    public AccountManager instance() {
        return this;
    }


}
