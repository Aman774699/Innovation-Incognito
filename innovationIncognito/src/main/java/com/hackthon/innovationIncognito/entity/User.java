package com.hackthon.innovationIncognito.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Userid;
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @NotBlank
    private String conformPassword;
    @NotBlank
    @Column(unique = true)
    private String email;
    @Column(length = 10)
    private String phoneNumber;
    @OneToMany
    private List<Solvedstatus> solvedstatus;
    private String Profilephoto;
    public Integer getUserid() {
        return Userid;
    }

    public void setUserid(Integer userid) {
        Userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConformPassword() {
        return conformPassword;
    }

    public void setConformPassword(String conformPassword) {
        this.conformPassword = conformPassword;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(Integer userid, String userName, String password, String conformPassword, String firstName, String email, String phoneNumber) {
        Userid = userid;
        this.userName = userName;
        this.password = password;
        this.conformPassword = conformPassword;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public User() {
    }
}
