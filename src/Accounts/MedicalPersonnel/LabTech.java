package Accounts.MedicalPersonnel;

import Accounts.MedicalPersonnel.MedicalPersonnel;

public class LabTech extends MedicalPersonnel {
    public LabTech(Permission permission, String username, String password) {
        super(permission, username, password);
        this.permission = Permission.none;
    }
}
