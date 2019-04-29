package Accounts.MedicalPersonnel;

import Accounts.Account;

public class Nurse extends Account {

    public Nurse(String username, String password) {
        super(AccountType.Nurse, username, password);
    }
}
