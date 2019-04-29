package Accounts.ClericalWorker;

import AccountManager.AccountManager;
import Accounts.Account;

public class Admin extends ClericalWorker {

    public Admin(AccountType accountType, String username, String password) {
        super(accountType, username, password);
    }

    void createAccount(AccountManager accountManager, Account.AccountType aT, String username, String password) {
        accountManager.createUser(aT, username, password);
    }

}
