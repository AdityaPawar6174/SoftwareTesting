package com.aditya;

import com.aditya.DAO.ILoginDAO;
import com.aditya.entity.LoginMgmtServiceImpl;
import com.aditya.service.ILoginMgmtService;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;


public class TestLoginManagement {

    private static ILoginMgmtService loginService;
    private static ILoginDAO loginDAOMock;

    @BeforeAll
    public static void initOnce()
    {
        loginDAOMock = Mockito.mock(ILoginDAO.class);
        loginService = new LoginMgmtServiceImpl(loginDAOMock);
    }

    @AfterAll
    public static void cleanUpOnce()
    {
        loginService = null;
        loginDAOMock = null;
    }

    @Test
    public void testLoginWithValidCredentials()
    {
        Mockito.when(loginDAOMock.authenticate("user1", "root"))
                .thenReturn(1);

        Assertions.assertTrue(loginService.login("user1", "root"));

    }

    @Test
    public void testLoginWithInvalidCredentials()
    {
        Mockito.when(loginDAOMock.authenticate("user1", "root1"))
                        .thenReturn(0);

        Assertions.assertFalse(loginService.login("user1", "root1"));
    }

    @Test
    public void testLoginWithEmptyCredentials()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            loginService.login("", "");
        });
    }
}
