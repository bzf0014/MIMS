package Accounts.MedicalPersonnel;

import Accounts.Account;

public class LabTech extends Account {

    public LabTech(String username, String password) {
        super(AccountType.LabTech, username, password);
    }
}
