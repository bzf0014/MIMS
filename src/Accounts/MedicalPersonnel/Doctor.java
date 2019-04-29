package Accounts.MedicalPersonnel;

import Accounts.Account;
import Accounts.MedicalPersonnel.MedicalPersonnel;

public class Doctor extends MedicalPersonnel {

    public Doctor(Permission permission, String username, String password) {
        super(permission, username, password);
        this.permission = Account.Permission.fullAccess;
    }

}
