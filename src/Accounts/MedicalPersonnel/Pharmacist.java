package Accounts.MedicalPersonnel;

import Accounts.MedicalPersonnel.MedicalPersonnel;

public class Pharmacist extends MedicalPersonnel {
    public Pharmacist(Permission permission, String username, String password) {
        super(permission, username, password);
        this.permission = Permission.viewAccess;
    }
}
