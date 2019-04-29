package Accounts.ClericalWorker;

import AccountManager.AccountManager;
import Accounts.Account;

public class Admin extends ClericalWorker {

    public Admin(String username, String password) {
        super(username, password);
    }

    // Give access to AccountManager and call its delete and add methods
    void createAccount(AccountManager accountManager, Account.AccountType aT, String username, String password) {
        accountManager.createUser(aT, username, password);
    }

}
