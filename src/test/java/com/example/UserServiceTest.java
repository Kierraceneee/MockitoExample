package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Test
    public void testGetUserById(){
        // created mock object
        UserDao userDao = mock(UserDao.class);

        // defined with stubbing
        User userTest = new User(88362, "Katherine");
        when(userDao.getUserById(88362)).thenReturn(userTest);

        // instance of userService with insert
        UserService userService = new UserService(userDao);

        // method called to be tested
        User user = userService.getUserById(88362);

        // Verifying Conditions
        assertNotNull(user);
        assertEquals(88362, user.getId());
        assertEquals("Katherine", user.getName());

    }
}
