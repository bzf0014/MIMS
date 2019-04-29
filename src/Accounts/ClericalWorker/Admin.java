package Accounts.ClericalWorker;

public class Admin extends ClericalWorker {

    public Admin(Permission permission, String username, String password) {
        super(permission, username, password);
    }

    // Give access to AccountManager and call its delete and add methods


}
