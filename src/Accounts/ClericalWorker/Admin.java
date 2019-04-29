package Accounts.ClericalWorker;

import AccountManager.AccountManager;
import Accounts.Account;

public class Admin extends Account {

    public Admin(String username, String password) {
        super(AccountType.Admin, username, password);
    }

    public void createAccount(AccountManager accountManager, Account.AccountType aT, String username, String password) {
        accountManager.createUser(aT, username, password);
    }

}
