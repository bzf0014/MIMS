package Accounts;

public abstract class Account {

    public String username;
    public String password;
    public AccountType accountType;

    public enum AccountType {
        Admin, LabTech, Pharmacist, Radiologist, Doctor, Receptionist, Nurse
    }

    public Account(AccountType accountType, String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}


