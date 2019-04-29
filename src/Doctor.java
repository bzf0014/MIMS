public class Doctor extends MedicalPersonnel {

    public Doctor(Permission permission, String username, String password) {
        super(permission, username, password);
        this.permission = Permission.fullAccess;
    }

}
