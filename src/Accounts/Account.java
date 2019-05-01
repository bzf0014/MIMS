package Accounts;

import Inbox.Inbox;

import java.util.ArrayList;

public abstract class Account {

    public String username;
    public String password;
    public AccountType accountType;
    public Boolean loggedIn = false;
    public String presciption;
    public Inbox inbox;

    public enum AccountType {
        Admin, LabTech, Pharmacist, Radiologist, Doctor, Receptionist, Nurse
    }

    public Account(AccountType accountType, String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
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

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }
}


