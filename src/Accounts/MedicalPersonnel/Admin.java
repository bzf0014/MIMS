package Accounts.MedicalPersonnel;

import AccountManager.AccountManager;
import Accounts.Account;

public class Admin extends Account {

    public Admin(AccountType accountType, String username, String password) {
        super(accountType, username, password);
    }

    void createAccount(AccountManager accountManager, Account.AccountType aT, String username, String password) {
        accountManager.createUser(aT, username, password);
    }

}
