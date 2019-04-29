package Accounts;

public abstract class Account {

    public String username;
    public String password;
    public Permission permission;

    public enum Permission {
        fullAccess, viewAccess, clientFacing ,none;

    }

    public Account(Permission permission, String username, String password) {
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

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}


