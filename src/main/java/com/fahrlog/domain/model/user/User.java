package com.fahrlog.domain.model.user;

public class User {
    private String login;
    private int birthday;
    private long id;
    private UserStatus status;

    public User(String login) {
        this.login = login;
        this.status = UserStatus.NOTACTIVE;
    }

    public void block() {
        this.status = UserStatus.BLOCK; 
    }
    public void active() {
        this.status = UserStatus.ACTIVE; 
    }
    public void notactive() {
        this.status = UserStatus.NOTACTIVE; 
    }
    public long GetId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public UserStatus getStatus() {
        return status;
    }
    public int getAge(){
        return birthday;
    }
}
