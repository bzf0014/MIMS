package Accounts.MedicalPersonnel;

import Accounts.Account;

public class Radiologist extends Account {

    public Radiologist(String username, String password) {
        super(AccountType.Radiologist, username, password);
    }
}
