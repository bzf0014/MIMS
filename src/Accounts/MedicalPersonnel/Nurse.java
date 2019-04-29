package Accounts.MedicalPersonnel;

import Accounts.MedicalPersonnel.MedicalPersonnel;

public class Nurse extends MedicalPersonnel {
    public Nurse(Permission permission, String username, String password) {
        super(permission, username, password);
        this.setPermission(Permission.viewAccess);
    }
}
