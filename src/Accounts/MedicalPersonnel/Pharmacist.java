package Accounts.MedicalPersonnel;

import Accounts.Account;

public class Pharmacist extends Account {

    public Pharmacist(String username, String password) {
        super(AccountType.Pharmacist, username, password);
    }
}
