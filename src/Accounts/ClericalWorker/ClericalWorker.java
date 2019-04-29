package Accounts.ClericalWorker;

import Accounts.Account;

public class ClericalWorker extends Account {

    public ClericalWorker(Permission permission, String username, String password) {
        super(permission, username, password);
        this.permission = Permission.clientFacing;
    }
}
