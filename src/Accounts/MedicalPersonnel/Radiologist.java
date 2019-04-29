package Accounts.MedicalPersonnel;

public class Radiologist extends MedicalPersonnel {
    public Radiologist(Permission permission, String username, String password) {
        super(permission, username, password);
        this.permission = Permission.none;
    }
}
