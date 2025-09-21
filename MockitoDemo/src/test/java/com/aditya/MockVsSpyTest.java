package com.aditya;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockVsSpyTest {

    @Test
    public void testList()
    {
        List<String> listMock = Mockito.mock(ArrayList.class);

        // Used to create a "spy" object, which is a partial mock
        List<String> listSpy = Mockito.spy(ArrayList.class); // Spy on a real object, but here we need to provide a real instance

        listMock.add("Hello");
        Mockito.when(listMock.size()).thenReturn(10);

        listSpy.add("Happy");
        Mockito.when(listSpy.size()).thenReturn(10);

        System.out.println(listMock.size() + " " + listSpy.size());
    }
}
