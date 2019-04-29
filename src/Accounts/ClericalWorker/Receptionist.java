package Accounts.ClericalWorker;

import Accounts.Account;

public class Receptionist extends Account {

    public Receptionist(String username, String password) {
        super(AccountType.Receptionist, username, password);
    }
}
