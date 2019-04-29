package Accounts.MedicalPersonnel;

import Accounts.Account;

public class Doctor extends Account {

    public Doctor(AccountType accountType, String username, String password) {
        super(accountType, username, password);
    }

    public boolean addPrescription() {
        return true;
    }
}
