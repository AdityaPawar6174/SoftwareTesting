package com.aditya;

import com.aditya.DAO.ILoginDAO;
import com.aditya.entity.Calculator;
import com.aditya.entity.LoginMgmtServiceImpl;
import com.aditya.service.CalculatorService;
import com.aditya.service.ILoginMgmtService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class) // This annotation is used to enable Mockito annotations in JUnit 5
public class TestCalculator {

//    @InjectMocks // it is used under MockitoExtension to create an instance of the class under test and inject the mocks into it
    Calculator c = null;

    @Mock
    public CalculatorService service;

    @BeforeEach
    public void setup()
    {

        MockitoAnnotations.openMocks(this); // MockitoAnnotations.openMocks(this) initializes all the @Mock annotations in the class
        // Alternatively, you can use Mockito.mock(CalculatorService.class) if not using annotations

        // Create the Calculator instance with the mocked service
        c = new Calculator(service);
    }

    @Test
    public void testPerform()
    {
        Mockito.when(service.add(2, 3)).thenReturn(5);
        Assertions.assertEquals(5, c.perform(2, 3));
    }

    @Test
    public void testRegisterWithSpy()
    {
        ILoginDAO loginDAOSpy = Mockito.spy(ILoginDAO.class);

        ILoginMgmtService loginService = new LoginMgmtServiceImpl(loginDAOSpy);

        loginService.registerUser("Raj", "admin");
        loginService.registerUser("Navin", "visitor");
        loginService.registerUser("John", "");

        Mockito.verify(loginDAOSpy, Mockito.times(1)).addUser("Raj", "admin");
        Mockito.verify(loginDAOSpy, Mockito.times(0)).addUser("Navin", "visitor");
        Mockito.verify(loginDAOSpy, Mockito.never()).addUser("John", ""); // This will fail if the method is

    }

}
