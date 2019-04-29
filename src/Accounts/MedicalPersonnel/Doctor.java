package Accounts.MedicalPersonnel;

import Accounts.Account;

public class Doctor extends Account {

    public Doctor(String username, String password) {
        super(AccountType.Doctor, username, password);
    }

    public boolean addPrescription() {
        return true;
    }
}
