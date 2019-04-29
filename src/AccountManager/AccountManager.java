package AccountManager;
import java.util.ArrayList;
import Accounts.*;
import Accounts.ClericalWorker.*;
import Accounts.MedicalPersonnel.*;


public class AccountManager {

    private ArrayList<Account> accountArray = new ArrayList<Account>();

    public boolean sendMessage() {
        return true;
    }

    public boolean createUser(Account.AccountType aT, String username, String password) {
        Account user;
        switch (aT) {
            case Admin:
                user = new Admin(aT, username, password);
                break;
            case LabTech:
                user = new LabTech(aT, username, password);
                break;
            case Pharmacist:
                user = new Pharmacist(aT, username, password);
                break;
            case Radiologist:
                user = new Radiologist(aT, username, password);
                break;
            case Doctor:
                user = new Doctor(aT, username, password);
                break;
            case Receptionist:
                user = new Receptionist(aT, username, password);
                break;
            case Nurse:
                user = new Nurse(aT, username, password);
                break;
            default:
                return false;
        }
        accountArray.add(user);
        return true;
    }

    public boolean addRequest() {
        return true;
    }

    public boolean addPrescription() {
        return true;
    }

    public boolean sendResultForm() {
        return true;
    }

    public boolean delete(Account acc) {
        return accountArray.remove(acc);
    }

    public boolean verifyCredentials() {
        return true;
    }

    public void getInbox(Account acc) {

    }

    public AccountManager instance() {
        return this;
    }


}
