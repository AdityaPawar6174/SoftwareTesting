package com.aditya.service;

public interface ILoginMgmtService {

    public boolean login(String username, String password);

//    public int addUser(String user, String role);

    public String registerUser(String user, String role);
}
