package com.aditya.DAO;

public interface ILoginDAO {
    public int authenticate(String user, String password);

    public void addUser(String user, String role);

//    public String registerUser(String user, String role);
}
