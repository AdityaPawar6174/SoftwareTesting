package com.aditya.entity;

import com.aditya.DAO.ILoginDAO;
import com.aditya.service.ILoginMgmtService;

public class LoginMgmtServiceImpl implements ILoginMgmtService {

    public ILoginDAO loginDAO;

    public LoginMgmtServiceImpl(ILoginDAO loginDAO)
    {
        this.loginDAO = loginDAO;
    }

    @Override
    public boolean login(String username, String password) {
        if ((username.equals("")) || (password.equals("")))
            throw new IllegalArgumentException("Username or Password cannot be empty");

        int result = loginDAO.authenticate(username, password);
        if (result == 0)
            return false;
        else
            return true;
    }

    @Override
    public String registerUser(String user, String role) {
        if ((!role.equalsIgnoreCase("")) && (!role.equalsIgnoreCase("visitor")))
        {
            loginDAO.addUser(user, role);
            return "User registered successfully with role: " + role;
        }
        else {
            return  "Username not added";
        }
    }


}
