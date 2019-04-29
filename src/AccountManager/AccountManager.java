import java.util.ArrayList;

public class AccountManager {

    ArrayList<Account> accountArray = new ArrayList<Account>();

    enum AccountType {
        Admin, LabTech, Pharmacist, Radiologist, Doctor, Receptionist, Nurse;
    }

    public boolean sendMessage() {
        return true;
    }

    public boolean addUser(AccountType aT, String username, String password, Permission permission) {
        switch (aT) {
            case Admin:
                Admin user = new Admin();
                break;
            case LabTech:
                LabTech user = new LabTech();
                break;
            case Pharmacist:
                Pharmacist user = new Pharmacist();
                break;
            case Radiologist:
                Radiologist user = new Radiologist();
                break;
            case Doctor:
                Doctor user = new Doctor();
                break;
            case Receptionist:
                Receptionist user = new Receptionist();
                break;
            case Nurse:
                Nurse user = new Nurse();
                break;
            default:
                return false;
                break;
        }
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

    public void instance() {

    }


}