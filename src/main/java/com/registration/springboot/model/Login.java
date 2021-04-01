package com.registration.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class Login {
    private long id;
    private String userName;
    private String password;

    public Login (){

    }

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "username", nullable = false)
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
